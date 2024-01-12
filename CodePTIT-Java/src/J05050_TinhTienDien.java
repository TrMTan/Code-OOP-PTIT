
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class KhachHang {
    private String ma, loai;
    private int socu, somoi, hs, thanhtien, phutroi, tong;
    private static int cnt = 1;

    public KhachHang(String loai, int socu, int somoi) {
        this.ma = String.format("KH%02d", cnt++);
        this.loai = loai;
        this.socu = socu;
        this.somoi = somoi;
        switch (loai) {
            case "KD":
                this.hs = 3;
                break;
            case "NN":
                this.hs = 5;
                break;
            case "TT":
                this.hs = 4;
                break;
            case "CN":
                this.hs = 2;
                break;    
            default:
                break;
        }
        int tmp = this.somoi - this.socu;
        this.thanhtien = tmp * this.hs * 550;
        if(tmp < 50){
            this.phutroi = 0;
        }else if(tmp <= 100){
            this.phutroi = Math.round(this.thanhtien * 0.35f);
        }else{
            this.phutroi = this.thanhtien;
        }
        this.tong = this.thanhtien + this.phutroi;
    }

    @Override
    public String toString() {
        return ma + " " + hs + " " + thanhtien + " " + phutroi + " " + tong;
    }
}

public class J05050_TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        while(t-->0){
            a.add(new KhachHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}

//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700