class Type_31 {
    void type_test(){
        Integer It1 = new Integer(0x10);
        Integer It2 = new Integer(0x10);
        Integer It3 = 0x10;
        Integer It4 = 0x10;
        int it5 = It1;
        Integer It5 = it5;

        if (It1 == It2) {
            System.out.println("It1 == It2");
        } else {
            System.out.println("It1 != It2"); // win
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
            System.out.println("it5 == It1"); // win
        } else {
            System.out.println("it5 != It1");
        }
        if (it5 == It5) {
            System.out.println("it5 == It5"); // win
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
