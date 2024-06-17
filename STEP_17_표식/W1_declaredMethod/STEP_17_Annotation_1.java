import java.lang.reflect.*;

class Student { // 학생 클래스
    String name; // 이름 필드
    int age; // 나이 필드

    Student (String name, int age) { // 객체 생성자, 학생 이름과 나이를 매개변수로
        this.name = name; // 매개변수 이름을 필드이름에 넣기
        this.age = age; // 매개변수 이름을 필드 이름에 넣기
    }

    String getName () { // 이름 필드 값 반환 메소드
        return (name); // 이름 필드 값 리턴
    }
    String getAge_new () { // 나이 필드를 String으로 바꾸어서 리턴
        return (Integer.toString(age)); // 나이 필드를 String으로 반환
    }
    /*
    int getAge () { // 나이를 리턴(주석 처리됨)
        return (age);
    }
    */
}

class Annotation_11 {
    Annotation_11 () {
        Method m1 = null, m2 = null; // 메소드 클래스 객체 지시자 m1과 m2를 선언하고 그 길이를 
        int age = 0; // 이름 선언 후 0으로 초기화
        Student st = new Student("Lee", 19); // 새로운 학생 객체 생성

        try { // 예외 캐치하기
            m1 = st.getClass().getDeclaredMethod("getAge_new"); // st 객체의 클래스를 얻고 그 클래스에서 정의된 메소드를 얻는데 getAge_new라는 이름의 메소드를 얻습니다.
        } catch (NoSuchMethodException e) { // 없는 메소드 예외 캐치
        }

        if (m1 != null) { //m1이 null이 아니면
            try { // 예외 캐치하기
                age = Integer.valueOf((String)m1.invoke(st)); // st에 저장된 메소드를 가지고 옵니다.
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
        System.out.println("Annotation_11 : Age = " + age);
    }
}

class Annotation_12 {
    Annotation_12 () {
        Method m1 = null, m2 = null;
        int age = 0;
        Student st = new Student("Lee", 19);

        Class<? extends Student> sc = st.getClass(); // Student 클래스와 그 후손 클래스를 모두 포함하는 st.getClass
        try {
            if ((m1 = sc.getDeclaredMethod("getAge")) != null) {
                age = (int)m1.invoke(st);
            }
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }

        System.out.println("Annotation_12 : Age = " + age);
    }
}

class Annotation_13 {
    Annotation_13 () {
        Method m1 = null;
        int age = 0;
        Student st = new Student("Lee", 19);

        Class<Student> sc = Student.class;
        try {
            m1 = sc.getDeclaredMethod("getAge_new");
            age = Integer.valueOf((String)m1.invoke(st));
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }

        System.out.println("Annotation_13 : Age = " + age);
    }
}
public class STEP_17_Annotation_1 {
    public static void main(String[] args) {
        new Annotation_11();
        new Annotation_12();
        new Annotation_13();
    }
}
