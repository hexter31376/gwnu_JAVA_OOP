import java.util.*; // 배열 및 배열 부가 기능을 사용하기 위한 import

class Student { // Student 클래스 선언
    String name; // 이름 필드와
    Integer age; // 나이 필드로 구성

    Student(String name, Integer age){ // 객체 생성자로 받은 이름과 나이를 필드에 넣어주기
        this.name = name;
        this.age = age;
    }
    String getName(){ // 현재 객체의 이름을 얻는 메소드
        return (name);
    }
}

class Sort_11 { // 단순 정수의 정렬 테스트
    void sort_test(){
        int[] mrk = {19, 18, 20}; // 정수 배열 생성 및 값 할당

        System.out.println("Sort_11..."); // 어떤 클래스를 실행했는지 알려주는 print
        Arrays.sort(mrk); // mrk 배열 정렬

        for(int i : mrk){ // 배열 반복문으로 mrk 순회하고 순회한 값 i에 저장
            System.out.printf("%d ", i); // i 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_12 { // 정수 클래스의 정렬 테스트 및 정렬 순서 반전 테스트
    void sort_test(){
        Integer[] mrk = new Integer[] {19, 18, 20}; // 정수 클래스 배열 생성 및 값 할당

        System.out.println("Sort_12..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(mrk); // mrk 배열 정렬
        Arrays.sort(mrk, Collections.reverseOrder()); // mrk 배열을 정렬하는데 역순으로 정렬할것을 콜백으로 정의

        for(Integer i : mrk){ // 배열 반복문으로 mrk 순회하고 순회한 값 i에 저장
            System.out.printf("%d ", i); // i 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_13 { // 문자열 클래스의 정렬 테스트 및 정렬 순서 반전 테스트
    void sort_test(){
        String[] name = new String[] {"Lee", "Kim", "Park"}; // 문자열 클래스 배열 생성 및 값 할당

        System.out.println("Sort_13..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(name); // name 배열 정렬
        Arrays.sort(name, Collections.reverseOrder()); // name 배열을 정렬하는데 역순으로 정렬할 것을 콜백으로 정의

        for(String s : name){ // 배열 반복문으로 name 순회하고 순회한 값 s에 저장
            System.out.printf("%s", s); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_14 { // 대소비교가 불가능한 일반 클래스의 정렬 테스트 및 정렬 순서 반전 테스트
    void sort_test(){
        Student[] std = new Student[] {new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_14..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std); // std 배열 정렬
        Arrays.sort(std, Collections.reverseOrder()); // std 배열을 정렬하는 역순으로 정렬할 것을 콜백으로 정의

        for(Student s : std){ // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class STEP_14_Sort_1 {
    public static void main(String[] args) {
        new Sort_11().sort_test(); // 정수 배열 정렬 클래스 객체화
        new Sort_12().sort_test(); // 정수 클래스 배열 정렬 클래스 객체화
        new Sort_13().sort_test(); // 문자열 클래스 배열 정렬 클래스 객체화
        // new Sort_14().sort_test(); Student 클래스와 같이 원소 비교가 불가능한 일반 클래스끼리의 단순 비교는 허용되지 않습니다.
    }
}

// 대소 비교가 가능한 기본 타입 및 포장 클래스 배열을 Arrays.sort 메소드에 넣어주면 오름차순으로 정렬해줍니다.
// Collections.reverseOrder()메소드를 매개변수로 추가로 넣어주면 역순으로 정렬해줍니다
// 메소드 즉 함수도 포인터가 있고 이것을 지정해주는 포인터를 넘겨주면서 콜백을 구현할 수 있는 것입니다.