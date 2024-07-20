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

class Annotation_21 {
    Annotation_21 () {
        Method m1 = null, m2 = null;
        int age = 0;
        Student st = new Student("Lee", 19);

        if (st.FlagNew) {
            try {
                m1 = st.getClass().getDeclaredMethod("getAge_new");
                age = Integer.valueOf((String)m1.invoke(st));
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        } else {
            try {
                m2 = st.getClass().getDeclaredMethod("getAge");
                age = Integer.valueOf((String)m2.invoke(st));
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        System.out.println("Annotation_21 : Age = " + age);
    }
}

class Annotation_22 {
    Annotation_22 () {
        Method m1 = null, m2 = null;
        Field nwf = null;
        int age = 0;
        Student st = new Student("Lee", 19);

        try {
            nwf = st.getClass().getDeclaredField("FlagNew");
        } catch (NoSuchFieldException e) {
        }

        if (nwf != null) {
            try {
                m1 = st.getClass().getDeclaredMethod("get_Age_new");
                age = Integer.valueOf((String)m1.invoke(st));
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        } else {
            try {
                m2 = st.getClass().getDeclaredMethod("getAge");
                age = (int)m2.invoke(st);
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        System.out.println("Annotation_22 : Age = " + age);
    }
} 
public class STEP_17_Annotation_2 {
    public static void main(String[] args) {
        new Annotation_21();
        new Annotation_22();
    }
}
