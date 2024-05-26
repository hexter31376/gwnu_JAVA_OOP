import java.io.*;

class IO_21 {
    void io_test () {
        boolean bl = true;
        byte bt = 65;
        short st = 0x42;
        char ch = 'C';
        int it = 0104;
        long lg = 69L;
        float ft = 1e-2f;
        double db = 0.02;

        FileOutputStream fos = null; // 파일 출력 관련 기능을 제공하는 클래스 FileOutputStream 선언
        DataOutputStream dos = null; // 기본 타입별 출력 메소드 제공하는 DataOutputStream 사용

        try {
            fos = new FileOutputStream("data.bin"); // 파일 출력 클래스 동적 할당, 생성 파일은 data.bin
            dos = new DataOutputStream(fos); // 기본 타입별 입출력 클래스 동적 할당 및 파라미터로 fos의 주소 넘겨주기
        } catch (Exception e) {
            System.err.println ("can`t open 'data.bin' for output"); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_21..."); // 해당 클래스가 시작되었음을 출력

        try {
            dos.writeBoolean(bl);
            dos.writeByte(bt);
            dos.writeShort(st);
            dos.writeChar(ch);
            dos.writeInt(it);
            dos.writeLong(ch);
            dos.writeFloat(ft);
            dos.writeDouble(db);

            System.out.printf("%b, %02x, %02x, %c, %02x, %02x, %f, %f", bl, bt, st, ch, it, lg, ft, db);
        } catch (IOException e) {
            System.err.println("File write error"); // 파일 쓰기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }

    }
}

import java.io.*;

class IO_21 {
    void io_test () {
        boolean bl = true;
        byte bt = 65;
        short st = 0x42;
        char ch = 'C';
        int it = 0104;
        long lg = 69L;
        float ft = 1e-2f;
        double db = 0.02;

        FileOutputStream fos = null; // 파일 출력 관련 기능을 제공하는 클래스 FileOutputStream 선언
        DataOutputStream dos = null; // 기본 타입별 출력 메소드 제공하는 DataOutputStream 사용

        try {
            fos = new FileOutputStream("data.bin"); // 파일 출력 클래스 동적 할당, 생성 파일은 data.bin
            dos = new DataOutputStream(fos); // 기본 타입별 입출력 클래스 동적 할당 및 파라미터로 fos의 주소 넘겨주기
        } catch (Exception e) {
            System.err.println ("can`t open 'data.bin' for output"); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_21..."); // 해당 클래스가 시작되었음을 출력

        try {
            dos.writeBoolean(bl);
            dos.writeByte(bt);
            dos.writeShort(st);
            dos.writeChar(ch);
            dos.writeInt(it);
            dos.writeLong(ch);
            dos.writeFloat(ft);
            dos.writeDouble(db);

            System.out.printf("%b, %02x, %02x, %c, %02x, %02x, %f, %f", bl, bt, st, ch, it, lg, ft, db);
        } catch (IOException e) {
            System.err.println("File write error"); // 파일 쓰기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }

    }
}

public STEP_15_IO_2() {
    
}
