import java.io.*;

class Point_3 { // 좌표 클래스
    int x; // x좌표
    int y; // y좌표

    Point_3(int x, int y){ // 객체 생성자 Point_3 정의
        set_xy(x, y);
    }

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

class STEP_05_Point_3 {
    public static void main(String[] args) throws IOException{
        Point_3 pnt1, pnt2; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 pnt1, pnt2 선언
        int x1, y1, x2, y2; // 사용자에게 입력받을 정수 x1, y1, x2, y2 선언
        double dl; // 선분의 길이 dl 선언

        x1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        pnt1 = new Point_3(x1, y1); // Point_3 클래스 형태의 객체를 생성하고 그 객체를 pnt1에 할당 초기값으로 x1과 y1 할당
        pnt2 = new Point_3(x2, y2); // Point_3 클래스 형태의 객체를 생성하고 그 객체를 pnt2에 할당 초기값으로 x2와 y2 할당

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(), 2) + Math.pow(pnt1.get_y() - pnt2.get_y(), 2)); // 선분의 길이 구하고 dl에 저장

        System.out.printf("dl = %f\n", dl); // 선분의 길이 출력
    }
}