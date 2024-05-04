import java.io.*;

class AddSub_1 { // class Add와 Sub와 total 필드를 가지고 있는 클래스 AddSub_1 선언
    int total; // 총 합을 저장할 필드

    class Add { // 더하기 기능을 모아놓은 Add 클래스
        int add2c(int a, int b){ // 정수 a, 정수 b 매개변수
            int s = a + b; // a와 b의 합을 s에 저장
            total += s; // 필드에 합계 저장
            return (s); // a와 b의 합 반환
        }
    
        float add2c(float a, float b){ // 실수 a, 실수 b 매개변수
            float s = a + b; // a와 b의 합을 s에 저장
            total += s; // 필드에 합계 저장
            return (s); // a와 b의 합 반환
        }
    }

    class Sub { // 빼기 기능을 모아놓은 Sub 클래스
        int sub2c(int a, int b){ // 정수 a, 정수 b 매개변수
            int s = a - b; // a와 b의 차를 s에 저장
            total -= s; // 필드에 계 저장
            return (s); // a와 b의 차 반환
        }
    
        float sub2c(float a, float b){ // 실수 a, 실수 b 매개변수
            float s = a - b; // a와 b의 차를 s에 저장
            total -= s; // 필드에 계 저장
            return (s); // a와 b의 차 반환
        }
    }
}

class STEP_03_AddSub_1 {
    public static void main(String[] args) throws IOException{
        AddSub_1 addsub; // 쓰고자 하는 외부 클래스를 지정할 수 있는 객체 지시자 addsub 선언
        AddSub_1.Add add1, add2; // 쓰고자 하는 내부 클래스를 지정할 수 있는 객체 지시자 add1, add2 선언
        AddSub_1.Sub sub1, sub2; // 쓰고자 하는 내부 클래스를 지정할 수 있는 객체 지시자 sub1, sub2 선언

        int i, j, k, m; // 사용자에게 입력받을 정수 i, j와 그 둘의 합을 저장할 k, total을 저장할 m 선언
        float x, y, z; // 사용자에게 입력받을 실수 x, y와 그 둘의 합을 저장할 z 선언

        i = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x = i; // i를 x에 대입
        j = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = j; // y를 j에 대입

        addsub = new AddSub_1(); // AddSub_1 클래스 형태의 객체를 생성하고 그 객체를 addsub에 할당

        add1 = addsub.new Add(); // 이미 객체화된 addsub 안의 Add 클래스 형태의 객체를 생성하고 그 객체를 add1에 할당
        add2 = addsub.new Add(); // 이미 객체화된 addsub 안의 Add 클래스 형태의 객체를 생성하고 그 객체를 add2에 할당
        sub1 = addsub.new Sub(); // 이미 객체화된 addsub 안의 Sub 클래스 형태의 객체를 생성하고 그 객체를 sub1에 할당
        sub2 = addsub.new Sub(); // 이미 객체화된 addsub 안의 Sub 클래스 형태의 객체를 생성하고 그 객체를 sub2에 할당

        k = add1.add2c(i, j); // 정수와 정수 더하기
        z = sub1.sub2c(x, y); // 실수와 실수 빼기
        m = addsub.total; // 총합 저장

        System.out.printf("%d + %d = %d(%f, %d)\n", i, j, k, z, m); // i + j = 정수 합k(실수 차k, 정수 총합) 출력하기
    }
}
