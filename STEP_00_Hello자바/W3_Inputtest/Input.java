import java.io.*;

class Input {
    public static void main(String[] args) throws IOException{ // System.in.read로 읽은 값을 정수화할때의 Exception을 무시
        int x, y, z; // 사용자에게 입력받을 변수 x, y와 그 둘의 합을 저장한 z 선언

        x = System.in.read(); // System.in.read로 문자 1개 입력받고 x에 저장
        y = System.in.read(); // System.in.read로 문자 1개 입력받고 x에 저장
        z = (x - '0') + (y - '0'); // 문자 x와 문자 y를 각각 정수화시키고 더해서 z에 저장;

        System.out.printf("%c + %c = %d\n", x, y, z); // x + y = z 출력
    }
}
