import java.io.*;
class Point_4 {
    int x;
    int y;

    Point_4(){
        x = 9; y = 9;
    }
    Point_4(int x, int y){
        this.x = x; this.y = y;
    }
    Point_4(int x){
        this.x = x; this.y = 9;
    }

    void set_xy(int x, int y){
        this.x = x; this.y = y;
    }
    void set_x(int x){
        this.x = x; y = 9;
    }
    void set_y(int y){
        this.y = y; x = 9;
    }
    int get_x(){
        return x;
    }
    int get_y(){
        return y;
    }
}

public class STEP_05_Point_4 {
    public static void main(String[] args) throws IOException {
        Point_4 pnt1, pnt2, pnt3;
        int x, y;

        x = System.in.read() -'0';
        y = System.in.read() -'0';

        pnt1 = new Point_4();
        pnt2 = new Point_4(x, y);
        pnt3 = new Point_4(7); // x만 요구하므로 x가 요구하는 '값'을 넣어줌

        System.out.printf("%d %d %d\n", pnt1.get_x(), pnt2.get_x(), pnt3.get_x());
    }
}
