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

class IO_22 {
    void io_test () {
        boolean bl;
        byte bt;
        short st;
        char ch;
        int it;
        long lg;
        float ft;
        double db;

        FileInputStream fis = null; // 파일 출력 관련 기능을 제공하는 클래스 FileOutputStream 선언
        DataInputStream dis = null; // 기본 타입별 출력 메소드 제공하는 DataOutputStream 사용

        try {
            fis = new FileInputStream("data.bin"); // 파일 입력 클래스 동적 할당, 생성 파일은 data.bin
            dis = new DataInputStream(fis); // 기본 타입별 입출력 클래스 동적 할당 및 파라미터로 fis의 주소 넘겨주기
        } catch (FileNotFoundException e) {
            System.err.println ("can`t open 'data.bin' for input"); // 파일을 못찾았음을 알려주고
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        System.out.println("IO_22..."); // 해당 클래스가 시작되었음을 출력

        try {
            bl = dis.readBoolean();
            bt = dis.readByte();
            st = dis.readShort();
            ch = dis.readChar();
            it = dis.readInt();
            lg = dis.readLong();
            ft = dis.readFloat();
            db = dis.readDouble();

            System.out.printf("%b, %02x, %02x, %c, %02x, %02x, %f, %f", bl, bt, st, ch, it, lg, ft, db);
        } catch (IOException e) {
            System.err.println("File write error"); // 파일 쓰기를 못했음을 알려주고
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        }

    }
}

public class STEP_15_IO_2 {
    public static void main(String[] args) {
        new IO_21().io_test();
        new IO_22().io_test();
    }
}

// Data[In/Output]Stream을 통해 기본 타입별 입출력을 진행할 수 있습니다.
// 자료형에 맞는 비트 이미지를 입출력합니다 (예를 들면 char는 1바이트 비트로, int는 4바이트 비트로)
// vscode에서는 아쉽게도 못 읽는듯 합니다. bynary file