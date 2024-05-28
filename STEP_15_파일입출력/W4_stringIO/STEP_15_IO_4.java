import java.io.*;

class IO_41 {
    void io_test () {
        FileWriter fw = null; // 문자 단위 처리를 위한 FileWriter 클래스 객체 지시자 선언
        BufferedWriter bw = null; // 문자열 단위 처리를 위한 버퍼 메모리 사용을 위한 BufferedWriter 객체 지시자 선언

        try {
            fw = new FileWriter("data.txt"); // 객체화
            bw = new BufferedWriter(fw); // BufferedWriter 객체화
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for output..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_41..."); // 해당 클래스가 시작되었음을 출력

        try {
            char ch1 = 'A', ch2 = 0x42, ch3 = 'C';
            char[] chs = {'X', 'Y', 'Z'};

            String str = "I am happy"; // 문자열 처리 테스트를 위한 추가 입력

            bw.write(ch1); // 해당 문자를 입력합니다
            bw.write(ch2); // 해당 문자를 입력합니다
            bw.write(ch3); // 해당 문자를 입력합니다
            bw.write(chs); // 개별 문자 단위도 출력 가능합니다.
            bw.write(chs, 0, 3); // 해당 문자 배열을 순차적으로 돌면서 입력합니다.
            bw.newLine(); // BufferedWriter를 사용하면 개행을 이런 식으로 해 줄수 있습니다.

            bw.write(str); // 그냥 입력해도 되고
            bw.write(str, 0, 10); // 범위를 지정해 줘도 됩니다.
            bw.newLine(); // BufferedWriter를 사용하면 개행을 이런 식으로 해 줄수 있습니다.
            bw.close(); // close 메소드로 파일 닫기를 진행 할 수 있습니다. 파일 내용 손실 방지용입니다.
        } catch (IOException e) {
            System.err.println("Character & Line write error"); // 파일 쓰기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

class IO_42 {
    void io_test () {
        FileReader fr = null; // 문자 단위 처리를 위한 FileReader 클래스 객체 지시자 선언
        BufferedReader br = null; // 문자열 단위 처리를 위한 버퍼 메모리 사용을 위한 BufferedReader 객체 지시자 선언

        try {
            fr = new FileReader("data.txt"); // 객체화
            br = new BufferedReader(fr);
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for input..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_42..."); // 해당 클래스가 시작되었음을 출력

        try {
            int ch1, ch2, ch3, n;
            char[] chs = new char[3];
            String str1, str2; // 문자열 처리 테스트를 위한 추가 입력 아까 2번 입력했으므로 2번 입력 받는다.

            ch1 = br.read(); // 해당 문자를 변수에 입력합니다.
            ch2 = br.read(); // 해당 문자를 변수에 입력합니다.
            ch3 = br.read(); // 해당 문자를 변수에 입력합니다.
            n = br.read(chs); // 개별 문자 단위도 입력이 됩니다.
            n = br.read(chs, 0, 1); // 배열인 경우 배열 크기만큼의 문자들이 입력됩니다.

            str1 = br.readLine(); // 한줄을 읽어냅니다. 근데 개행을 안해서 빈 문자열을 읽습니다.
            str2 = br.readLine(); // 문자열 2개를 읽어냅니다.

            System.out.printf("%c %c %c\n", ch1, ch2, ch3); // 문자 순서대로 출력
            System.out.println("str1 = " + str1); // 문자열 1 출력
            System.out.println("str2 = " + str2); // 문자열 2 출력
        } catch (IOException e) {
            System.err.println("Character & Line read error"); // 파일 읽기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

public class STEP_15_IO_4 {
    public static void main(String[] args) {
        new IO_41().io_test();
        new IO_42().io_test();
    }
}

// 문자열 단위 입출력을 위해서 File[Writ/read]er를 객체화 하고 Buffered[Writ/Read]er 객체화 하여 버퍼 단위 입출력을 사용합니다.
// 당연히 문자 단위 저장이므로 txt 파일로 저장이 됩니다.
// Buffered[Writ/Read]er는 줄 단위, 문자열 단위, 정수 단위 등등, 여러 단위로 읽거나 쓸 수 있는 기능을 제공합니다.