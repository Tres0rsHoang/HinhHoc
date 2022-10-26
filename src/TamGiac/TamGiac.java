package TamGiac;

import Diem.Diem;
public class TamGiac {
    private Diem A;
    private Diem B;
    private Diem C;

    public TamGiac(Diem A, Diem B, Diem C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public TamGiac(){
        this.A = new Diem(0,0);
        this.B = new Diem(0, 0);
        this.C = new Diem(0, 0);
    }

    public Diem TimTrongTam(){
        return new Diem((this.A.getX() + this.B.getX() + this.C.getX()) / 3 , (this.A.getY() + this.B.getY() + this.C.getY()) / 3);
    }
    @Override
    public String toString(){
        return "Tam Giac: " + this.A + " , " + this.B + " , "+ this.C;
    }
}
