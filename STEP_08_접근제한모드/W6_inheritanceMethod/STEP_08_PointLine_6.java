import java.io.*;

class STEP_08_PointLine_6 {
    public static void main(String[] args) throws IOException{
        Line_6 line; // line 패키지의 Line_5 클래스 형태의 객체지시자 line 생성
        int x, y, a, b; // 사용자에게 입력받을 정수 x, y, a, b 선언
        double dl; // 선분의 길이 dl

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        line = new Line_6(x, y, a, b); // line 패키지의 Line_5 클래스 형태의 객체를 생성, 초기값으로 x, y, a, b 넘겨주기

        dl = line.get_dl(); // 선분의 길이 저장

        System.out.printf("dl = %f\n", dl); // dl 출력
    }
}

// 부모 클래스의 필드가 private로 선언되어 있으면 그 필드로의 접근이 허용되지 않습니다.
// public으로 되어있는 get_x(), get_y() 메소드로 접근해서 조작해야 합니다.
// public 접근권한이 걸려있는 get_x(), get_y() 메소드로 접근해서 성공적으로 작동한 모습을 볼 수 있습니다.