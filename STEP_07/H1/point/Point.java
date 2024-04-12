package point;

public class Point{
    public int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void set_xy(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void set_x(int x){
        this.x = x;
    }
    public void set_y(int y){
        this.y = y;
    }
    public int get_x(){
        return x;
    }
    public int get_y(){
        return y;
    }
}