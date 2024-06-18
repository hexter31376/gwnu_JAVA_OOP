import java.lang.reflect.*;

class Student {
    String name;
    int age;

    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName () {
        return (name);
    }

    boolean FlagNew = true;
    String getAge_new () {
        return (Integer.toString(age));
    }
    /* 
    int getAge () {
         return (age);
    }
     */
}

public class STEP_17_Annotation_2 {
    
}
