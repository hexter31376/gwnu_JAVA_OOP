import java.io.*;

public class H3_CharIO {
    public static void main (String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("data.txt");
            bw = new BufferedWriter(fw);
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for output");
            System.exit(1);
        }
        System.out.println("IO_41...");

        try {
            char str1 = "ABC", str2 = "XYZ", ch3 = "I am happy";
            bw.write(str1); bw.write(str1); 
            bw.newLine();
            bw.write(str1);

            bw.close();
        } catch (IOException e) {
            System.err.println("Character write error...");
            System.exit(2);
        }

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("data.txt");
            br = new BufferedReader(fr);
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for input");
            System.exit(1);
        }
        System.out.println("IO_42...");
        
        try {
            String str1, str2, str3;
            fr.read(chs, 0, 6);
            System.out.printf("%c %c %c %c %c %c\n");
            fr.close();
        } catch (IOException e) {
            System.err.println("Character write error...");
            System.exit(2);
        }
    }
}
