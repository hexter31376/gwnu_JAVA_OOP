import java.io.*;

class STEP_07_PointLine_4 {
    public static void main(String[] args) throws IOException{
        kor.ptln.Line_4 line; // line 패키지의 Line_4 클래스 형태의 객체지시자 line 생성
        int x, y, a, b; // 사용자에게 입력받을 정수 x, y, a, b 선언
        double dl; // 선분의 길이 dl

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        line = new kor.ptln.Line_4(x, y, a, b); // line 패키지의 Line_4 클래스 형태의 객체를 생성, 초기값으로 x, y, a, b 넘겨주기

        dl = line.get_dl(); // 선분의 길이 저장

        System.out.printf("dl = %f\n", dl); // dl 출력
    }
}

// javac STEP_07_Point_4.java (해당 파일 이후만 컴파일)
// cd work; javac -cp ".." ../STEP_07_PointLine_4.java

// java STEP_07_PointLine_4 (작업 디렉토리)
// cd work; java -cp ".." STEP_07_PointLine_4