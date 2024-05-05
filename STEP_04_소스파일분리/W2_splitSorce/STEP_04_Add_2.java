import java.io.*;

class STEP_04_Add_2 {
    public static void main(String[] args) throws IOException{
        Add_2 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int x, y, z; // 사용자에게 입력받을 정수 x, y와 그 둘의 합을 저장할 z 선언
        float a, b, c; // 사용자에게 입력받을 실수 a, b와 그 둘의 합을 저장할 c 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = x; // x를 a에 대입
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = y; // y를 b에 대입

        add = new Add_2(); // Add_1 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        z = add.add2c(x, y); // 정수와 정수 더하기
        c = add.add2c(a, b); // 실수와 실수 더하기

        System.out.printf("%d + %d = %d(%f)\n", x, y, z, c); // x + y = 정수z(실수c) 출력하기
    }
}

// 모든 자바 소스 파일 컴파일 방법
    // 1. 관련된 모든 소스파일 순서 관계없이 열거하거나
    // javac STEP_04_Add_2.java Add_2.java // o

    // 2. 메인 소스파일 1개만 열거하거나 (이때 STEP_04_Add_2가 참조하는 모든 자바 소스코드가 자동 컴파일됩니다.)
    // javac STEP_04_Add_2.java // o

// 모든 클래스 파일 실행 방법
    // 1. 관련된 모든 클래스파일 순서 관계없이 열거하거나
    // java STEP_04_Add_2 Add_2 // o

    // 2. 메인 클래스 1개만 열거하거나 (이때 STEP_04_Add_2가 참조하는 모든 클래스가 자동 실행됩니다.)
    // java STEP_04_Add_2 // o

// 참조하려는 클래스가 *.class로만 존재할 경우
    // 1. 관련된 모든 소스파일과 해당 class 파일을 작성하는 방식으로 컴파일 실행할 수 없습니다.
    // javac STEP_04_Add_2.java Add_2 // x
    // javac STEP_04_Add_2.java Add_2.class // x

    // 2. 일단 메인 파일 컴파일 후 클래스를 실행시켜주어야 합니다.
    // javac STEP_04_Add_2.java // 1
    // java STEP_04_Add_2 Add_2 // 2
    // java STEP_04_Add_2 // 3