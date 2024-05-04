import java.io.*;

class Add_3 {
    int total; // 총 합을 저장할 필드

    int add2c(int a, int b){ // 정수 a, 정수 b 매개변수
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        System.out.println("add2c(int, int) ..."); // add2c(int, int)처럼 매개변수 주었을때 이 메소드가 호출되었음을 print
        return (s); // a와 b의 합 반환
    }

    float add2c(float a, float b){ // 실수 a, 실수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        System.out.println("add2c(float, float) ..."); // add2c(float, float)처럼 매개변수 주었을때 이 메소드가 호출되었음을 print
        return((int)s); // a와 b의 합 반환
    }

    int add2c(int a, float b){ // 정수 a, 실수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        System.out.println("add2c(int, float) ..."); // add2c(int, float)처럼 매개변수 주었을때 이 메소드가 호출되었음을 print
        return((int)s); // a와 b의 합 반환
    }
}

class STEP_02_Add_3 {
    public static void main(String[] args) throws IOException{
        Add_3 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int i, j, k, m; // 사용자에게 입력받을 정수 i, j와 그 둘의 합을 저장할 k, i와 x의 합을 저장할 m 선언
        float x, y, z, w; // 사용자에게 입력받을 실수 x, y와 그 둘의 합을 저장할 z, x와 i의 합을 저장할 w 선언

        i = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x = i; // i를 x에 대입
        j = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = j; // y를 j에 대입

        add = new Add_3(); // Add_3 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        k = add.add2c(i, y); // 정수와 실수 더하기
        z = add.add2c(x, y); // 실수와 실수 더하기
        m = add.add2c(i, x); // 정수와 실수 더하기
        w = add.add2c(x, i); // 실수와 실수 더하기 // 딱 맞는게 없으면 자료형이 큰 메소드를 선택

        System.out.printf("%d + %d = %d(%f)\n", i, j, k, z); // i + j = 정수k(실수z) 출력하기
    }
}