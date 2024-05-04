import java.io.*;

class AddSub_2 { // class Add와 Sub와 total 필드를 가지고 있는 클래스 AddSub_1 선언
    int total; // 총 합을 저장할 필드

    AddSub_2(int total){
        this.total = 0; // AddSub_2의 total에 생성시 입력된 값을 더해주기
    }

    class Add { // 더하기 기능을 모아놓은 Add 클래스
        int total; // add의 total

        Add(int total){
            this.total = total; // Add의 total에 생성시 입력된 값을 더해주기
        }

        int add2c(int a, int b){ // 정수 a, 정수 b 매개변수
            int s = a + b; // a와 b의 합을 s에 저장

            AddSub_2.this.total += s; // AddSub_2의 total에 합을 더해주기
            total += s; // 필드에 합계 저장
            return (s); // a와 b의 합 반환
        }
    }

    class Sub { // 빼기 기능을 모아놓은 Sub 클래스
        int total; // sub의 total

        Sub(int total){
            this.total = total; // Add의 total에 생성시 입력된 값을 더해주기
        }

        int sub2c(int a, int b){ // 정수 a, 정수 b 매개변수
            int s = a - b; // a와 b의 차를 s에 저장

            AddSub_2.this.total -= s; // AddSub_2의 total에 차를 빼주기
            total -= s; // 필드에 계 저장
            return (s); // a와 b의 차 반환
        }
    }
}

class STEP_03_AddSub_2 {
    public static void main(String[] args) throws IOException{
        AddSub_2 addsub; // 쓰고자 하는 외부 클래스를 지정할 수 있는 객체 지시자 addsub 선언
        AddSub_2.Add add; // 쓰고자 하는 내부 클래스를 지정할 수 있는 객체 지시자 add 선언
        AddSub_2.Sub sub; // 쓰고자 하는 내부 클래스를 지정할 수 있는 객체 지시자 sub 선언

        int i, j, k, m, n; // 사용자에게 입력받을 정수 i, j와 이 둘의 합을 저장할 k, 이 둘의 차를 저장할 m, 총합을 저장할 m을 선언

        i = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        j = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        addsub = new AddSub_2(0); // AddSub_2 클래스 형태의 객체를 생성하고 그 객체를 addsub에 할당

        add = addsub.new Add(0); // 이미 객체화된 addsub 안의 Add 클래스 형태의 객체를 생성하고 그 객체를 add에 할당
        sub = addsub.new Sub(0); // 이미 객체화된 addsub 안의 Sub 클래스 형태의 객체를 생성하고 그 객체를 sub에 할당

        k = add.add2c(i, j); // 정수와 정수 더하기
        m = sub.sub2c(i, j); // 실수와 실수 빼기
        n = addsub.total; // 총합 저장

        System.out.printf("%d + %d = %d(%d)\n", i, j, k, n); // i + j = 정수 합k(n정수 총합) 출력하기
    }
}