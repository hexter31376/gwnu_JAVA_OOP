import java.lang.reflect.*;
import java.lang.annotation.*;

@interface FlagNew_31 {}

@Retention (RetentionPolicy.SOURCE)
@interface FlagNew_32 {}

@Retention (RetentionPolicy.CLASS)
@interface FlagNew_33 {}

@Retention (RetentionPolicy.RUNTIME)
interface FlagNew_34 {}

class Student {
    @FlagNew_31
    String name;

    @FlagNew_32
    int age;

    Student (String name,  int age) {
        this.name = name;
        this.age = age;
    }

    @FlagNew_33
    String getName () {
        return (name);
    }

    @FlagNew_34
    String getAge () {
        return (Integer.toString(age));
    }
    /*
    int getAge () {
        return (age);
    }
     */
}

class Annotation_31 {
    Annotation_31 () {
        Field fn = null, fa = null;
        Method gn = null, ga = null;
        Student st = new Student ("Lee", 19);

        System.out.println("Annotation_31");
        try {
            fn = st.getClass().getDeclaredField("name");
            if (fn.isAnnotationPresent(FlagNew_31.class)) {
                System.out.println("Annotation 'FlagNew_31' is on field 'name' ...");
            } else {
                System.out.println("Annotation 'FlagNew_31' is not on field 'name' ...");
            }
            fa = st.getClass().getDeclaredField("age");


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}