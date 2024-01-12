
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class KhachHang implements Comparable<KhachHang>{
    private String ma, ht;
    private int cu, moi;
    private int dongia, tong;
    private static int cnt = 1;

    public KhachHang(String ht, int cu, int moi) {
        this.ma = String.format("KH%02d", cnt++);
        this.ht = ht;
        this.cu = cu;
        this.moi = moi;
        int sokhoi = moi - cu;
        double phuphi = 0;
        if(sokhoi > 100){
            this.dongia = 50 * 100 + 50 * 150 + (sokhoi - 100) * 200;
            phuphi = 0.05;
        }else if(sokhoi > 50){
            this.dongia = 50 * 100 + (sokhoi - 50) * 150;
            phuphi = 0.03;
        }else{
            this.dongia = 100 * sokhoi;
            phuphi =  0.02;
        }
        this.tong = (int) Math.round(dongia * (1 + phuphi));
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + tong;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.tong, this.tong);
    }
}

public class J05017_HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            a.add(new KhachHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for (KhachHang x : a) System.out.println(x);
        sc.close();
    }
}


//3
//Le Thi Thanh
//468
//500
//Le Duc Cong
//160
//230
//Ha Hue Anh
//410
//612