import java.io.*;

class STEP_04_Add_3 {
    public static void main(String[] args) throws IOException{
        Add_3 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int x, y, z; // 사용자에게 입력받을 정수 x, y와 그 둘의 합을 저장할 z 선언
        float a, b, c; // 사용자에게 입력받을 실수 a, b와 그 둘의 합을 저장할 c 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = x; // x를 a에 대입
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = y; // y를 b에 대입

        add = new Add_3(); // Add_1 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        z = add.add2c(x, y); // 정수와 정수 더하기
        c = add.add2c(a, b); // 실수와 실수 더하기

        System.out.printf("%d + %d = %d(%f)\n", x, y, z, c); // x + y = 정수z(실수c) 출력하기
    }
}

// 모든 자바 소스 파일 컴파일 방법
    // 1. 메인 소스파일 1개만 열거하는식의 컴파일이 되지 않습니다.
    // javac STEP_04_Add_2.java // x

    // 2. 관련된 모든 소스파일을 경로 포함해서 모두 열거하는 식으로 진행하거나
    // javac STEP_04_Add_2.java work/Add_2.java // o

    // 3. cp 명령어로 work 폴더를 classpath 추가해줍니다.
    // javac -cp work STEP_04_Add_2.java // o

// 모든 클래스 파일 실행 방법

    // 1. 메인 클래스 1개만 열거하는식의 실행이 되지 않습니다.
    // java STEP_04_Add_2 // o

    // 2. cp 명령어로 work 폴더를 classpath 추가해주는식으로도 안됩니다.
    // javac -cp work STEP_04_Add_2 // x

    // 1. 기본 검색 위치라는 개념이 실행시에는 없어지므로 모든 경로를 따로 명시해주어야 합니다.
    // javac -cp ".;work" STEP_04_Add_2 // o