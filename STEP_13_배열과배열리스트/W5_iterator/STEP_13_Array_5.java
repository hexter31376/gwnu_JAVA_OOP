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

class ArrayList_51 {
    void arrayList_test(){
        ArrayList<Student> std = new ArrayList<>();
        
        std.add(new Student("Lee", 19));
        std.add(new Student("Kim", 18));
        std.add(new Student("Park", 20));

        System.out.println("Array_51");

        Student sa;
        for (int i = 0; i < std.size(); i++){
            sa = std.get(i);
            System.out.printf("%s", sa.getName());
        }
        System.out.printf("\n");

        for (Student sb: std){
            System.out.printf("%s", sb.getName());
        }
        System.out.printf("\n");
    }
}

class ArrayList_52 {
    void arrayList_test(){
        ArrayList<Student> std = new ArrayList<>();

        std.add(new Student("Lee", 19));
        std.add(new Student("Kim", 18));
        std.add(new Student("Park", 20));

        System.out.println("Array_52");
        Iterator<Student> it = std.iterator();
        while (it.hasNext()){
            System.out.printf("%s", it.next().getName());
        }
        System.out.printf("\n");
    }
}

public class STEP_13_Array_5 {

    public static void main(String[] args) {
        new ArrayList_51().arrayList_test();
        new ArrayList_52().arrayList_test();
    }
}