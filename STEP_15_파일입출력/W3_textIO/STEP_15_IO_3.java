import java.io.*;

class IO_31 {
    void io_test () {
        FileWriter fw = null; // 문자 단위 처리를 위한 FileWriter 클래스 객체 지시자 선언

        try {
            fw = new FileWriter("data.txt"); // 객체화
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for output..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_31..."); // 해당 클래스가 시작되었음을 출력

        try {
            char ch1 = 'A', ch2 = 0x42, ch3 = 'C';
            char[] chs = {'X', 'Y', 'Z'};

            fw.write(ch1); // 해당 문자를 입력합니다
            fw.write(ch2); // 해당 문자를 입력합니다
            fw.write(ch3); // 해당 문자를 입력합니다
            fw.write(chs, 0, 3); // 해당 문자 배열을 순차적으로 돌면서 입력합니다.

            // fw.flush(); // 입력 버퍼 초기화 메소드 C언어에도 존재한다.
            fw.close(); // close 메소드로 파일 닫기를 진행 할 수 있습니다. 파일 내용 손실 방지용입니다.
        } catch (IOException e) {
            System.err.println("Character write error"); // 파일 쓰기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

class IO_32 {
    void io_test () {
        FileReader fr = null; // 문자 단위 처리를 위한 FileReader 클래스 객체 지시자 선언
        try {
            fr = new FileReader("data.txt"); // 객체화
        } catch (IOException e) {
            System.err.println("Can`t open 'data.txt' for input..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_32..."); // 해당 클래스가 시작되었음을 출력

        try {
            int ch1, ch2, ch3, n;
            char[] chs = new char[3];

            ch1 = fr.read(); // 해당 문자를 변수에 입력합니다.
            ch2 = fr.read(); // 해당 문자를 변수에 입력합니다.
            ch3 = fr.read(); // 해당 문자를 변수에 입력합니다.
            n = fr.read(chs, 0, 3); // 배열인 경우 배열 크기만큼의 문자들이 입력됩니다.

            System.out.printf("%c %c %c %c %c %c\n", ch1, ch2, ch3, chs[0], chs[1], chs[2]);
        } catch (IOException e) {
            System.err.println("Character read error"); // 파일 읽기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

public class STEP_15_IO_3 {
    public static void main(String[] args) {
        new IO_31().io_test();
        new IO_32().io_test();
    }
}

// 문자 단위 입출력을 위해서는 File[Writ/read]er를 객체화 하여 사용합니다.
// 이전까지는 이진 비트맵으로 저장되었다면 이렇게 하면 txt 파일로 저장이 됩니다.
// 즉 실제로 그냥 까서 읽을 수 있는 데이터가 나오는 것입니다.

// 데이터 하나당 저장 크기는 1~2바이트즈음 하는데 유니코드가 섞여있기 때문에 아스키면 1, 유니코드면 2바이트로 저장 크기를 보는것이 타당합니다.