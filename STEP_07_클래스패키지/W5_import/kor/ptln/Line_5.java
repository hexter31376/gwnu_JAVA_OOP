package kor.ptln;

import kor.ptln.Point_5; // 클래스 경로 생략을 위한 import

public class Line_5 extends Point_5 { // point 패키지의 Point_5클래스를 상속받은 Line_5클래스 정의
    int a, b;

    public Line_5(int x, int y, int a, int b){ // 부모 클래스 필드 x와 y, 자식 클래스(지금 이 클래스) 필드 a, b 입력받을때의 객체 생성자 line_5 정의
        super(x, y); // this.x = x this.y = y와 동치이나 필드 x와 y는 부모 클래스의 내용이므로 super메소드를 이용해 설정해 주어야 합니다.
        this.a = a;
        this.b = b;
    }

    void set_ab(int a, int b){ // a와 b좌표 입력받는 메소드
        this.a = a;
        this.b = b;
    }

    void set_a(int a){ // a좌표 입력받는 메소드
        this.a = a;
    }

    void set_b(int b){ // b좌표 입력받는 메소드
        this.b = b;
    }

    int get_a(){ // a좌표 반환
        return a;
    }

    int get_b(){ // b좌표 반환
        return b;
    }

    public double get_dl(){ // 선분의 길이 반환
        double dl;
        dl = Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2)); // 선분의 길이 구하고 dl에 저장
        return (dl);
    }
}