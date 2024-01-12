/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tan
 */
class SinhVien implements Comparable<SinhVien>{
    private String ma, ht, dt, kq;
    private float d1, d2, d3, uutien, dgiai, kvuc, tong, tongk, tonguu;
    private String giai;

    public SinhVien(String ma, String ht, String dt, float d1, float d2, float d3, String giai) {
        this.ma = ma;
        this.ht = ht;
        this.dt = dt;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.giai = giai;
        this.tongk = d1 + d2 + d3;
        
        if(this.ma.substring(2, 3).equals("2")){
            this.kvuc = 1f;
        }else if(this.ma.substring(2, 3).equals("3")){
            this.kvuc = 2f;
        }else if(this.ma.substring(2, 3).equals("1")){
            this.kvuc = 0f;
        }
        
        if(!this.dt.equals("kinh")){
            this.uutien = 1f;
        }else{
            this.uutien = 0f;
        }
        
        if(this.giai.equals("1")){
            this.dgiai = 1.5f;
        }else if(this.giai.equals("2")){
            this.dgiai = 1f;
        }else if(this.giai.equals("3")){
            this.dgiai = 0.5f;
        }else{
            this.dgiai = 0f;
        }
        
        this.tong = d1 + d2 + d3 + uutien + dgiai + kvuc;
        if(this.tong >= 26.8f){
            this.kq = "TRUNG TUYEN";
        }else{
            this.kq = "TRUOT";
        }
        this.tonguu = uutien + dgiai + kvuc;
    }
    
    @Override
    public String toString() {
        return ma + " " + ht + " " + ((tonguu % 1 != 0) ? String.format("%.1f", tonguu) : String.format("%.0f", Math.floor(tonguu))) 
                + " " + ((tongk % 1 != 0) ? String.format("%.1f", tongk) : String.format("%.0f", Math.floor(tongk))) + " " + kq;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tong == o.tong){
            return -String.valueOf(this.tongk).compareTo(String.valueOf(o.tongk));
        }
        return -String.valueOf(this.tong).compareTo(String.valueOf(o.tong));
    }
}

public class KT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}

