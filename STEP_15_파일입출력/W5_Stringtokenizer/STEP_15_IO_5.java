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

class IO_52 {
    void io_test () {
        FileInputStream fr = null; // 입력받기 위한 FileInputStream 형 객체 지시자 선언

        try {
            fr = new FileInputStream("data.txt"); // 객체화
        } catch (FileNotFoundException e) {
            System.err.println("Can`t open 'data.txt' for input..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_52..."); // 해당 클래스가 시작되었음을 출력

        Scanner scan = new Scanner(fr); // Scanner 클래스 scan을 동적 생성하고 fr포인터를 줌으로서 파일을 읽어낼 준비를 함

        while (scan.hasNextLine()) { // 줄별로 입력이 불가능할때까지, hasNextLine은 그 자체로 줄단위 입력을 받을 수 없다면 0을 반환, 조건 판단용이다.
            String line = scan.nextLine(); // 한 줄의 데이터를 line에 저장하고 다음 줄로 커서를 옮긴다.
            StringTokenizer tkn = new StringTokenizer(line, " ,\t\n\r"); // 문자열을 토큰화할, 즉 원하는 기호를 만나면 그 기호를 기준으로 문자열을 끊어서 읽어줄 StringTokenizer 클래스를 선언하고 초기값으로 나누어줄 기준 구분 문자를 전부 입력

            while (tkn.hasMoreTokens()) { // 토큰화할 문자열이 있을 때에만
                String word = tkn.nextToken(); // 토큰화, 즉 위의 기준에 따라 조각낸 문자열을 word에 저장

                System.out.println(word); // word 출력하고 개행
            }
        }

        scan.close(); // Scanner를 통한 파일 닫기
    }
}

class IO_53 {
    void io_test () {
        Scanner scan = null; // Scanner 클래스 scan 객체 지시자를 생성하고

        try {
            scan = new Scanner(new File("data.txt")); // 스캐너의 객체화와 동시에 파일을 읽어들이기 위한 File 클래스를 객체화해서 넣어줍니다.(익명 클래스) 
        } catch (FileNotFoundException e) {
            System.err.println("Can`t open 'data.txt' for input..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_53..."); // 해당 클래스가 시작되었음을 출력

        scan.useDelimiter("[ ,\t\n\r]+"); // scan.useDelimiter("[\\s,]+"); // 스캐너에 기본 내장된 useDelimiter를 통해 토큰 문자열 기준을 세워줍니다. 이러면 scanner는 문자열을 자동으로 토큰화 해서 읽어줍니다.
        while (scan.hasNext()) { // 읽을 문자열이 없을 때까지
            String word = scan.next(); // 문자열을 저장 // 이전의 useDelimiter에 의해 자동 토큰화된 순서로 입력이 됩니다.
            System.out.println(word); // word 출력
        }
        scan.close(); // Scanner를 통한 파일 닫기
    }
}

public class STEP_15_IO_5 {
    public static void main(String[] args) {
        new IO_51().io_test();
        new IO_52().io_test();
        new IO_53().io_test();
    }
}

// StringTokenizer를 통해 입력받은 문자열 혹은 라인을 토큰화해서 원하는 데이터 단위로 끊어서 처리할 수 있습니다.
// 입력 클래스 Scanner클래스를 객체화하고 객체 지시자로 파일의 포인터를 넘겨줌으로서 파일에 대한 출력을 진행 할 수 있습니다.
// 물론, Scanner의 useDelimiter메소드를 이용해 토큰 단위로 읽어줄 기준을 세워주고 읽을 수도 있습니다.
// hasNext는 토큰 기준을 세워주지 않으면 기본적으로 공백 문자로 입력을 구분짓습니다.