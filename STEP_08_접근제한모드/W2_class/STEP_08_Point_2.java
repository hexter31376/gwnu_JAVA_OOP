import java.io.*;

class STEP_08_Point_2 {
    public static void main(String[] args) throws IOException {
        Point_2 pnt1, pnt2; // Point_2 형 객체 지시자 pnt1, pnt2 선언
        int x1, y1, x2, y2; // 사용자에게 입력받을 좌표 x1, y1, x2, y2 선언
        double dl; // 선분의 길이 dl 선언

        x1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        pnt1 = new Point_2(x1, y1); // pnt1 객체 생성
        pnt2 = new Point_2(x2, y2); // pnt2 객체 생성

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(), 2) + Math.pow(pnt1.get_y() - pnt2.get_y(), 2)); // 선분의 길이 구하고 dl에 저장
        
        System.out.printf("dl = %f\n", dl); // dl 출력
    }
}