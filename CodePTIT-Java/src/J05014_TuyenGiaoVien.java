
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
class GiaoVien implements Comparable<GiaoVien>{
    private String ma, ht, maxt, tt, mon;
    private double d1, d2, dut, tong;
    private static int cnt = 1;

    public GiaoVien(String ht, String maxt, double d1, double d2) {
        this.ma = String.format("GV%02d", cnt++);
        this.ht = ht;
        this.maxt = maxt;
        this.d1 = d1;
        this.d2 = d2;
        this.dut = diemuutien();
        this.tong = d1 * 2 + d2 + dut;
        this.tt = trangthai();
        this.mon = mon();
    }
    
    public String mon(){
        if(maxt.charAt(0) == 'A'){
            this.mon = "TOAN";
        }else if(maxt.charAt(0) == 'B'){
            this.mon = "LY";
        }else{
            this.mon = "HOA";
        }
        return mon;
    }
    
    public double diemuutien(){
        switch (maxt.charAt(1)) {
            case '1':
                dut = 2.0;
                break;
            case '2':
                dut = 1.5;
                break;
            case '3':
                dut = 1.0;
                break;    
            default:
                dut = 0.0;
        }
        return dut;
    }
    
    public String trangthai(){
        if(tong >= 18){
            this.tt = "TRUNG TUYEN";
        }else{
            this.tt = "LOAI";
        }
        return tt;
    }        

    @Override
    public int compareTo(GiaoVien o) {
        return Double.compare(o.tong, this.tong);
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + mon + " " + String.format("%.01f", tong) + " " + tt;
    }
}

public class J05014_TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new GiaoVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        for(GiaoVien i : a){
            System.out.println(i);    
        }
    }
}

//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0