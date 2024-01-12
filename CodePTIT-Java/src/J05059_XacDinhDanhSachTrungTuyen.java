
import java.text.DecimalFormat;
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
    private String ma, ten, trangthai;
    private double toan, ly, hoa, tong, uuTien;

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(ma.charAt(2) == '1'){
            this.uuTien = 0.5;
        }
        else if(ma.charAt(2) == '2'){
            this.uuTien = 1.0;
        }
        else{
            this.uuTien = 2.5;
        }
        this.tong = toan * 2 + ly + hoa + uuTien;
    }

    public double getTong() {
        return tong;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + (new DecimalFormat().format(uuTien))  + " " + (new DecimalFormat().format(tong)) + " " + trangthai;
    }

    @Override
    public int compareTo(ThiSinh arg0) {
        if(this.tong == arg0.tong){
            return this.ma.compareTo(arg0.ma);
        }
        return (this.tong < arg0.tong) ? 1 : -1;
    }
}

public class J05059_XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();  
        while(t-- > 0){
            ds.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ds);
        int chitieu = Integer.parseInt(sc.nextLine());  
        double diemchuan = ds.get(chitieu - 1).getTong();
        if(chitieu > ds.size()){
            chitieu = ds.size();
        }
        System.out.println(String.format("%.1f", diemchuan));
        for(ThiSinh i : ds){
            if(i.getTong() >= diemchuan){
                i.setTrangthai("TRUNG TUYEN");
            }else{
                i.setTrangthai("TRUOT");
            }
        }
        for(ThiSinh i : ds){
            System.out.println(i);
        }
    }
}

//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV3B123
//Ly Thi Thu Ha
//8
//6.5
//7
//1