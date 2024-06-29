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
        Method m1 = null, m2 = null; // 메소드 클래스 객체 지시자 m1과 m2를 선언하고 메소드 객체 지시자를 null로 초기화
        int age = 0; // 나이 변수 선언 후 0으로 초기화
        Student st = new Student("Lee", 19); // 새로운 학생 객체 생성

        try { // 예외 캐치하기
            m1 = st.getClass().getDeclaredMethod("getAge_new"); // st 객체의 클래스를 얻고 그 클래스에서 정의된 메소드를 얻는데 getAge_new라는 이름의 메소드를 얻습니다.
        } catch (NoSuchMethodException e) { // 없는 메소드 예외 캐치
        }

        if (m1 != null) { //m1이 null이 아니면
            try { // 예외 캐치하기
                age = Integer.valueOf((String)m1.invoke(st)); // st 객체 에 저장된 m2에 해당하는 메소드를 가지고 옵니다. 그 메소드의 리턴 값을 string으로 타입캐스팅하고 그 값을 정수형으로 바꾸어줍니다.
            } catch (IllegalAccessException e) { // IllegalAccessException 받아주기
            } catch (InvocationTargetException e) { // InvocationTargetException 받아주기
            }
        } else { // m1이 null 이면
            try {
                m2 = st.getClass().getDeclaredMethod("getAge"); // st 객체의 클래스를 얻고 그 클래스에서 정의된 메소드를 얻는데 getAge_new라는 이름의 메소드를 얻습니다.
                age = (int)m2.invoke(st); // st 객체 에 저장된 m2에 해당하는 메소드를 가지고 옵니다. 그 메소드의 리턴 값을 int형으로 타입캐스팅하고 그 값을 age에 저장합니다.
            } catch (NoSuchMethodException e) { // NoSuchMethodException 받아주기
            } catch (IllegalAccessException e) { // IllegalAccessException 받아주기
            } catch (InvocationTargetException e) { // InvocationTargetException 받아주기
            }
        }
        System.out.println("Annotation_11 : Age = " + age); // age의 값 출력
    }
}

class Annotation_12 {
    Annotation_12 () {
        Method m1 = null; // 메소드 객체 지시자 m1을 선언하고 그 값을 null로 지정
        int age = 0; // 나이 변수 선언 후 0으로 지정
        Student st = new Student("Lee", 19); // 새로운 학생 객체 생성

        Class<? extends Student> sc = st.getClass(); // 클래스 객체 지시자 sc에 Student 클래스와 그 student 클래스를 상속받는 클래스를 모두 포함하여 받아들일 수 있는 제네릭을  st.getClass에 지정해주고 st의 클래스를 받아줍니다. 즉 student 클래스를 받게 됩니다.
        try {
            if ((m1 = sc.getDeclaredMethod("getAge")) != null) { // 만약 sc에서 getAge라는 이름의 메소드를 찾을 수 있다면
                age = (int)m1.invoke(st); // 그 m1 메소드를 invoke()메소드를 통해 호출합니다.
            }
        } catch (NoSuchMethodException e) { // NoSuchMethodException 받아주기
        } catch (IllegalAccessException e) { // IllegalAccessException 받아주기
        } catch (InvocationTargetException e) { // InvocationTargetException 받아주기
        }

        System.out.println("Annotation_12 : Age = " + age); // age의 값 출력
    }
}

class Annotation_13 {
    Annotation_13 () {
        Method m1 = null; // 메소드 객체 지시자 m1을 선언하고 그 값을 null로 지정
        int age = 0; // 나이 변수 선언 후 0으로 지정
        Student st = new Student("Lee", 19); // 새로운 학생 객체 생성

        Class<Student> sc = Student.class; // Class 클래스 객체는 해당 클래스의 .class 필드로부터 얻을 수도 있습니다.
        try {
            m1 = sc.getDeclaredMethod("getAge_new");
            age = Integer.valueOf((String)m1.invoke(st));
        } catch (NoSuchMethodException e) { // NoSuchMethodException 받아주기
        } catch (IllegalAccessException e) { // IllegalAccessException 받아주기
        } catch (InvocationTargetException e) { // InvocationTargetException 받아주기
        }

        System.out.println("Annotation_13 : Age = " + age); // age의 값 출력
    }
}
public class STEP_17_Annotation_1 {
    public static void main(String[] args) {
        new Annotation_11();
        new Annotation_12();
        new Annotation_13();
    }
}
