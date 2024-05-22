import java.util.*; // 배열 및 배열 부가 기능을 사용하기 위한 import
import java.util.function.*; // 비교 불가능 원소에서 비교 가능 키값을 뽑아내기 위한 funtion 사용을 위한 매개변수

class Student { // Student 클래스 선언
    String name; // 이름 필드와
    Integer age; // 나이 필드로 구성

    Student(String name, Integer age) { // 객체 생성자로 받은 이름과 나이를 필드에 넣어주기
        this.name = name;
        this.age = age;
    }

    String getName() { // 현재 객체의 이름을 얻는 메소드
        return name;
    }
}

class mycmp implements Function<Student, String> { // 주어진 원소에 대하여 키값을 알려주는 함수를 Function 인터페이스로 구현합니다. 여기서 제네릭으로 들어가는 데이터타입은 순서대로 원소, 키값입니다.
    public String apply(Student s) { // 실제 원소를 받으면
        return s.getName(); // 키값을 반환합니다.
    }
}
/* Funtion 인터페이스를 사용자 정의 콜백함수에 심어줌으로서 비교가 불가능한 class 원소에서 비교가 가능한 key값을 뽑아낼 수 있습니다. */

class Sort_31 { // 대소비교가 불가능한 일반 클래스의 정렬 테스트 및 정렬 순서 반전 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_31..."); // 어떤 클래스를 실행했는지 알려주는 print

        Comparator cmp = Comparator.comparing(new mycmp()); // 비교 가능한 키 값을 얻어주는 메소드 mycmp를 Comparator의 comparing메소드에 생성과 동시에 매개변수로 넘겨줍니다.
        Arrays.sort(std, cmp); // 해당 객체화된 비교자를 매개변수로 넘겨줍니다.

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_32 { // 익명 Comparator 클래스를 사용하는 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        Function<Student, String> stdcmp = new Function<Student,String>() { // Funtion 객체도 역시 이런 식으로 익명 생성이 가능합니다.
            public String apply(Student st) {
                return st.getName();
            }
        };

        System.out.println("Sort_32..."); // 어떤 클래스를 실행했는지 알려주는 print
        Arrays.sort(std, Comparator.comparing(stdcmp));// 익명으로 생성한 stdcmp Funtion을 Comparator의 comparing메소드에 생성과 동시에 매개변수로 넘겨줍니다.

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_33 { // 람다식을 사용하는 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_33..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, Comparator.comparing( (st) -> {return (st.getName()); })); // Funtion 메소드도 람다식 적용이 가능합니다.

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_34 { // 간결한 람다식을 사용하는 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_34..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, Comparator.comparing( (st) -> st.getName())); //  Funtion 메소드도 간결한 람다식 적용이 가능합니다.

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_35 { // 역순 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_35..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, Comparator.comparing(Student::getName)); // 이런 식으로 극한의 축약이 가능합니다. Student::getName 처럼 넣어주어도 내부적으로 funtion 비교처리가 가능합니다.

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

public class STEP_14_Sort_3 {
    public static void main(String[] args) {
        new Sort_31().sort_test();
        new Sort_32().sort_test();
        new Sort_33().sort_test();
        new Sort_34().sort_test();
        new Sort_35().sort_test();
    }
}