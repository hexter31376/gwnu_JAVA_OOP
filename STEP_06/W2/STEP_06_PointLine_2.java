import java.io.*;

class STEP_06_PointLine_2 {

    class Point_2 {
        int x;
        int y;

        // 객체 생성자
        Point_1(int x, int y){
            this.x = x; this.y = y;
        }
        // Point 클래스의 필드값을 위 메소드에서 지정하는 값으로 변경
        void set_xy(int x, int y){
            this.x = x; this.y = y;
        }

        //호출시 x와 y값을 다르게 설정할 변수 선언
        void set_x(int x){ this.x = x; }
        void set_y(int y){ this.y = y; }

        //지금까지 저장된 x와 y필드값을 출력
        int get_x(){ return x; }
        int get_y(){ return y; }
    }

    class Line_2 extends Point_2 {
        int a, b;

        Line_1(int x, int y, int a, int b) {
            super(x, y); //this.x = x; this.y = y;와 같음
            this.a = a; this.b = b;
        }

        void set_ab(int a, int b){
            this.a = a; this.b = b;
        }

        //호출시 x와 y값을 다르게 설정할 변수 선언
        void set_a(int a){ this.a = a; }
        void set_b(int b){ this.b = b; }
        
        //지금까지 저장된 x와 y필드값을 출력
        int get_a(){ return a; }
        int get_b(){ return b; }

        double get_dl {
            
        }
    }

    public static void main(String[] args) throws IOException {
        int x, y, a, b;

        x = System.in.read() -'0';
        y = System.in.read() -'0';
        a = System.in.read() -'0';
        b = System.in.read() -'0';

    }
}