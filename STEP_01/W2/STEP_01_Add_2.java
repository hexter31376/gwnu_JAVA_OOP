import java.io.*;

class Add_2 {
    static int add2i(int a, int b){
        int s;
        s = a + b;
        return (s);
    }
}

class STEP_01_Add_2 {
    public static void main(String[] args) throws IOException{
        int x, y, z;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        z = Add_2.add2i(x,y);

        System.out.printf("%d + %d = %d\n", x, y, z);
    }
}

//클래스를 분리해서 코딩하는 것도 가능하다.
// 이런 식으로 정적으로 선언된 클래스는 클래스.메소드와 같이 사용이 가능하다.