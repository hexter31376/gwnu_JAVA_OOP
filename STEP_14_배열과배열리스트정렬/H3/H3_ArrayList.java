import java.util.*;

class Student {
    private String name;
    private Integer age;

    Student (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    String getName () {
        return name;
    }
    Integer getAge () {
        return age;
    }
}

class ArrLst_Std {
    private ArrayList<Student> als;

    ArrLst_Std () {
        als = new ArrayList<>();
    }

    void addStd (String name, Integer age) {
        als.add (new Student(name, age));
    }
    void srtStd () {
        Collections.sort(als, (st1, st2) -> {
            int compareResult = st1.getName().compareTo(st2.getName()); // 이름끼리 비교하고
            if (compareResult != 0) { // 둘이 같지 않으면
                return compareResult; // 그 결과 리턴
            } else { // 둘이 같으면
                return st1.getAge().compareTo(st2.getAge()); // 나이로 비교한 값 리턴
            }
        });
    }
    void prtStd () {
        for (Student st : als) {
            System.out.println(st.getName() + " " + st.getAge());
        }
    }
}

public class H3_ArrayList {
    public static void main(String[] args) {
        ArrLst_Std alst = new ArrLst_Std();

        alst.addStd("Choi", 19);
        alst.addStd("Hong", 18);
        alst.addStd("Park", 20);
        alst.addStd("Hong", 19);
        alst.addStd("Choi", 20);
        alst.addStd("Park", 21);

        alst.prtStd();
        System.out.println("--------------------");
        alst.srtStd();
        alst.prtStd();
    }
}
