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

class ArrayList_31 {
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

class ArrayList_32 {
    void arrayList_test(){
        ArrayList<String> name = new ArrayList<String>();
        name.add("Kim");
        name.add("Lee");
        name.add("Park");

        int j1 = name.indexOf(new String("Lee"));
        int j2 = name.indexOf("Lee");
        int j3 = name.indexOf("Choi");
        System.out.printf("32 : size %d, j1 = %d, j2 = %d, j3 = %d\n", name.size(), j1, j2, j3);
    }
}

class ArrayList_33 {
    void arrayList_test(){
        ArrayList<Student> std = new ArrayList<>(); // 제네릭을 비워두면 컴파일러가 자료형을 판단, 모든 데이터가 들어갈 수 있다.
        Student lee = new Student("Lee", 19);
        std.add(new Student("Lee", 19));
        std.add(lee);
        std.add(new Student("Kim", 18));
        std.add(new Student("Park", 20));

        int le1 = std.indexOf(lee);
        int le2 = std.indexOf(new Student("Lee", 19));

        System.out.printf("32 : size %d, k1 = %d, k2 = %d\n", std.size(), le1, le2);
    }
}

public class STEP_13_Array_3 {

    public static void main(String[] args) {
        new ArrayList_31().arrayList_test();
        new ArrayList_32().arrayList_test();
        new ArrayList_33().arrayList_test();
    }
}