import java.util.*;

class Student {
    private String name;
    private Integer age;
    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return (name);
    }
    Integer getAge(){
        return (age);
    }
}

class StdComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        int c;
        c = s2.getName().compareTo(s1.getName());

        if(c == 0){
            c = s2.getAge().compareTo(s1.getAge());
        }
        return (c);
    }
}

class Arr_Std {
    private Student[] std;
    private int nstd = 0;

    Arr_Std(){
        std = new Student[6];
    }
    void addstd(String name, Integer age){
        std[nstd++] = new Student(name, age);
    }

    void srtstd_6(){
            Arrays.sort(std, new StdComparator());
    }

    void prtstd(){
        for(Student st : std){
            System.out.println(st.getName() + " " + st.getAge());
        }
    }
}

public class H2_ArraySort {
    public static void main(String[] args) {
        Arr_Std arst = new Arr_Std();
    
        arst.addstd("choi", 19);
        arst.addstd("Hong", 20);
        arst.addstd("Park", 20);
        arst.addstd("Hong", 19);
        arst.addstd("Choi", 20);
        arst.addstd("Park", 21);

        arst.prtstd();
        arst.srtstd_6();
        arst.prtstd();
    }
}
