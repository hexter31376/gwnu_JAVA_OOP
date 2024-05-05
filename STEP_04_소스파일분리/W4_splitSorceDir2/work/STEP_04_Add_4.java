import java.io.*;

class STEP_04_Add_4 {
    public static void main(String[] args) throws IOException{
        Add_4 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int x, y, z; // 사용자에게 입력받을 정수 x, y와 그 둘의 합을 저장할 z 선언
        float a, b, c; // 사용자에게 입력받을 실수 a, b와 그 둘의 합을 저장할 c 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = x; // x를 a에 대입
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = y; // y를 b에 대입

        add = new Add_4(); // Add_1 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        z = add.add2c(x, y); // 정수와 정수 더하기
        c = add.add2c(a, b); // 실수와 실수 더하기

        System.out.printf("%d + %d = %d(%f)\n", x, y, z, c); // x + y = 정수z(실수c) 출력하기
    }
}

// 컴파일 방법
// 1. 관련된 모든 소스파일 순서 관계없이 열거하거나
// 2. 최상위 클래스 1개만 열거하거나