import java.util.*; // 배열 및 배열 부가 기능을 사용하기 위한 import

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

class StdComparator implements Comparator<Student> { // Comparator 인터페이스를 구현한 StdComparator 클래스
    public int compare(Student s1, Student s2) { // 앞의 요소가 작다면 -1, 앞의 요소가 크다면 1, 둘의 요소가 같다면 0을 반환하는 함수를 정의
        int c;
        c = s1.getName().compareTo(s2.getName());
        // if(s1.getName() > s2.getName()) c = 1;
        // else if(s1.getName() < s2.getName()) c = -1;
        // else if(s1.getName() == s2.getName()) c = 0;
        return c; // 이 리턴값이 정렬 시 요소의 교환 여부를 결정, 음수, 양수, 0이 옵션이 될 수 있음
    }
}

/*
/* 크기가 없는 요소(ex. 클래스)에 대해서는 기본 Sort를 진행할 수 없다. 따라서 이를 정렬하려면 사용자가 어떤 분류 순서를 따를 것인지를 정의해 주어야한다.
/* 이를 정렬 알고리즘에서 모두 구현하기는 불가능하다. 크기가 없는 요소에 대해서는 무수히 많은 판단 요소가 있기 때문이다.
/* 따라서 정렬 기준에 대해서는 사용자가 구현하게 진행하고
/* 그 정렬 기준을 사용자가 정하여 메소드로 구현하고 그 메소드의 주소를 넘겨주는데 매개변수에 함수의 주소가 들어가는 이것을 콜백함수라고 부른다.
/* 이것을 통해 사용자가 임의로 정한 분류 기준임에도 정렬 알고리즘은 정상적으로 정렬을 진행할 수 있다.
/* Array.sort 메소드에 두번째 파라미터로 들어갈 콜백 함수의 클래스가 정의된 모습이다.
/* 위 정렬 기준이 오름차순 정렬을 진행하는 것을 미루어보아 앞의 요소가 작으면 교환을 안한다.
/* 이때의 리턴 값으로 추정되는 것이 -1과 0이므로 1이면 교환, 그 외의 값이면 교환을 안하는 것으로 추정된다.
*/

class Sort_21 { // 대소비교가 불가능한 일반 클래스의 정렬 테스트 및 정렬 순서 반전 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_21..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, new StdComparator()); // std 배열을 정렬하는 기준을 아까 만들어준 사용자 정의 콜백함수로 정의

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_22 { // 익명 Comparator 클래스를 사용하는 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_22..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, new Comparator<Student>() { // 익명 클래스를 사용하여 정렬
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_23 { // 람다식을 사용하는 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_23..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, (Student st1, Student st2) -> { // 람다식을 사용하여 정렬
            return st1.getName().compareTo(st2.getName());
        });

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_24 { // 간결한 람다식을 사용하는 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_24..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, (Student st1, Student st2) -> st1.getName().compareTo(st2.getName())); // 간결한 람다식

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_25 { // 역순 정렬 테스트
    void sort_test() {
        Student[] std = new Student[]{new Student("Lee", 19), new Student("Kim", 18), new Student("Park", 20)}; // Student 클래스 배열 생성 및 값 할당

        System.out.println("Sort_25..."); // 어떤 클래스를 실행했는지 알려주는 print

        Arrays.sort(std, (Student st1, Student st2) -> st2.getName().compareTo(st1.getName())); // 역순 정렬

        for (Student s : std) { // 배열 반복문으로 std 순회하고 순회한 값 s에 저장
            System.out.printf("%s ", s.getName()); // s 출력
        }
        System.out.printf("\n"); // 개행
    }
}

public class STEP_14_Sort_2 {
    public static void main(String[] args) {
        new Sort_21().sort_test();
        new Sort_22().sort_test();
        new Sort_23().sort_test();
        new Sort_24().sort_test();
        new Sort_25().sort_test();
    }
}