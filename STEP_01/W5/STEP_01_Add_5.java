import java.io.*;

class Add_51 {
    int total;
    // 객체 멤버 변수 total은 해당 객체의 add2i가 호출되었을때만 값이 누적돤다.

    int add2i(int a, int b){
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
class Add_52 {
    static int total;
    // 정적 멤버 변수 total은 다른 어느 객체의 add2i가 호출되어도 호출되는 값이 누적된다.

    int add2i(int a, int b){
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
/*****
class Add_53 {
    int total;

    static int add2i(int a, int b){
        // 멤버 함수 add2i를 정적으로 선언하면
        // 이 함수에서는 정적이 아닌 외부의 읿반 객체 멤버의 참조가 불가능하다.
        // 다른 정적이 아닌 객체 멤버는 이 함수 다음에 생성이 되는데
        // 생성된 이후의 정보를 파악을 할 수 없는 정적 멤버는
        // 이를 인지할 수 없다.
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
******/
public class STEP_01_Add_5 {
    public static void main(String[] args) throws IOException{
        Add_43 add;
        int x, y, z, t;
        x = System.in.read() -'0';
        y = System.in.read() -'0';

        add = new Add_43();
        z = add.add2i(x, y);
        z = add.add2i(x, y);
        t = add.total; // 그동안 하나의 객체에 쌓인 total을 볼 수 있는 것이다.
        System.out.printf("%d + %d = %d, total = %d\n", x, y, z, t);
    }
}