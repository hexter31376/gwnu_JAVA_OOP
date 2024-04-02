import java.io.*;
class Add_3 {
    int add2i(int a, int b){
        int s;
        s = a + b;
        return (s);
    }
}
class STEP_01_Add_3 {
    public static void main(String[] args) throws IOException{
        int x, y, z;
        Add_3 add; // 쓰고자 하는 클래스의 형태를 가지는 add를 생성
        x = System.in.read() - '0';
        y = System.in.read() - '0';

        add = new Add_3();
        // new 연산자는  해당 클래스를 위한 메모리 공간을 생성하고
        // add 에 그 주소를 돌려준다.
        // 동적 메모리 할당을 클래스로 한다고 생각하자.
        z = add.add2i(x,y); //이렇게 할당한 add 객체로 add2i에 접근이 가능하다.

        System.out.printf("%d + %d = %d\n", x, y, z);
    }
}
// 정적이 아닌 클래스를 가져다 쓸 때에는 반드시 객체화를 시켜주어야 합니다.