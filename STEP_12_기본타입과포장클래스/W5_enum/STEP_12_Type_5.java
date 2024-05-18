enum CarColor { WHITE, SILBER, BLUE, BLACK }; // 열거형 클래스 Carcolor 생성 각각은 0, 1, 2, 3의 상수를 순서대로 가진다.

class Enum_51 {
    void enum_test(){
        CarColor cc;

        System.out.println("Enum_51"); // Enum_51 클래스의 메소드를 실행했음을 알려주는 출력문

        cc = CarColor.BLUE; // Enum 할당
        System.out.println(cc); // 해당 요소의 문자 출력

        for(CarColor c: CarColor.values()){ // 배열 반복문
            String cs = c.toString(); // 현재 요소의 문자 출력
            int ci = c.ordinal(); // 현재 요소의 순서 출력
            System.out.printf("<%s, %d> ", cs, ci);
        }
        System.out.println(""); // println이 아무것도 입력 안하면 기본 기능인 자동 개행만 발동합니다.
    }
}

class Enum_52 {
    void enum_test(){
        CarColor cc = CarColor.BLUE;
        System.out.println("Enum_52...");

        if(cc == CarColor.BLUE){
            System.out.println("if BLUE"); // win
        } else {
            System.out.println("if not BLUE");
        }

        if(cc.equals(CarColor.BLUE)){
            System.out.println("equals() BLUE"); // win
        } else {
            System.out.println("equals() not BLUE");
        }

        /*
        if(cc > CarColor.WHITE){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        */
        // 열거형 타입은 대소비교가 불가능합니다.

        switch (cc) { // 스위치문에서는 타입 이름을 생략하고 넣어줍니다.
            case CarColor.WHITE:
                System.out.println("case WHITE");
                break;
            case SILBER:
                System.out.println("case SILBER");
                break;
            case BLUE:
                System.out.println("case BLUE"); // blue이기 때문이 이게 나옵니다.
                break;
            case BLACK:
                System.out.println("case BLACK");
                break;
        
            default:
                break;
        }
    }
}

public class STEP_12_Type_5 {
    public static void main(String[] args) {
        new Enum_51().enum_test(); // Type_41클래스를 객체화하고 그 메소드를 호출
        new Enum_52().enum_test(); // Type_42클래스를 객체화하고 그 메소드를 호출
    }
}
