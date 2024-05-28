import java.io.*;
import java.util.Scanner;

class IO_System_IN {
    void io_test() {
        int total = 0; // total 변수를 초기화

        Scanner scan = null; // 스캐너 클래스 선언

        try {
            scan = new Scanner(System.in); // 콘솔 입출력을 위한 System.in 클래스를 매개변수로
        } catch (Exception e) {
            System.err.println("error"); // 오류 메시지 출력
            System.exit(1); // 오류 코드 1 반환 후 프로그램 종료
        }

        scan.useDelimiter("[ ,\t\n\r]+"); // scan.useDelimiter("[\\s,]+");
        while (scan.hasNextInt()) { // 6개의 정수를 입력받을 때까지 반복
            int n = scan.nextInt(); // 정수를 읽어옴
            total += n; // total에 더함
        }
        System.out.println("Total: " + total); // total 출력
    }
}

class IO_file_IN {
    void io_test () {
        int total = 0; // 총합을 저장할 변수 total

        Scanner scan = null; // 스캐너 클래스 선언

        try {
            scan = new Scanner(new File("data.txt"));
        } catch (Exception e) {
            System.err.println("Can`t open 'data.txt' for input..."); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        scan.useDelimiter("[ ,\t\n\r]+"); // scan.useDelimiter("[\\s,]+");
        while (scan.hasNextInt()) { // 받아들이는 값이 정수일때까지 반복
            int n = scan.nextInt(); // 현재 정수를 받아들이고 다음 요소 지정 그 값을 n에 저장
            total += n; // total에 n 가산
        }
        System.out.println(total); // total 출력
        scan.close(); // 파일 닫기
    }
}

public class H6_Scanner {
    public static void main(String[] args) {
        new IO_file_IN().io_test(); // 파일 입출력 객체 생성 및 메서드 호출
        new IO_System_IN().io_test(); // 콘솔 입출력 객체 생성 및 메서드 호출
    }
}
