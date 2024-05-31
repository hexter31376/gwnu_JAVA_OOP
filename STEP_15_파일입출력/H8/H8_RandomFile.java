import java.io.*;

class Student implements Serializable { // Serializable 인터페이스를 이식해 해당 객체를 ObjectOutputStream이 읽을 수 있게 해 준다.
    String name; // 이름 필드
    Integer age; // 나이 필드

    Student (String name, Integer age) { // 객체 생성자, 이름과 나이를 초기값으로 받고 필드에 적용한다
        setName(name); // 아래 서술된 setName으로 이름 설정
        this.age = age; // 매개변수 나이를 필드에 적용
    }
    String getName () { // 이름을 리턴하는 메소드
        return (name); // 이름 리턴
    }
    int getAge () { // 이름을 리턴하는 메소드
        return (age); // 이름 리턴
    }
    void setName (String name) { // 이름 설정 메소드
        this.name = name + "     ".substring(0, 5-name.length()); // 매개변수 이름을 필드에 넣어주는데 substring을 통해 문자열의 길이를 항상 5로 맞춰줍니다. (기본 상태 공백 5칸에서 문자열의 길이만큼 공백을 빼고 문자열 삽입)
    }
    void setAge (int age) { // 나이 설정 메소드
        this.age = age;
    }
}

class IO_71 {
    void io_test () {
        System.out.println("IO_71..."); // 해당 메소드의 실행을 알리는 출력

        RandomAccessFile raf = null; // 파일의 임의의 위치에 접근해서 읽기 쓰기를 할 수 있게 해 주는 RandomAccessFile 클래스 객체지시자 선언

        try {
            raf = new RandomAccessFile("record.bin", "rw"); // RandomAccessFile을 객체화하면서 객체 지시자에 순서대로 조작할 파일 이름 및 파일 모드를 지정합니다. r = read, w = write
        } catch (FileNotFoundException e) { // FileNotFoundException이 발생하면...
            System.err.println("Random file open error..."); // 오류가 발생했음을 출력
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        Student ost1 = new Student("Lee", 19); // 학생 정보 생성
        Student ost2 = new Student("Kim", 18); // 학생 정보 생성
        Student ost3 = new Student("Park", 20); // 학생 정보 생성

        try {
            raf.writeUTF(ost1.getName()); // 학생 클래스의 이름을 writeUTF 메소드로 작성
            raf.writeInt(ost1.getAge()); // 학생 클래스의 나이를 writeInt 메소드로 작성
            raf.writeUTF(ost2.getName()); // 학생 클래스의 이름을 writeUTF 메소드로 작성
            raf.writeInt(ost2.getAge()); // 학생 클래스의 나이를 writeInt 메소드로 작성
            raf.writeUTF(ost3.getName()); // 학생 클래스의 이름을 writeUTF 메소드로 작성
            raf.writeInt(ost3.getAge()); // 학생 클래스의 나이를 writeInt 메소드로 작성
            // UTF-8형식으로 문자열을 읽고 쓰기 위해 writeUTF를 사용합니다. 유니코드를 포함하는 것을 가정하고 있으므로 1바이트, 2바이트, 4바이트 등등의 다양한 유니코드가 입력되는데 길이 정보를 같이 저장하므로 readUTF 메소드로 제대로 읽어올 수 있게 됩니다.
            raf.close(); // 파일 닫기
        } catch (IOException e) { // IOException 캐치하기
        }
        System.out.println("Random file write success..."); // 객체 작성 성공을 알리는 메세지
    }
}

class IO_72 {
    void io_test () {
        System.out.println("IO_72..."); // 해당 메소드의 실행을 알리는 출력

        RandomAccessFile raf = null; // 파일의 임의의 위치에 접근해서 읽기 쓰기를 할 수 있게 해 주는 RandomAccessFile 클래스 객체지시자 선언

        try {
            raf = new RandomAccessFile("record.bin", "rw"); // RandomAccessFile을 객체화하면서 객체 지시자에 순서대로 조작할 파일 이름 및 파일 모드를 지정합니다. r = read, w = write
        } catch (FileNotFoundException e) { // FileNotFoundException이 발생하면...
            System.err.println("Random file open error..."); // 오류가 발생했음을 출력
            System.exit(1); // 오류코드 1 반환 후 프로그램 종료
        }

        Student ost1;
        Student ost2;
        Student ost3;

        try {
            raf.seek((7 + 4) * 2); // Student의 name(기본 5바이트 + utf로 인한 길이 정보 2바이트)과 age(int 4바이트)를 읽기 위해 seek 메소드를 이용합니다.
            ost1 = new Student(raf.readUTF(), raf.readInt()); // seek로 읽어온 커서 위치부터 학생 이름과 나이를 st 객체 지시자에 순서대로 저장
            System.out.println("1st: " + ost1.getName() + ", " + ost1.getAge()); // 해당 학생 이름과 이름 출력

            raf.seek((7 + 4) * 0); // Student의 name(기본 5바이트 + utf로 인한 길이 정보 2바이트)과 age(int 4바이트)를 읽기 위해 seek 메소드를 이용합니다.
            ost2 = new Student(raf.readUTF(), raf.readInt()); // seek로 읽어온 커서 위치부터 학생 이름과 나이를 st 객체 지시자에 순서대로 저장
            System.out.println("2nd: " + ost2.getName() + ", " + ost2.getAge()); // 해당 학생 이름과 이름 출력

            raf.seek((7 + 4) * 1); // Student의 name(기본 5바이트 + utf로 인한 길이 정보 2바이트)과 age(int 4바이트)를 읽기 위해 seek 메소드를 이용합니다.
            ost3 = new Student(raf.readUTF(), raf.readInt()); // seek로 읽어온 커서 위치부터 학생 이름과 나이를 st 객체 지시자에 순서대로 저장
            System.out.println("3rd: " + ost3.getName() + ", " + ost3.getAge()); // 해당 학생 이름과 이름 출력

            // seek 메소드는 바이트 단위 탐색을 지원한다. 즉 구조체 배열을 [0], [1]... 과 같이 배열 탐색하듯이 탐색하려면 위와 같이 탐색해주어야 한다
            raf.close(); // 파일 닫기
        } catch (IOException e) { // IOException 캐치하기
        }
        System.out.println("Random file write success..."); // 객체 작성 성공을 알리는 메세지
    }
}

class H8_RandomFile {
    public static void main(String[] args) {
        new IO_71().io_test();
        new IO_72().io_test();
    }
}