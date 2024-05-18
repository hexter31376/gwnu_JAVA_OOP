class Type_31 {
    void type_test(){
        Integer It1 = new Integer(0x10);
        Integer It2 = new Integer(0x10);
        Integer It3 = 0x10;
        Integer It4 = 0x10;
        int it5 = It1; // 클래스의 언랩
        Integer It5 = it5; // 자료형의 랩

        if (It1 == It2) {
            System.out.println("It1 == It2");
        } else {
            System.out.println("It1 != It2"); // win : 일반적으로 두 객체 지시자를 비교하면 객체의 위치(주소)를 비교하기 때문에 같지 않습니다.
        }
        if (It3 == It4) {
            System.out.println("It3 == It4"); // win
        } else {
            System.out.println("It3 != It4");
        }
        if (It1 == It3) {
            System.out.println("It1 == It3");
        } else {
            System.out.println("It1 != It3"); // win
        }
        if (it5 == It1) {
            System.out.println("it5 == It1"); // win 이때는 값을 비교해줍니다 박싱 데이터와 언박싱 데이터의 비교시 자동으로 값 자체를 비교해줍니다.
        } else {
            System.out.println("it5 != It1");
        }
        if (it5 == It5) {
            System.out.println("it5 == It5"); // win 이때는 값을 비교해줍니다 박싱 데이터와 언박싱 데이터의 비교시 자동으로 값 자체를 비교해줍니다.
        } else {
            System.out.println("it5 != It5");
        }
    }
}

class Type_32 {
    void type_test(){
        String Sg1 = new String("Java");
        String Sg2 = new String("Java");
        String Sg3 = "Java";
        String Sg4 = "Java";

        if (Sg1 == Sg2) {
            System.out.println("Sg1 == Sg2");
        } else {
            System.out.println("Sg1 != Sg2"); // win
        }
        if (Sg3 == Sg4) {
            System.out.println("Sg3 == Sg4"); // win
        } else {
            System.out.println("Sg3 != Sg4");
        }
    }
}

public class STEP_12_Type_3 {
    public static void main(String[] args) {
        new Type_31().type_test(); // Type_31클래스를 객체화하고 그 메소드를 호출
        new Type_32().type_test(); // Type_32클래스를 객체화하고 그 메소드를 호출
    }
}

// 둘다 new로 생성한 Integer이면서 값은 둘다 동일한 동적정수클래스1, 동적정수클래스2가 있다고 가정해봅시다.
// 동적정수클래스1과 동적정수클래스2가 가진것은 주소입니다.
// 하지만 두개는 '서로 다른 객체'의 '주소'를 가지고 있는 객체 지시자입니다.
// 따러서 new로 생성한 객체끼리의 단순 비교 연산은 거짓이 나옵니다.

// = 으로 생성한 Integer이면서 값은 둘다 동일한 정적정수클래스1, 정적정수클래스2가 있다고 가정해봅시다.
// 이때의 정적정수클래스1과 정적정수클래스2가 가진것은 주소입니다.
// 그러나 둘의 값이 동일하기 때문에 이 둘이 가리키는 정수형 클래스는 같은 클래스를 가리키게 됩니다.
// 따라서 =으로 생성한 객체끼리의 단순 비교 연산은 같은 주소를 가지고 있으므로 참이 나옵니다.