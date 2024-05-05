import java.io.*;

class Point_1 {
    int x; // x좌표
    int y; // y좌표

    Point_1(int x, int y){ // x와 y 입력받을때의 객체 생성자 Point_4 정의
        this.x = x;
        this.y = y;
    }

    void set_xy(int x, int y){ // x와 y좌표 입력받는 메소드
        this.x = x;
        this.y = y;
    }

    void set_x(int x){ // x좌표 입력받는 메소드
        this.x = x;
    }

    void set_y(int y){ // y좌표 입력받는 메소드
        this.y = y;
    }

    int get_x(){ // x좌표 반환
        return x;
    }

    int get_y(){ // y좌표 반환
        return y;
    }
}

class Line_1 extends Point_1 { // Point_1클래스를 상속받은 Line_1클래스 정의
    int a, b;

    Line_1(int x, int y, int a, int b){ // 부모 클래스 필드 x와 y, 자식 클래스(지금 이 클래스) 필드 a, b 입력받을때의 객체 생성자 Point_4 정의
        super(x, y); // this.x = x this.y = y와 동치이나 필드 x와 y는 부모 클래스의 내용이므로 super메소드를 이용해 설정해 주어야 합니다.
        this.a = a;
        this.b = b;
    }

    void set_ab(int a, int b){ // a와 b좌표 입력받는 메소드
        this.a = a;
        this.b = b;
    }

    void set_a(int a){ // a좌표 입력받는 메소드
        this.a = a;
    }

    void set_y(int b){ // b좌표 입력받는 메소드
        this.b = b;
    }

    int get_a(){ // a좌표 반환
        return a;
    }

    int get_b(){ // b좌표 반환
        return b;
    }
}

class STEP_06_PointLine_1 {
    public static void main(String[] args) throws IOException{
        Line_1 line; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 line 선언
        int x, y, a, b; // 사용자에게 입력받을 정수 x, y, a, b 선언
        double dl; // 선분의 길이를 저장할 dl 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        line = new Line_1(x, y, a, b); // Line_1 클래스 형태의 객체를 생성하고 그 객체를 line에 할당, 초기값으로 x, y, a, b를 넘겨준다
        
        dl = Math.sqrt(Math.pow(line.get_x() - line.get_a(), 2) + Math.pow(line.get_y() - line.get_b(), 2)); // 선분의 길이 구하고 dl에 저장

        System.out.printf("dl = %f", dl); // 선분의 길이 출력
    }
}
