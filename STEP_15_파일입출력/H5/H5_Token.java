import java.io.*;
import java.util.*;

class IO_51 {
    void io_test () {
        FileReader fr = null; // 문자 단위 처리를 위한 FileReader 클래스 객체 지시자 선언
        BufferedReader br = null; // 문자열 단위 처리를 위한 버퍼 메모리 사용을 위한 BufferedReader 객체 지시자 선언

        try {
            fr = new FileReader("data.txt"); // 객체화
            br = new BufferedReader(fr); // 버퍼 리딩
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for input..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_51..."); // 해당 클래스가 시작되었음을 출력

        try {
            String line, word; // 문자열 변수 line, word 선언

            while (true) { // 무한 반복
                if ((line = br.readLine()) == null) { // 만약 파일을 읽었는데 내용이 비어있다면 
                    break; // 반복문 종료
                }
                StringTokenizer tkn = new StringTokenizer(line, " ,\t\n\r"); // 문자열 토큰화 클래스 StringTokenizer를 선언하고 line 문자열에 적용하는데 각각 스페이스바, 쉼표, tab, enter, carriage return 등의 구분문자들을 전부 모아주는 개념입니다.

                while (tkn.hasMoreTokens()) { // 토큰이 더 있는지 물어보고
                    word = tkn.nextToken(); // 다음 토큰 비교를 실시
                    System.out.println(word); // 문자열 출력
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Line read error"); // 라인을 제대로 읽지 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

public class H5_Token {
    public static void main(String[] args) {
        new IO_51().io_test();
    }
}
