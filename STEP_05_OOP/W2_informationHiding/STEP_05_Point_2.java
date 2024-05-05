import java.io.*;

class Point_2 { // 좌표 클래스
    int x; // x좌표
    int y; // y좌표

    void set_xy(int x, int y){ // x와 y좌표 입력받는 메소드
        if (x < 0){
            System.err.println("Value of x is invalid");
        } else if (y < 0){
            System.err.println("Value of y is invalid");
        } else {
            this.x = x;
            this.y = y;
        }
    }

    void set_x(int x){ // x좌표 입력받는 메소드
        if (x < 0){
            System.err.println("Value of x is invalid");
        } else {
            this.x = x;
        }
    }

    void set_y(int y){ // y좌표 입력받는 메소드
        if (y < 0){
            System.err.println("Value of y is invalid");
        } else {
            this.y = y;
        }
    }

    int get_x(){ // x좌표 반환
        return x;
    }

    int get_y(){ // y좌표 반환
        return y;
    }
}

class STEP_05_Point_2 {
    public static void main(String[] args) throws IOException{
        Point_2 pnt1, pnt2; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 pnt1, pnt2 선언
        int x1, y1, x2, y2; // 사용자에게 입력받을 정수 x1, y1, x2, y2 선언
        double dl;

        x1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        pnt1 = new Point_2(); // Point_2 클래스 형태의 객체를 생성하고 그 객체를 pnt1에 할당
        pnt1.set_xy(x1, y1); // set_xy로 pnt1 객체의 x, y필드를 각각 설정

        pnt2 = new Point_2(); // Point_2 클래스 형태의 객체를 생성하고 그 객체를 pnt2에 할당
        pnt2.set_xy(x2, y2); // set_xy로 pnt1 객체의 x, y필드를 각각 설정 

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(), 2) + Math.pow(pnt1.get_y() - pnt2.get_y(), 2)); // 선분의 길이 구하고 dl에 저장

        System.out.printf("dl = %f\n", dl); // 선분의 길이 출력
    }
}