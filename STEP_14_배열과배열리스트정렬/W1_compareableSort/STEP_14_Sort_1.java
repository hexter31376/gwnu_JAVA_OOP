import java.util.*;

class Student {
    String name;
    Integer age;
    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return (name);
    }
}

class Sort_11 {
    void sort_test(){
        int[] mrk = {19, 18, 20};

        System.out.println("Sort_11...");

        Arrays.sort(mrk);

        for(int i : mrk){
            System.out.printf("%d", i);
        }
        System.out.printf("\n");
    }
}

class Sort_12 {
    void sort_test(){
        Integer[] mrk = new Integer[] {19, 18, 20};

        System.out.println("Sort_12...");

        Arrays.sort(mrk);
        Arrays.sort(mrk, Collections.reverseOrder());

        for(int i : mrk){
            System.out.printf("%d", i);
        }
        System.out.printf("\n");
    }
}

class Sort_13 {
    void sort_test(){
        String[] mrk = new String[] {19, 18, 20};

        System.out.println("Sort_13...");

        Arrays.sort(mrk);
        Arrays.sort(mrk, Collections.reverseOrder());

        for(int i : mrk){
            System.out.printf("%d", i);
        }
        System.out.printf("\n");
    }
}

class STEP_14_Sort_1 {
    
}

// 대소 비교가 가능한 기본 타입 및 포장 클래스 배열을 Arrays.sort 메소드에 넣어주면 오름차순으로 정렬해줍니다.
// Collections.reverseOrder()메소드를 매개변수로 추가로 넣어주면 역순으로 정렬해줍니다
// 메소드 즉 함수도 포인터가 있고 이것을 지정해주는 포인터를 넘겨주면서 콜백을 구현할 수 있는 것입니다.