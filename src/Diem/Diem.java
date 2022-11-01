package Diem;
import java.lang.Math;

public class Diem {
    private double x;
    private double y;

    public Diem(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Diem(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public double Distance(Diem B){
        return Math.sqrt(Math.pow(this.x - B.getX(), 2) + Math.pow(this.y - B.getY(), 2));
    }

    @Override
    public String toString(){
        return "(" + this.x + " ; " + this.y + ")";
    }

}
