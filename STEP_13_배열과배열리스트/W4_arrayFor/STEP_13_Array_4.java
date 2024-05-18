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

class Array_41 {
    void array_test(){
        int[] data = new int[10];
        System.out.println("Array_41");

        for(int i = 0; i < data.length; i++){
            data[i] = (int)(Math.random() * 100);
        }
        int xa;
        for(int i = 0; i < data.length; i++){
            xa = data[i];
            System.out.printf("%d ", xa);
        }
        for(int xb: data){
            System.out.printf("%d ", xb);
        }
        System.out.printf("\n");
    }
}

class Array_42 {
    void array_test(){
        Student[] std = new Student[] {
            new Student("Lee", 18), new Student("Kim", 19),
            new Student("Park", 20) };
        System.out.println("Array_42");

        Student sa;
        for(int i = 0; i < std.length; i++){
            sa = std[i];
            System.out.printf("%s ", sa.getName());
        }
        System.out.printf("\n");

        for(Student sb: std){
            System.out.printf("%s ", sb.getName());
        }
    }
}

public class STEP_13_Array_4 {

    public static void main(String[] args) {
        new Array_41().array_test();
        new Array_42().array_test();
    }
}