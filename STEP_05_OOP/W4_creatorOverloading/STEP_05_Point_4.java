import java.io.*;

class Point_4 { // 좌표 클래스
    int x; // x좌표
    int y; // y좌표

    Point_4(){ // 아무것도 입력받지 않을때의 객체 생성자 Point_4 정의
        x = 9;
        y = 9;
    }

    Point_4(int x, int y){ // x와 y 입력받을때의 객체 생성자 Point_4 정의
        set_xy(x, y);
    }

    Point_4(int x){ // x만 입력받을때의 객체 생성자 Point_4 정의
        this.x = x;
        this.y = 9;
    }


    void set_xy(int x, int y){ // x와 y좌표 입력받는 메소드
        this.x = x;
        this.y = y;
    }

    void set_x(int x){ // x좌표 입력받는 메소드
        this.x = x;
        y = 9;
    }

    void set_y(int y){ // y좌표 입력받는 메소드
        this.y = y;
        x = 9;
    }

    int get_x(){ // x좌표 반환
        return x;
    }

    int get_y(){ // y좌표 반환
        return y;
    }
}

class STEP_05_Point_4 {
    public static void main(String[] args) throws IOException{
        Point_4 pnt1, pnt2, pnt3; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 pnt1, pnt2, pnt3 선언
        int x, y; // 사용자에게 입력받을 정수 x, y선언
        double dl; // 선분의 길이 dl 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        pnt1 = new Point_4(); // Point_4 클래스 형태의 객체를 생성하고 그 객체를 pnt1에 할당 초기값으로 아무것도 주지 않는다.
        pnt2 = new Point_4(x, y); // Point_4 클래스 형태의 객체를 생성하고 그 객체를 pnt2에 할당 초기값으로 x와 y 할당
        pnt3 = new Point_4(7); // Point_4 클래스 형태의 객체를 생성하고 그 객체를 pnt2에 할당 초기값 7 할당

        System.out.printf("%d %d %d\n", pnt1.get_x(), pnt2.get_x(), pnt3.get_x()); // 각 객체의 x좌표값 출력
    }
}