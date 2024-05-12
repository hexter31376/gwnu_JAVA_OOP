class Type_21 {
    void type_test(){
        Boolean Bl = false;
        Byte Bt = 65;
        Short St = 0x41;
        Character Ch = 'A';
        Integer It = 0101;
        Long Lg = 65L; //'B' - 1;
        Float Ft = 1e-2f;
        Double Db = 0.01;
        String Sg = "Java";

        System.out.println("Type_21...");
        System.out.println(Bl); // 해당 자료형 출력
        System.out.println(Bt); // 해당 자료형 출력
        System.out.println(St); // 해당 자료형 출력
        System.out.println(Ch); // 해당 자료형 출력
        System.out.println(It); // 해당 자료형 출력
        System.out.println(Lg); // 해당 자료형 출력
        System.out.println(Ft); // 해당 자료형 출력
        System.out.println(Db); // 해당 자료형 출력
        System.out.printf("%b, %d, %d, %c, %d, %d, %f, %f\n", Bl, Bt, St, Ch, It, Lg, Ft, Db); // printf로 해당 자료형 출력

        // It = Bt; Lg = It; Db = Ft; St = (short)It; // 이런거 안됩니다.
    }
}

class Type_22 {
    void type_test(){
        Boolean Bl = new Boolean(false);
        Byte Bt = new Byte((byte)65); // Byte(65);
        Short St = new Short((short)0x41); // Short(0x41);
        Character Ch = new Character('A');
        Integer It = new Integer(0101);
        Long Lg = new Long(65);
        Float Ft = new Float(1e-2f);
        Double Db = new Double(0.01);
        String Sg = new String("Java");

        System.out.println("Type_22...");
        System.out.println(Bl); // 해당 자료형 출력
        System.out.println(Bt); // 해당 자료형 출력
        System.out.println(St); // 해당 자료형 출력
        System.out.println(Ch); // 해당 자료형 출력
        System.out.println(It); // 해당 자료형 출력
        System.out.println(Lg); // 해당 자료형 출력
        System.out.println(Ft); // 해당 자료형 출력
        System.out.println(Db); // 해당 자료형 출력
        System.out.printf("%b, %d, %d, %c, %d, %d, %f, %f\n", Bl, Bt, St, Ch, It, Lg, Ft, Db); // printf로 해당 자료형 출력
    }
}

public class STEP_12_Type_2 {
    public static void main(String[] args) {
        new Type_21().type_test(); // Type_21클래스를 객체화하고 그 메소드를 호출
        new Type_22().type_test(); // Type_22클래스를 객체화하고 그 메소드를 호출
    }
}

// 기본 타입 클래스는 기본 타입에 클래스라는 껍질을 덧씌우기 때문에 포장 클래스라 부릅니다.
// 위의 기본 타입클래스는 21처럼 = 연산자로 생성하거나, new 연산자 어느쪽으로도 생성이 가능합니다.
// 포장 타입 클래스는 new로 생성할때에는 각 객체의 생성자가 초기 값에 대하여 엄격한 타입 매칭을 요구합니다.
// 서로 다른 기본 타입 클래스는 클래스 관점에서 상속 관계가 아니고 완전히 다르기에 서로간에 = 연산자에 의한 대입, 수식 연산, 다형성의 적용이 불가능합니다.