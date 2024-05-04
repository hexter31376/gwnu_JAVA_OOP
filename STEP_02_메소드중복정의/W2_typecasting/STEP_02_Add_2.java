import java.io.*;

class Add_1 {
    int total; // 총 합을 저장할 필드

    int add2i(int a, int b){ // 정수 a, 정수 b 매개변수
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }

    float add2f(float a, float b){ // 실수 a, 실수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return((int)s); // a와 b의 합 반환
    }

    int add2if(int a, float b){ // 정수 a, 실수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return((int)s); // a와 b의 합 반환
    }

    float add2fi(float a, int b){ // 실수 a, 정수 b 매개변수
        float s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }
}

class STEP_02_Add_2 {
    public static void main(String[] args) throws IOException{
        Add_2 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int i, j, k; // 사용자에게 입력받을 정수 i, j와 그 둘의 합을 저장할 k 선언
        float x, y, z; // 사용자에게 입력받을 실수 x, y와 그 둘의 합을 저장할 z 선언

        x = System.in.read() - '0'; // 문자 입력받고 실수화시키기
        i = (int)x; // x를 int형으로 명시적 형변환 시키고 i에 대입
        y = System.in.read() - '0'; // 문자 입력받고 실수화시키기
        j = (int)y; // y를 int형으로 명시적 형변환 시키고 j에 대입

        add = new Add_2(); // Add_2 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        z = add.add2f(x, y); // 실수와 실수 더하기
        k = add.add2if(i, y); // 정수와 실수 더하기

        System.out.printf("%f + %f = %f\n", x, y, z); // x + y = z 출력하기
    }
}