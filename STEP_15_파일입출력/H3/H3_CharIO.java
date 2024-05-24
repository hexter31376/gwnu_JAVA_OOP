import java.io.*;

public class H3_CharIO {
    public static void main (String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for output");
            System.exit(1);
        }
        System.out.println("IO_31...");

        try {
            char ch1 = 'A', ch2 = 'B', ch3 = 'C', ch4 = 'x', ch5 = 'y', ch6 = 'z';
            fw.write(ch1); fw.write(ch2); fw.write(ch3); fw.write(ch4); fw.write(ch5); fw.write(ch6);

            //fw.flush;
            fw.close();
        } catch (IOException e) {
            System.err.println("Character write error...");
            System.exit(2);
        }

        FileReader fr = null;
        try {
            fr = new FileReader("data.txt");
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for input");
            System.exit(1);
        }
        System.out.println("IO_32...");
        
        try {
            char[] chs = new char[6];
            fr.read(chs, 0, 6);
            System.out.printf("%c %c %c %c %c %c\n", chs[0], chs[1], chs[2], chs[3], chs[4], chs[5]);
            fr.close();
        } catch (IOException e) {
            System.err.println("Character write error...");
            System.exit(2);
        }
    }
}
