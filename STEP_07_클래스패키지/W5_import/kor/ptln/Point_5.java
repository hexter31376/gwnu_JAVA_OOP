package kor.ptln;

public class Point_5 {
    public int x; // x좌표
    public int y; // y좌표

    public Point_5(int x, int y){ // x와 y 입력받을때의 객체 생성자 Point_5 정의
        this.x = x;
        this.y = y;
    }

    void set_xy(int x, int y){ // x와 y좌표 입력받는 메소드
        this.x = x;
        this.y = y;
    }

    void set_x(int x){ // x좌표 입력받는 메소드
        this.x = x;
    }

    void set_y(int y){ // y좌표 입력받는 메소드
        this.y = y;
    }

    int get_x(){ // x좌표 반환
        return x;
    }

    int get_y(){ // y좌표 반환
        return y;
    }
}