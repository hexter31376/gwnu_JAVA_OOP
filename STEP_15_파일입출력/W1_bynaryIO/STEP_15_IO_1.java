import java.io.*;

class IO_11 {
    void io_test () {
        int b1 = 0x01, b2 = 0x02, b3 = 0x03; // 정수형 변수 3개 선언
        byte[] bs = {'A', 'B', 'C'}; // 문자형 변수 

        FileOutputStream fos = null; // 파일 출력 관련 기능을 제공하는 클래스 FileOutputStream 선언

        // if문이 아닌 try catch문으로 파일 포인터에 스트림이 제대로 연결되지 않는 오류 해결
        try { // 일단 FileOutputStream 클래스를 fos에 동적 할당하는데
            fos = new FileOutputStream("data.bin"); // 동적 할당
        } catch (FileNotFoundException e) { // FileNotFoundException과 같이 파일을 못찾는 예외가 발생하면 여기서 catch한다.
            System.err.println ("can`t open 'data.bin' for output"); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_11..."); // 해당 클래스가 시작되었음을 출력

        try {
            fos.write(b1); // 선언한 자료형의 크기만큼 데이터 작성하기
            fos.write(b2); // 선언한 자료형의 크기만큼 데이터 작성하기
            fos.write(b3); // 선언한 자료형의 크기만큼 데이터 작성하기
            fos.write(bs); // fos.write(bs, 0, 3); // 배열일 경우 배열 크기만큼의 바이트 연속 출력
        } catch (IOException e) {
            System.err.println("File write error"); // 파일 쓰기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

class IO_12 {
    void io_test () {
        int b1, b2, b3, n;
        byte[] bs = new byte[3];

        FileInputStream fis = null;

        // if문이 아닌 try catch문으로 파일 포인터에 스트림이 제대로 연결되지 않는 오류 해결
        try { // 일단 FileInputStream 클래스를 fos에 동적 할당하는데
            fis = new FileInputStream("data.bin"); // 동적 할당
        } catch (FileNotFoundException e) { // FileNotFoundException과 같이 파일을 못찾는 예외가 발생하면 여기서 catch한다.
            System.err.println("can`t open 'data.bin' for input"); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_12..."); // 해당 클래스가 시작되었음을 출력

        try {
            b1 = fis.read(); // 선언한 자료형의 크기만큼 데이터 읽어들이기
            b2 = fis.read(); // 선언한 자료형의 크기만큼 데이터 읽어들이기
            b3 = fis.read(); // 선언한 자료형의 크기만큼 데이터 읽어들이기
            n = fis.read(bs); // fis.read(bs, 0, 3);

            System.out.printf("%02x %02x %02x %02x %02x %02x\n", b1, b2, b3, (int)bs[0], (int)bs[1], (int)bs[2]); //각각의 요소와 배열 요소를 각각 출력
        } catch (Exception e) {
            System.err.println("File read error"); // 파일 읽기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }
    }
}

public class STEP_15_IO_1 {
    public static void main(String[] args) {
        new IO_11().io_test();
        new IO_12().io_test();
    }
}

// 가장 로우 레벨의 파일 입출력은 byte 단위의 입출력이고 위와 같이 작성해서 구현이 가능하다