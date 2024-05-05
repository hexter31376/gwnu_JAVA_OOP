import java.io.*;

class Point_2 {
    int x; // x좌표
    int y; // y좌표

    Point_2(int x, int y){ // x와 y 입력받을때의 객체 생성자 Point_4 정의
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

class Line_2 extends Point_2 { // Point_1클래스를 상속받은 Line_1클래스 정의
    int a, b;

    Line_2(int x, int y, int a, int b){ // 부모 클래스 필드 x와 y, 자식 클래스(지금 이 클래스) 필드 a, b 입력받을때의 객체 생성자 Point_4 정의
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

    double get_dl(){ // 선분의 길이 반환
        double dl;
        dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2)); // 선분의 길이 구하고 dl에 저장
        return (dl);
    }

    boolean equalTo(Line_2 ln) { // 다른 Line_2클래스로 생성된 메소드와 필드값이 같은지를 반환하는 메소드
        if (ln.get_x() == x && ln.get_y() == y && ln.get_a() == a && ln.get_b() == b){ // 모든 좌표값이 같으면
            return(true);
        } else {
            return(false);
        }
    }

    static boolean compareTwo(Line_2 ln1, Line_2 ln2){ // Line_2 객체끼리 같은지를 반환하는 메소드
        if (ln1.get_x() == ln2.get_x() && ln1.get_y() == ln2.get_y() && ln1.get_a() == ln2.get_a() && ln1.get_b() == ln2.get_b()){ // 모든 좌표값이 같으면
            return(true);
        } else {
            return(false);
        }
    }
}

class STEP_06_PointLine_2 {
    public static void main(String[] args) throws IOException{
        int x, y, a, b; // 사용자에게 입력받을 정수 x, y, a, b 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        Line_2 line1 = new Line_2(x, y, a, b); // Line_2 클래스 형태의 객체를 생성하고 그 객체를 line1에 할당, 초기값으로 x, y, a, b를 넘겨준다
        Line_2 line2 = new Line_2(a, b, x, y); // Line_2 클래스 형태의 객체를 생성하고 그 객체를 line2에 할당, 초기값으로 a, b, x, y를 넘겨준다

        double dl1 = line1.get_dl(); // line1 객체의 선분 길이 얻기
        double dl2 = line2.get_dl(); // line2 객체의 선분 길이 얻기

        boolean b1 = line1.equalTo(line2); // line1 자기 자신과 line2가 같은지 비교
        boolean b2 = Line_2.compareTwo(line1, line2); // Line_2 클래스를 바로 생성하고 line1, line2를 매개변수로 주어서 비교

        System.out.printf("dl1 = %f, dl2 = %f, b1 = %b, b2 = %b\n", dl1, dl2, b1, b2); // dl1, dl2, b1, b2 출력
    }
}
