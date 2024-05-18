import java.util.*;

class Student { // 학생 클래스 생성
    String name; // 이름 필드 생성
    Integer age; // 나이 필드 생성

    Student(String name, Integer age){ // 객체 생성자로 이름, 나이 입력받고 객체화
        this.name = name;
        this.age = age;
    }
    String getName(){ // 이름 반환 메소드
        return (name); // 현재 이름 필드 반환
    }
}

class ArrayList_31 { // 정수형 클래스로 배열 리스트 테스트
    void arrayList_test(){
        ArrayList<Integer> data1 = new ArrayList<Integer>();
        ArrayList<Integer> data2; // ArrayList<int> data2;
        data2 = new ArrayList<Integer>();
        for(int i = 0; i < 9; i++){
            data2.add(i); //data2.add(new Integer(i));
        }
        // int i1 = data2.indexOf(new Integer(8)); // 원본 코드
        int i1 = data2.indexOf(Integer.valueOf(8));
        int i2 = data2.indexOf(8);
        int i3 = data2.indexOf(12);
        System.out.printf("31 : size %d, i1 = %d, i2 = %d, i3 = %d\n", data2.size(), i1, i2, i3);
    }
}

class ArrayList_32 { // 문자열 클래스로 배열 리스트 테스트
    void arrayList_test(){
        ArrayList<String> name = new ArrayList<String>(); // 스트링형 제네릭을 가진 ArrayList 클래스 객체 지시자를 생성하고 거기에 String형 제네릭을 가진 ArrayList를 생성
        name.add("Kim");
        name.add("Lee");
        name.add("Park");

        int j1 = name.indexOf(new String("Lee")); // 해당 요소의 처음 위치 반환 // 해당 요소는 처음부터 시작되므로 1 반환
        int j2 = name.indexOf("Lee"); // 해당 요소의 처음 위치 반환 // 해당 요소는 처음부터 시작되므로 1 반환
        int j3 = name.indexOf("Choi"); // 해당 요소의 처음 위치를 반환하지만 Choi는 배열에 들어있지 않다. 따라서 -1이 된다
        System.out.printf("32 : size %d, j1 = %d, j2 = %d, j3 = %d\n", name.size(), j1, j2, j3); // 로직 확인용 출력
    }
}

class ArrayList_33 {
    void arrayList_test(){
        ArrayList<Student> std = new ArrayList<>(); // 제네릭을 비워두면 컴파일러가 자료형을 판단, 모든 데이터가 들어갈 수 있다.
        Student lee = new Student("Lee", 19); // Student형 클래스를 Lee와 19를 객체 생성자에 넘겨주면서 생성
        std.add(new Student("Lee", 19)); // std.add로 데이터 직접 new로 생성하고 할당
        std.add(lee); // 아까 생성한 lee 직접 할당
        std.add(new Student("Kim", 18)); // std.add로 데이터 직접 new로 생성하고 할당
        std.add(new Student("Park", 20)); // std.add로 데이터 직접 new로 생성하고 할당

        int le1 = std.indexOf(lee); // lee가 처음 시작하는 위차 반환 lee 요소는 처음에 시작하는 요소이므로 1 반환
        int le2 = std.indexOf(new Student("Lee", 19)); // new로 생성한 lee는 다른 객체이기에 요소로 있지 않으므로 -1 반환

        System.out.printf("32 : size %d, k1 = %d, k2 = %d\n", std.size(), le1, le2); // 로직 확인용 출력
    }
}

public class STEP_13_Array_3 {

    public static void main(String[] args) {
        new ArrayList_31().arrayList_test();
        new ArrayList_32().arrayList_test();
        new ArrayList_33().arrayList_test();
    }
}