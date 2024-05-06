import java.io.*;

import point.*; // import로 끌고오기

class STEP_08_Point_3 {
    public static void main(String[] args) throws IOException {
        Point_3 pnt1, pnt2; // Point_3 형 객체 지시자 pnt1, pnt2 선언
        int x1, y1, x2, y2; // 사용자에게 입력받을 좌표 x1, y1, x2, y2 선언
        double dl; // 선분의 길이 dl 선언

        x1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y1 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        x2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기
        y2 = System.in.read() - '0'; // 문자 입력받고 정수화시키기

        pnt1 = new Point_3(x1, y1); // pnt1 객체 생성
        pnt2 = new Point_3(x2, y2); // pnt2 객체 생성

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(), 2) + Math.pow(pnt1.get_y() - pnt2.get_y(), 2)); // 선분의 길이 구하고 dl에 저장
        
        System.out.printf("dl = %f\n", dl); // dl 출력
    }
}

// 이순간부터 Point_3는 기본 클래스와는 다른 패키지가 되었고 사용하려는 부분은 public 아니면 참조가 되지 않습니다.