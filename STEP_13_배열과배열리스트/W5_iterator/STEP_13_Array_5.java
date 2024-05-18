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

class ArrayList_51 { // 학생 클래스 배열을 만들고 그 학생 클래스 배열의 값 출력을 일반 반복문, 배열 반복문으로 돌리는 클래스
    void arrayList_test(){
        ArrayList<Student> std = new ArrayList<>(); // 학생 클래스를 저장할 수 있는 배열 리스트 생성
        
        std.add(new Student("Lee", 19)); // add 메소드로 스튜던트 클래스를 동적 생성하고 객체 생성자에 값을 넣어주고 값 추가
        std.add(new Student("Kim", 18)); // add 메소드로 스튜던트 클래스를 동적 생성하고 객체 생성자에 값을 넣어주고 값 추가
        std.add(new Student("Park", 20)); // add 메소드로 스튜던트 클래스를 동적 생성하고 객체 생성자에 값을 넣어주고 값 추가

        System.out.println("Array_51"); // 현재 클래스가 무엇인지 출력

        Student sa; // 리스트 요소 1개를 저장할 sa
        for (int i = 0; i < std.size(); i++){ // 배열 요소의 길이만큼 반복 // 일반 반복문
            sa = std.get(i);
            System.out.printf("%s", sa.getName());
        }
        System.out.printf("\n");

        for (Student sb: std){ // 배열 요소의 길이만큼 반복 // 배열 반복문
            System.out.printf("%s", sb.getName());
        }
        System.out.printf("\n"); // 개행용 프린트 구문
    }
}

class ArrayList_52 {
    void arrayList_test(){
        ArrayList<Student> std = new ArrayList<>(); // 학생 클래스를 저장할 수 있는 배열 리스트 생성

        std.add(new Student("Lee", 19)); // add 메소드로 스튜던트 클래스를 동적 생성하고 객체 생성자에 값을 넣어주고 값 추가
        std.add(new Student("Kim", 18)); // add 메소드로 스튜던트 클래스를 동적 생성하고 객체 생성자에 값을 넣어주고 값 추가
        std.add(new Student("Park", 20)); // add 메소드로 스튜던트 클래스를 동적 생성하고 객체 생성자에 값을 넣어주고 값 추가

        System.out.println("Array_52"); // 현재 클래스가 무엇인지 출력
        Iterator<Student> it = std.iterator(); // 해당 스튜던트 배열을 지정할 반복자 it에게 iterator 속성을 부여하고 iterator 메소드로 순서를 부여
        while (it.hasNext()){ // it의 다음 요소가 없을때 까지
            System.out.printf("%s", it.next().getName()); // it의 다음요소의 이름을 출력
        }
        System.out.printf("\n"); // 개행용 프린트 구문
    }
}

public class STEP_13_Array_5 {

    public static void main(String[] args) {
        new ArrayList_51().arrayList_test(); // 클래스 객체화 및 메소드 실행
        new ArrayList_52().arrayList_test(); // 클래스 객체화 및 메소드 실행
    }
}