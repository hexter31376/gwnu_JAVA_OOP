import java.io.*;

class Student implements Serializable {
    String name;
    Integer age;

    Student (String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    String getName () {
        return (name);
    }
}

class IO_61 {
    void io_test () {
        ObjectOutputStream os = null;

        System.out.println("IO_61,,,");
        try {
            os = new ObjectOutputStream(new FileOutputStream("object.bin"));
        } catch (FileNotFoundException e) {// 파일을 찾을 수 없으면
            System.err.println("Write open error..."); // 파일을 열 수 없다는 오류 출력
            System.exit(1); // 1 반환 후 프로그램 종료
        } catch (IOException e) { // ioexception을 받아줍니다
        }
    }
}

public class STEP_15_IO_6 {
    public static void main(String[] args) {
        new IO_61().io_test();
        new IO_62().io_test();
    }
}

