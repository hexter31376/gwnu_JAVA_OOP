import java.io.*;

class STEP_04_Add_1 {
    public static void main(String[] args) throws IOException{
        Add_1 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int x, y, z; // 사용자에게 입력받을 정수 x, y와 그 둘의 합을 저장할 z 선언
        float a, b, c; // 사용자에게 입력받을 실수 a, b와 그 둘의 합을 저장할 c 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        a = x; // x를 a에 대입
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        b = y; // y를 b에 대입

        add = new Add_1(); // Add_1 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        z = add.add2c(x, y); // 정수와 정수 더하기
        c = add.add2c(a, b); // 실수와 실수 더하기

        System.out.printf("%d + %d = %d(%f)\n", x, y, z, c); // x + y = 정수z(실수c) 출력하기
    }
}

class Add_1 {
    int total; // 총 합을 저장할 필드

    int add2c(int a, int b){ // 정수 a, 정수 b 매개변수
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }

    float add2c(float a, float b){ // 실수 a, 실수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return(s); // a와 b의 합 반환
    }
}