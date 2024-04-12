import java.io.*;
package line;

class H1_PointLine{
    public static void main(String[] args) throws IOException {

        int a, b, x, y;
        double dl;

        x = System.in.read() -'0'; y = System.in.read() -'0';
        a = System.in.read() -'0'; b = System.in.read() -'0';

        Line ln = new Line(x, y, a, b);

        dl = ln.get.dl();
        System.out.printf("dl = %f\n", dl);
    }
}