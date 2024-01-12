
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

class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private long sl, dongia, chietkhau, tong;

    public SanPham(String ma, String ten, long sl, long dongia, long chietkhau) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.tong = sl * dongia - chietkhau;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sl + " " + dongia + " " + chietkhau + " " + tong;
    }

    @Override
    public int compareTo(SanPham o) {
        return Long.compare(o.tong, this.tong);
    }
}

public class J05012_TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        while(t-->0){
            a.add(new SanPham(sc.nextLine(),sc.nextLine(), Long.parseLong(sc.nextLine()) , Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(a);
        for(SanPham i : a){
            System.out.println(i);
        }
    }
}

//3
//ML01
//May lanh SANYO
//12
//4000000
//2400000
//ML02
//May lanh HITACHI
//4
//2550000000
//0
//ML03
//May lanh NATIONAL
//5
//3000000
//150000