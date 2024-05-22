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

class Sort_41 { // 크기가 고정되지 않은 집단 데이터의 대표적 예시인 ArrayList의 정렬 예시 클래스
    void sort_test() {
        ArrayList<Integer> std = new ArrayList<>(); // 배열 리스트 생성

        std.add(3); // 배열 리스트에 요소 집어넣기
        std.add(2); // 배열 리스트에 요소 집어넣기
        std.add(4); // 배열 리스트에 요소 집어넣기

        System.out.println("Sort_41"); // 해당 객체를 실행했음을 알려주는 출력

        Collections.sort(std); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬

        int i1; // i번째 원소값 획득을 위한 변수 선언
        for(int i = 0; i < std.size(); i++){ // 일반 반복문으로 반복
            i1 = std.get(i); // 원소를 얻고
            System.out.printf("%d", i1); // 해당 원소 출력
        }
        System.out.printf("\n"); // 개행

        for(int i2 : std){ // 배열 반복문으로 반복
            System.out.printf("%d", i2); // 해당 원소 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_42 { // 크기가 고정되지 않은 집단 데이터의 대표적 예시인 ArrayList의 정렬 예시 클래스
    void sort_test() {
        ArrayList<String> std = new ArrayList<>(); // 배열 리스트 생성

        std.add("Lee"); // 배열 리스트에 요소 집어넣기
        std.add("Kim"); // 배열 리스트에 요소 집어넣기
        std.add("Park"); // 배열 리스트에 요소 집어넣기

        System.out.println("Sort_42"); // 해당 객체를 실행했음을 알려주는 출력

        Collections.sort(std); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬

        for(String s : std){ // 배열 반복문으로 반복
            System.out.printf("%s", s); // 해당 원소 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_43 { // 크기가 고정되지 않은 집단 데이터의 대표적 예시인 ArrayList의 정렬 예시 클래스
    void sort_test() {
        ArrayList<Student> std = new ArrayList<>(); // 배열 리스트 생성

        std.add(new Student("Lee", 18)); // 배열 리스트에 요소 집어넣기
        std.add(new Student("Kim", 19)); // 배열 리스트에 요소 집어넣기
        std.add(new Student("Park", 20)); // 배열 리스트에 요소 집어넣기

        System.out.println("Sort_43"); // 해당 객체를 실행했음을 알려주는 출력

        Comparator<Student> cmp = new Comparator<Student>() { // Student 배열을 대소가 없으므로 
            public int compare(Student st1, Student st2) {
                return (st1.getName().compareTo(st2.getName()));
            }
        };

        Collections.sort(std, cmp); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬
        Collections.sort(std, (Student st1, Student st2) -> st1.getName().compareTo(st2.getName())); // 비교 불가능 원소의 경우 Compareator 인터페이스 객체를 넘겨주어야 작동합니다.
        Collections.sort(std, (st1, st2) -> st1.getName().compareTo(st2.getName())); // 더욱 더 축약하여 표현한 람다식

        for(Student st : std){ // 배열 반복문으로 반복
            System.out.printf("%s", st.getName()); // 해당 원소 출력
        }
        System.out.printf("\n"); // 개행
    }
}

class Sort_44 { // 크기가 고정되지 않은 집단 데이터의 대표적 예시인 ArrayList의 정렬 예시 클래스
    void sort_test() {
        ArrayList<Student> std = new ArrayList<>(); // 배열 리스트 생성
        std.add(new Student("Lee", 18)); // 배열 리스트에 요소 집어넣기
        std.add(new Student("Kim", 19)); // 배열 리스트에 요소 집어넣기
        std.add(new Student("Park", 20)); // 배열 리스트에 요소 집어넣기

        System.out.println("Sort_44"); // 해당 객체를 실행했음을 알려주는 출력

        Function<Student, String> fun =
        new Function<Student, String>() {
            public String apply(Student st) {
                return st.getName();
            }
        };

        Comparator<Student> cmp1 = Comparator.comparing(fun);
        Comparator<Student> cmp2 = Comparator.comparing( (Student st) -> {return (st.getName()); });
        Comparator<Student> cmp3 = Comparator.comparing( (Student st) -> st.getName() );
        Comparator<Student> cmp4 = Comparator.comparing( (st) -> st.getName() );
        Comparator<Student> cmp5 = Comparator.comparing( Student::getName );

        Collections.sort(std, cmp1); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬
        Collections.sort(std, cmp2); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬
        Collections.sort(std, cmp3); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬
        Collections.sort(std, cmp4); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬
        Collections.sort(std, cmp5); // 정렬하고자 하는 크기가 고정되지 않은 집단 데이터의 정렬

        Collections.sort(std, Collections.reverseOrder(cmp1)); // 리버스 오더를 정렬 기준으로 주고 그거의 정렬 기준을 cmp1을 준다.
        System.out.printf("\n"); // 개행
    }
}

public class STEP_14_Sort_4 {
    public static void main(String[] args) {
        new Sort_41().sort_test();
        new Sort_42().sort_test();
        new Sort_43().sort_test();
        new Sort_44().sort_test();
    }
}