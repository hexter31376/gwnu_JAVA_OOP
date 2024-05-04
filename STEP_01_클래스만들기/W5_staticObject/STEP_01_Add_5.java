import java.io.*;

class Add_5_1 {
    int total; // 해당 객체의 add2i가 호출되었을때에만 누적

    int add2i(int a, int b){ // 매개변수 a와 b의 합을 구하고 그 값을 필드 total에 누적시킨수 a와 b의 값 반환
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }
}
class Add_5_2 {
    static int total; // 모든 객체의 add2i가 호출되어도 누적

    int add2i(int a, int b){ // 매개변수 a와 b의 합을 구하고 그 값을 필드 total에 누적시킨수 a와 b의 값 반환
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }
}
/*
class Add_5_3 {
    int total;

    static int add2i(int a, int b){ // 정적이 아닌 외부 멤버의 참조 불가능, 따라서 total에 값을 저장하는 행위가 되지 않는다.
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
*/

class STEP_01_Add_5 {
    public static void main(String[] args) throws IOException{
        Add_5_1 add1_1, add1_2; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add1_1, add1_2 선언
        Add_5_2 add2_1, add2_2; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add2_1, add2_2 선언
        int x, y, z; // 사용자에게 입력받을 변수 x, y와 그 둘의 합을 저장할 z선언

        x = System.in.read() -'0'; // 문자 입력받고 정수화시키기
        y = System.in.read() -'0'; // 문자 입력받고 정수화시키기

        add1_1 = new Add_5_1(); // Add_5_1 클래스 형태의 객체를 생성하고 그 객체를 add1_1에 할당
        add1_2 = new Add_5_1(); // Add_5_1 클래스 형태의 객체를 생성하고 그 객체를 add1_2에 할당

        add2_1 = new Add_5_2(); // Add_5_2 클래스 형태의 객체를 생성하고 그 객체를 add2_1에 할당
        add2_2 = new Add_5_2(); // Add_5_2 클래스 형태의 객체를 생성하고 그 객체를 add2_2에 할당

        z = add1_1.add2i(x, y); // 객체 add1_1의 add2i 메소드 호출하여 나온 값 z에 저장
        z = add1_2.add2i(x, y); // 객체 add1_2의 add2i 메소드 호출하여 나온 값 z에 저장

        z = add2_1.add2i(x, y); // 객체 add2_1의 add2i 메소드 호출하여 나온 값 z에 저장
        z = add2_2.add2i(x, y); // 객체 add2_2의 add2i 메소드 호출하여 나온 값 z에 저장

        System.out.printf("%d + %d = %d, total1_1 = %d, total1_2 = %d, total2_1 = %d, total2_2 = %d\n",
        x, y, z, add1_1.total, add1_2.total, add2_1.total, add2_2.total);
        // x + y = z 출력하고 객체 add1과 add2의 field total 출력
    }
}