import java.io.*;

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String get_name(){
        return name;
    }
    int get_age(){
        return age;
    }
}

class Students extends Person {
    String univ;

    Students(String name, int age, String univ){
        super(name, age);
        this.univ = univ;
    }
    String get_univ(){
        return univ;
    }
}

class Worker extends Person {
    String corp;

    Worker(String name, int age, String corp){
        super(name, age);
        this.corp = corp;
    }
    String get_corp(){
        return corp;
    }
}


class H1_Person {
    public static void main(String[] args) throws IOException {

        String sname, suniv, wname, wcorp;
        int sage, wage;
        
        Students student = new Students("장원영", 23, "강릉원주대학교");
        Worker worker = new Worker("장원영", 30, "토스");

        sname = student.get_name();
        sage = student.get_age();
        suniv = student.get_univ();

        wname = worker.get_name();
        wage = worker.get_age();
        wcorp = worker.get_corp();

        System.out.printf("%s %d %s\n", sname, sage, suniv);
        System.out.printf("%s %d %s\n", wname, wage, wcorp);
    }
}
