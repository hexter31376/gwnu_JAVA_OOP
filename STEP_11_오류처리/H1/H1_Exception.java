import java.io.*;

class ZeroException extends Exception {

}

class OvfException extends Exception {

}

class GetN {
    int get_n() throws IOException, ZeroException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 0) {
            throw new ZeroException();
        }
        return n;
    }
}

class AddN {
    GetN gn;

    AddN(GetN gn) {
        this.gn = gn;
    }

    int get_addn() throws IOException, ZeroException, OvfException {
        int n = gn.get_n();
        n = n + 1;
        if (n > 5) {
            throw new OvfException();
        }
        return n;
    }
}

class H1_Exception {
    public static void main(String[] args) {
        AddN adn = new AddN(new GetN());
        try {
            int n = adn.get_addn();
            System.out.print(n);
        } catch (ZeroException e) {
            System.out.println("ZeroException");
        } catch (OvfException e) {
            System.out.println("OvfException");
        } catch (IOException e) {
        }
    }
}