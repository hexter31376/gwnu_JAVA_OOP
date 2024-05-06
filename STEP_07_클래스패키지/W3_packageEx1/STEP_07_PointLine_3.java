import java.io.*;

class STEP_07_PointLine_3 {
    public static void main(String[] args) throws IOException{
        line.Line_3 line; // line 패키지의 Line_3 클래스 형태의 객체지시자 line 생성
        int x, y, a, b; // 사용자에게 입력받을 정수 x, y, a, b 선언
        double dl; // 선분의 길이 dl

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        line = new line.Line_3(x, y, a, b); // line 패키지의 Line_3 클래스 형태의 객체를 생성, 초기값으로 x, y, a, b 넘겨주기

        dl = line.get_dl(); // 선분의 길이 저장

        System.out.printf("dl = %f\n", dl); // dl 출력
    }
}

// javac STEP_07_PointLine_3.java
// cd work; javac -cp .. ../STEP_07_PointLine_3.java

// java STEP_07_PointLine_3
// cd work; java -cp .. STEP_07_PointLine_3