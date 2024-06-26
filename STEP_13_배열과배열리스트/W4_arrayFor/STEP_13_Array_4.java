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

class Array_41 { // 배열 전용 반복문 테스트 클래스
    void array_test(){
        int[] data = new int[10]; // 1차원 배열형 data 객체 지시자를 생성하고 거기에 10크기의 int 배열 동적 할당
        System.out.println("Array_41"); // 클래스 41을 실행했음을 알리는 프린트 구문

        for(int i = 0; i < data.length; i++){ // 데이터의 길이 만큼 랜덤 넘버 부여
            data[i] = (int)(Math.random() * 100);
        }

        int xa;
        for(int i = 0; i < data.length; i++){ // 데이터를 임시 저장할 xa를 선언하고 데이터가 저장된 순서대로 배열 요소를 빼서 하나씩 출력
            xa = data[i];
            System.out.printf("%d ", xa);
        }

        for(int xb: data){ // 출력하는 것은 동일하나 배열 전용 for문을 사용하였다.
            System.out.printf("%d ", xb);
        }
        System.out.printf("\n"); // 개행용 프린트 구문
    }
}

class Array_42 { // 학생 클래스형 클래스 배열 생성 클래스
    void array_test(){
        Student[] std = new Student[] { // 학생 배열 생성
            new Student("Lee", 18), new Student("Kim", 19),
            new Student("Park", 20) };
        System.out.println("Array_42");

        Student sa; // 학생 배열의 요소를 한개 지정한 변수 sa 선언
        for(int i = 0; i < std.length; i++){
            sa = std[i]; // sa에 배열의 i번째 요소 저장
            System.out.printf("%s ", sa.getName()); // sa의 getName클래스로 내용 출력
        }
        System.out.printf("\n"); // 개행용 프린트 구문

        for(Student sb: std){ // 배열 반복문으로 반복
            System.out.printf("%s ", sb.getName()); // sb의 getName클래스로 내용 출력
        }
    }
}

public class STEP_13_Array_4 {

    public static void main(String[] args) {
        new Array_41().array_test(); // 클래스 객체화 및 메소드 실행
        new Array_42().array_test(); // 클래스 객체화 및 메소드 실행
    }
}