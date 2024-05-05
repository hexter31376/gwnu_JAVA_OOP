import java.io.*;

class Point_1 { // 좌표 클래스
    int x; // x좌표
    int y; // y좌표
}

class STEP_05_Point_1 {
    public static void main(String[] args) throws IOException{
        Point_1 pnt1, pnt2; // 쓰고자 하는 클래스를 지정할 수 있는 객체 지시자 pnt1, pnt2 선언
        int x1, y1, x2, y2; // 사용자에게 입력받을 정수 x1, y1, x2, y2 선언
        double dl; // 선분의 길이 dl 선언

        x1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        pnt1 = new Point_1(); // Point_1 클래스 형태의 객체를 생성하고 그 객체를 pnt1에 할당
        pnt1.x = x1; // pnt1의 x를 x1로 설정
        pnt1.y = y1; // pnt1의 y를 y1으로 설정

        pnt2 = new Point_1(); // Point_1 클래스 형태의 객체를 생성하고 그 객체를 pnt2에 할당
        pnt2.x = x2; // pnt2의 x를 x2로 설정
        pnt2.y = y2; // pnt2의 y를 y1으로 설정

        dl = Math.sqrt(Math.pow(pnt1.x - pnt2.x, 2) + Math.pow(pnt1.y - pnt2.y, 2)); // 선분의 길이 구하고 dl에 저장

        System.out.printf("dl = %f\n", dl); // 선분의 길이 출력
    }
}