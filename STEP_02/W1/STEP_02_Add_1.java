// 동일 기능 이질 타입 메소드

// 평균값 출력 프로그램
import java.io.*;
12
class Add_1 {
    int total;
    int add2i(int a, int b){
        int s;
        s = a + b;
        total += s;
        return (s);
    }
    float add2f(float a, float b){
        float s;
        s = a + b;
        total += s;
        return((int)s);
    }
    float add2if(int a, float b){
        float s;
        s = a + b;
        total += s;
        return((int)s);
    }
    float add2fi(float a, int b){
        float s;
        s = a + b;
        total += s;
        return(s);
    }
}
public class STEP_02_Add_1 {
    public static void main(String[] args) throws IOException{
        Add_1 add;
        int i,j,k;
        float x,y,z;

        i = System.in.read() - '0'; x = i;
        j = System.in.read() - '0'; y = j;
        add = new Add_1();
        z = add.add2f(x, y);
        k = add.add2if(i, y);
        System.out.printf("%f%f=%f\n", x, y, z);
    }    
}