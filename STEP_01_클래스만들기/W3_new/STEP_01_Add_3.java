import java.io.*;

class Add_3 { // 정수 2개를 더하고 더한 값을 반환하는 함수를 '가지고 있는' 클래스
    int add2i(int a, int b){ // 정수 2개를 더하고 더한 값을 반환하는 메소드
        int s; // 더한 값을 저장할 s
        s = a + b; // 인수로 받은 정수 2개를 더하고 s에 저장
        return (s); // s 반환
    }
}

class STEP_01_Add_3 {
    public static void main(String[] args) throws IOException{
        int x, y, z; // 사용자에게 입력받을 변수 x, y와 그 둘의 합을 저장할 z 선언
        Add_3 add; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 add 선언

        x = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        add = new Add_3(); // Add_3 클래스 형태의 객체를 생성하고 그 객체를 add에 할당
        z = add.add2i(x,y); // 객체 add의 add2i 호출

        System.out.printf("%d + %d = %d\n", x, y, z); // x + y = z 출력하기
    }
}