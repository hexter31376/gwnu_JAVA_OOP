import java.io.*;

/*
class Add_4_1 {
    int add2i(int a, int b){
        int total; // 리턴하는 순간 값은 사라집니다.

        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
class Add_4_2 {
    int add2i(int a, int b){
        static int total; // 메소드 안에 정적 선언을 하는 것은 허용되지 않습니다.

        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
*/

class Add_4_3 { // 객체의 총합 '필드', 값을 받아들이고 그것을 총합에 더하는 '메소드'를 가진 클래스
    int total; // 총 합을 저장할 필드

    int add2i(int a, int b){ // 매개변수 a와 b의 합을 구하고 그 값을 필드 total에 누적시킨수 a와 b의 값 반환
        int s; // 합을 저장할 s 선언
        s = a + b; // a와 b의 합을 s에 저장
        total += s; // 필드에 합계 저장
        return (s); // a와 b의 합 반환
    }
}

class STEP_01_Add_4 {
    public static void main(String[] args) throws IOException{
        Add_4_3 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언
        int x, y, z, t; // 사용자에게 입력받을 변수 x, y와 그 둘의 합을 저장할 z, add 객체의 총합을 저장할 t 선언

        x = System.in.read() -'0'; // 문자 입력받고 정수화시키기
        y = System.in.read() -'0'; // 문자 입력받고 정수화시키기

        add = new Add_4_3(); // Add_4_3 클래스 형태의 객체를 생성하고 그 객체를 add에 할당

        z = add.add2i(x, y); // 객체 add의 add2i 메소드 호출하여 나온 값 z에 저장
        z = add.add2i(x, y); // 객체 add의 add2i 메소드 호출하여 나온 값 z에 저장
        t = add.total; // 객체 add의 add2i total 필드 호출한 값 t에 저장
        System.out.printf("%d + %d = %d, total = %d\n", x, y, z, t); // x + y = z 출력하고 객체 add의 field total 출력
    }
}