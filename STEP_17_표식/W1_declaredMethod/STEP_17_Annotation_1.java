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
    String getAge_new () { // 나이 필드를 String으로 바꾸어서 리턴
        return (Integer.toString(age));
    }
    /*
    int getAge () { // 나이를 리턴(주석 처리됨)
        return (age);
    }
    */
}

class Annotation_11 {
    Annotation_11 () {
        Method m1 = null, m2 = null;
        int age = 0;
        Student st = new Student("Lee", 19);

        try {
            m1 = st.getClass().getDeclaredMethod("getAge_new");
        } catch (NoSuchMethodException e) {
        }

        if (m1 = != null) {
            try {
                age = Integer.valueOf((String)m1.invoke(st));
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        } else {
            try {
                m2 = st.getClass().getDeclaredMethod("getAge");
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        System.out.println("Annotation_11 : Age = " + age);
    }
}

public class STEP_17_Annotation_1 {
    public static void main(String[] args) {
        
    }
}
