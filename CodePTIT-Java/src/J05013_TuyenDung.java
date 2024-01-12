
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

class ThiSinh implements Comparable<ThiSinh>{
    private static int cnt = 1;
    private String ma, ht, tt;
    private double lt, th, tb;

    public ThiSinh(String ht, double lt, double th) {
        this.ma = String.format("TS%02d", cnt++);
        this.ht = ht;
        this.lt = lt;
        this.th = th;
        this.tb = diemtb();
        this.tt = trangthai();
    }
    
    public double diemtb(){
        if(lt > 10){
            lt = lt / 10;
        }
        if(th > 10){
            th = th / 10;
        }
        return (lt + th) / 2;
    } 
    
    private String trangthai() {
        if(diemtb() < 5){
            tt = "TRUOT";
        }else if(diemtb() < 8){
            tt = "CAN NHAC";
        }else if(diemtb() < 9.5){
            tt = "DAT";
        }else{
            tt = "XUAT SAC";
        }
        return tt;
    }
    

    @Override
    public int compareTo(ThiSinh o) {
        return Double.compare(o.tb, this.tb);
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + String.format("%.02f", diemtb()) + " " + tt;
    }
}

public class J05013_TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        while(t-->0){
            a.add(new ThiSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        for(ThiSinh i : a){
            System.out.println(i);
        }
    }
}

//3
//Nguyen Thai Binh
//45
//75
//Le Cong Hoa
//4
//4.5
//Phan Van Duc
//56
//56