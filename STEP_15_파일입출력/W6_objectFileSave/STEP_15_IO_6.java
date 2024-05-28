import java.io.*;

class Student implements Serializable { // Serializable 인터페이스를 이식해 해당 객체를 ObjectOutputStream이 읽을 수 있게 해 준다.
    String name; // 이름 필드
    Integer age; // 나이 필드

    Student (String name, Integer age) { // 객체 생성자, 이름과 나이를 초기값으로 받고 필드에 적용한다
        this.name = name;
        this.age = age;
    }
    String getName () { // 이름을 리턴하는 메소드
        return (name); // 이름 리턴
    }
}

class IO_61 {
    void io_test () {
        System.out.println("IO_61..."); // 해당 클래스를 실행했음을 알리고

        ObjectOutputStream os = null; // 오브젝트 출력 스트림 클래스 객체 지시자를 생성하고
        try {
            os = new ObjectOutputStream(new FileOutputStream("object.bin")); // os를 객체화시키고 객체 생성자 파라미터로 FileOutputStream을 익명 클래스로 생성하면서 넣어주는데, object.bin 파일을 생성하면서 넣어준다. 즉 os로 파일 생성과 동시에 파일의 조작이 가능해진다.
        } catch (FileNotFoundException e) { // 파일을 찾을 수 없으면
            System.err.println("Write open error..."); // 파일을 열 수 없다는 오류 출력
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        } catch (IOException e) { // ioexception을 받아줍니다
        }

        Student st1 = new Student("Lee", 19); // 학생 1번 객체 생성
        Student st2 = new Student("Kim", 18); // 학생 2번 객체 생성

        try {
            os.writeObject(st1); // writeObject 메소드로 학생 데이터 파일에 작성하기
            os.writeObject(st2); // writeObject 메소드로 학생 데이터 파일에 작성하기
            os.close(); // 파일 닫기
        } catch (IOException e) { // ObjectOutputStream이 throw 할수 있는 IOException을 받아줍니다.
        }
        System.out.println("Object write success..."); // 객체 작성 성공을 알리는 메세지
    }
}

class IO_62 {
    void io_test () {
        System.out.println("IO_62..."); // 해당 클래스를 실행했음을 알리고

        ObjectInputStream os = null; // 오브젝트 출력 스트림 클래스 객체 지시자를 생성하고
        try {
            os = new ObjectInputStream(new FileInputStream("Object.bin"));  // os를 객체화시키고 객체 생성자 파라미터로 FileInputStream을 익명 클래스로 생성하면서 넣어주는데, object.bin 파일을 생성하면서 넣어준다. 즉 os로 파일 생성과 동시에 파일의 조작이 가능해진다.
        } catch (FileNotFoundException e) { // 파일을 찾을 수 없으면
            System.err.println("Write open error..."); // 파일을 열 수 없다는 오류 출력
            System.exit(2); // 오류코드 2 반환 후 프로그램 종료
        } catch (IOException e) { // ioexception을 받아줍니다
        }

        Student st1; // 받아줄 학생 1번 객체 생성
        Student st2; // 받아줄 학생 2번 객체 생성

        try {
            st1 = (Student)os.readObject(); // readObject 메소드로 학생 데이터 Student객체에 입력받기
            st2 = (Student)os.readObject(); // readObject 메소드로 학생 데이터 Student객체에 입력받기

            System.out.println(st1.getName() + ", " + st2.getName()); // 입력받은 객체의 이름 필드 출력
            os.close(); // 파일 닫기
        } catch (ClassNotFoundException e) { // ClassNotFoundException을 받아줍니다.
        } catch (IOException e) { // ioexception을 받아줍니다
        }
        System.out.println("Object write success..."); // 객체 작성 성공을 알리는 메세지
    }
}

public class STEP_15_IO_6 {
    public static void main(String[] args) {
        new IO_61().io_test();
        new IO_62().io_test();
    }
}


// 객체를 읽고 쓰는 것도 가능한데 읽고 쓰려는 객체에 Serializable을 이식하고
// ObjectInputStream을 통해 읽고 쓰는 것이 가능합니다.
// 다만 iostream이므로 바이너리 파일로 저장되긴 합니다...