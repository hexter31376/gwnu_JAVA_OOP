import java.io.*;

class STEP_01_add_1{
    public static void main(String[] args) throws IOException{
        int x, y, z;
        x = System.in.read() -'0';
        y = System.in.read() -'0';
        z = add2i(x, y);
        System.out.printf("%d + %d = %d\n", x, y, z);
    }
    static int add2i(int a, int b){
        int s;
        s = a + b;
        return (s);
    }
}
// 객체지향에서는 함수의 선언 순서가 실행에 아무런 영향이 없다.
// static 즉 정적으로 선언한 메소드는 처음부터 '객체화' 되어있다.
// 이런 식으로 사용하면 c스타일 코딩이 가능은 하다.