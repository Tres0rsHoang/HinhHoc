package Diem;

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

    @Override
    public String toString(){
        return "(" + this.x + " ; " + this.y + ")";
    }

}
