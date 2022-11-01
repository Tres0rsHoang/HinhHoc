import TamGiac.TamGiac;
import Diem.Diem;

import java.util.Scanner;
import java.util.Vector;
import java.lang.Double;
import java.io.IOException;

public class Main {
    private static void clearConsole(){
        try {
            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {System.out.println("Clean Screen Error...");}
    }
    public static void main(String[] args)  throws java.io.IOException{
        Scanner CMDInput = new Scanner(System.in);
        Vector<TamGiac> List = new Vector<TamGiac>();

        List.add(new TamGiac(new Diem(0, 0), new Diem(1 ,2), new Diem(3,4)));
        List.add(new TamGiac(new Diem(3, 4), new Diem(5 ,7), new Diem(0,0)));
        List.add(new TamGiac(new Diem(1, 2), new Diem(8 ,9), new Diem(10,0)));
        String UserInput = "";
        while(true) {
            System.out.println("Xu li tam giac:");
            System.out.println("1.Hien thi danh sach tam giac");
            System.out.println("2.Nhap them 1 tam giac");
            System.out.println("3.Hien thi tong chu vi cua cac tam giac");
            System.out.println("4.Hien thi cac tam giac co chu vi lon nhat");
            System.out.println("5.Hien thi cac tam giac co chu vi nho nhat");
            System.out.println("6.Hien thi cac tam giac co chu vi nho hon x");
            System.out.println("7.Hien thi trong tam cua tam giac thu i");
            System.out.println("q.Thoat Chuong trinh");
            System.out.print("Nhap chuc nang ban muon su dung: ");

            UserInput = CMDInput.nextLine();
            if (UserInput.equals("Q") || UserInput.equals("q")) break;
            clearConsole();
            switch (UserInput) {
                case "1" -> {
                    System.out.println("Danh sach tam giac:");
                    int index = 0;
                    for (TamGiac i : List) {
                        index++;
                        System.out.println(String.valueOf(index) + ". " + i);
                    }
                }
                case "2" -> {
                    System.out.println("Moi ban nhap 3 diem: ");

                    System.out.println("Diem A:");
                    System.out.print("X: ");
                    double X =  CMDInput.nextDouble();
                    System.out.print("Y: ");
                    Diem A = new Diem(X, CMDInput.nextDouble());

                    System.out.println("Diem B:");
                    System.out.print("X: ");
                    X =  CMDInput.nextDouble();
                    System.out.print("Y: ");
                    Diem B = new Diem(X, CMDInput.nextDouble());

                    System.out.println("Diem C:");
                    System.out.print("X: ");
                    X =  CMDInput.nextDouble();
                    System.out.print("Y: ");
                    Diem C = new Diem(X, CMDInput.nextDouble());

                    List.add(new TamGiac(A, B, C));
                    System.out.println("Them tam giac thanh cong...");
                    CMDInput.nextLine();
                }
                case "3" -> {
                    System.out.print("Tong chu vi cua cac tam giac la:");
                    double res = 0;
                    for (TamGiac i: List){
                        res += i.ChuVi();
                    }
                    System.out.println(" " + res);
                }
                case "4" -> {
                    double Max = -1;
                    TamGiac res = new TamGiac();
                    for (TamGiac i: List){
                        if (i.ChuVi() > Max) {
                            res = i;
                            Max = i.ChuVi();
                        }
                    }
                    System.out.print("Tam giac co chu vi lon nhat:\n");
                    System.out.println(res);
                    System.out.print("Chu vi tam giac la:" + Max);
                }
                case "5" -> {
                    double Min = Double.MAX_VALUE;
                    TamGiac res = new TamGiac();
                    for (TamGiac i: List){
                        if (i.ChuVi() > Min) {
                            res = i;
                            Min = i.ChuVi();
                        }
                    }
                    System.out.print("Tam giac co chu vi nho nhat:\n");
                    System.out.println(res);
                    System.out.print("Chu vi tam giac la:" + Min);
                }
                case "6" -> {
                    System.out.print("Nhap x = ");
                    double x = CMDInput.nextDouble();
                    CMDInput.nextLine();
                    System.out.println("Danh sach cac tam giac nho hon " + x + " la: ");
                    for (TamGiac i: List){
                        if (i.ChuVi() < x) System.out.println(i + " chu vi la: " + (double) (Math.round(i.ChuVi() * 100) / 100));
                    }
                }
                case "7" -> {
                    System.out.print("Nhap tam giac muon tim trong tam: ");
                    int InDex = CMDInput.nextInt();
                    if (InDex < List.size())
                        System.out.println("Trong tam "+ List.get(InDex) + " la: "+ List.get(InDex).TimTrongTam());
                    else
                        System.out.println("Nhap sai vi tri");
                    CMDInput.nextLine();
                }
                default -> System.out.println("Nhap sai!!! Moi nhap lai...");
            }
            System.out.print("\nAn Enter de tiep tuc...");
            CMDInput.nextLine();
        }
    }
}