import kor.point.*; // 클래스 경로 생략을 위한 import

public class Line_5 extends Point_5 { // point 패키지의 Point_5클래스를 상속받은 Line_5클래스 정의
    int a, b;

    public Line_5(int x, int y, int a, int b){ // 부모 클래스 필드 x와 y, 자식 클래스(지금 이 클래스) 필드 a, b 입력받을때의 객체 생성자 line_5 정의
        super(x, y); // this.x = x this.y = y와 동치이나 필드 x와 y는 부모 클래스의 내용이므로 super메소드를 이용해 설정해 주어야 합니다.
        this.a = a;
        this.b = b;
    }

    int get_a(){ // a값 반환
        if (a < 0){
            return 0;
        } else {
            return a;
        }
    }

    int get_b(){ // b값 반환
        if (b < 0){
            return 0;
        } else {
            return b;
        }
    }

    public int get_x() { // x값 반환 // 상속이 안되었습니다
        if (x > 0){
            return x;
        } else {
            return 0;
        }
    }

    public int get_y() { // y값 반환 // 상속이 안되었습니다
        if (y > 0){
            return y;
        } else {
            return 0;
        }
    }


    public double get_dl(){ // 선분의 길이 반환
        double dl;
        dl = Math.sqrt(Math.pow(get_x() - a, 2) + Math.pow(get_y() - b, 2)); // 선분의 길이 구하고 dl에 저장 
        return (dl);
    }
}