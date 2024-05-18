class Type_41 {
    void type_test(){
        // 각 클래스 자료형을 new 연산자로 생성
        Byte Bt = new Byte((byte)65);
        Short St = new Short((short)0x41);
        Character Ch = new Character('A');
        Integer It = new Integer(0101);
        Long Lg = new Long(65);
        Float Ft = new Float(1e-2f);
        Double Db = new Double(0.01);

        double sum = Bt.byteValue() + St.shortValue() + Ch.charValue() + It.intValue() + Lg.longValue() + Ft.floatValue() + Db.doubleValue(); // 각 클래스 형 그대로 뱉어내고 더하는 메소드의 시연
        String str = Bt.toString() + St.toString() + Ch.toString() + It.toString() + Lg.toString() + Ft.toString() + Db.toString(); // 각 클래스 형을 문자형을 뱉어내고 더하는 메소드의 시연

        System.out.println(sum); // 정수 합 출력 // 값의 합
        System.out.println(str); // 문자열의 합 출력 // 문자 이어붙이기
    }
}

class Type_42 {
    void type_test(){
        Byte Bt = new Byte((byte)65);
        Character Ch = new Character('A');
        Integer It = new Integer(0101);
        
        // equals를 byte로 타입캐스팅한 65와 타입캐스팅하지 않은 65와 비교하여 참 거짓 비교
        // equals는 자료형도 같아야 참을 출력
        if(Bt.equals((byte)65)){
            System.out.println("Bt.equals() == (byte)65"); // win
        } else {
            System.out.println("Bt.equals() != (byte)65");
        }
        if(Bt.equals(65)){
            System.out.println("Bt.equals() == 65");
        } else {
            System.out.println("Bt.equals() != 65"); // win
        }

        // byteValue를 byte로 타입캐스팅한 65와 타입캐스팅하지 않은 65와 비교하여 참 거짓 비교
        // byteValue는 형이 달라도 값만 같으면 참을 출력
        if(Bt.byteValue() == (byte)65){
            System.out.println("Bt.byteValue() == (byte)65"); // win
        } else {
            System.out.println("Bt.byteValue() != (byte)65");
        }
        if(Bt.byteValue() == 65){
            System.out.println("Bt.byteValue() == 65"); // win
        } else {
            System.out.println("Bt.byteValue() != 65");
        }


    }
}

public class STEP_12_Type_4 {
    public static void main(String[] args) {
        new Type_41().type_test(); // Type_41클래스를 객체화하고 그 메소드를 호출
        new Type_42().type_test(); // Type_42클래스를 객체화하고 그 메소드를 호출
    }
}
