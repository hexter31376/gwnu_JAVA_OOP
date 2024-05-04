import java.io.*;

class STEP_01_add_1{
    public static void main(String[] args) throws IOException{
        int x, y, z; // 사용자에게 입력받을 변수 x, y와 그 둘의 합을 저장한 z 선언

        x = System.in.read() -'0'; // 문자 입력받고 정수화시키기
        y = System.in.read() -'0'; // 문자 입력받고 정수화시키기

        z = add2i(x, y); // add2i 호출

        System.out.printf("%d + %d = %d\n", x, y, z); // x + y = z 출력하기
    }

    static int add2i(int a, int b){ // 정수 2개를 더하고 더한 값을 반환하는 함수
        int s; // 더한 값을 저장할 s
        s = a + b; // 인수로 받은 정수 2개를 더하고 s에 저장
        return (s); // s 반환
    }
}