import java.io.*;

/*****
class Add_41 {
    int add2i(int a, int b){
        int total;
        // 함수 내부의 total 변수는
        // c와 동일하게 자동변수이므로
        // 함수가 종료되는 순간 못쓰게 되어버린다.
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
class Add_42 {
    int add2i(int a, int b){
        static int total;
        //함수 내부에서의 static 적용은 불가능하다.
        //함수가 동적인데 정적인 변수를 생성하고 없어지는건 불가능하다.
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
*****/

class Add_43 {
    int total;
    // 위와 같이 클래스 내부, 메소드 바깥쪽에 변수를 생성하면
    // 위 클래스를 객체화 시켰을때 메소드를 실행하고 종료시켜도
    // 그 '객체'의 속성(변수)값은 저장되는 모습을 볼 수 있는 것이다.
    int add2i(int a, int b){
        int s;
        s = a + b;
        total += s;
        return (s);
    }
}
public class STEP_01_Add_4 {
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