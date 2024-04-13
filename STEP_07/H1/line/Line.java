package line;
import point.*;
public class Line extends Point{
    public int a, b;

    public Line(int x, int y, int a, int b){
        super(x, y);
        this.a = a;
        this.b = b;
    }
    public void set_ab(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void set_a(int a){
        this.a = a;
    }
    public void set_b(int n){
        this.b = b;
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public double get_dl(){
        double c = 0.0;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    };

}