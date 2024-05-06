class Point_2 {
    int x; // x좌표
    int y; // y좌표

    Point_2(int x, int y){ // 객체 지시자 초기값으로 x, y 좌표 필드값 받기
        this.x = x;
        this.y = y;
    }

    int get_x(){ // x좌표 필드 반환
        return x;
    }

    int get_y(){ // y좌표 필드 반환
        return y;
    }
}