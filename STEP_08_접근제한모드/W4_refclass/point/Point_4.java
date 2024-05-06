package point; // 이순간부터 기본 클래스와는 다른 패키지가 되었고 사용하려는 부분은 public 아니면 참조가 되지 않습니다.

public class Point_4 {
    private int x; // x좌표 // private로 필드의 직접 접근을 막고 Point_4 생성자로만 설정할 수 있게 설정
    private int y; // y좌표 // private로 필드의 직접 접근을 막고 Point_4 생성자로만 설정할 수 있게 설정

    public Point_4(int x, int y){ // 객체 지시자 초기값으로 x, y 좌표 필드값 받기
        this.x = x;
        this.y = y;
    }

    public int get_x(){ // x좌표 필드 반환
        return x;
    }

    public int get_y(){ // y좌표 필드 반환
        return y;
    }
}