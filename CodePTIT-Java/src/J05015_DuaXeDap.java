
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

class DuaXe implements Comparable<DuaXe>{
    private String ma, ht, dvi, gio;
    private double vt;

    public DuaXe(String ht, String dvi, String gio) {
        this.ht = ht;
        this.dvi = dvi;
        this.gio = gio;
        this.ma = ma();
        this.vt = vantoc();
    }
    
    public String ma(){
        String s = "";
        String[] a = dvi.split("\\s+");
        for(String i : a){
            s += i.substring(0, 1);
        }
        String[] b = ht.split("\\s+");
        for(String i : b){
            s += i.substring(0, 1);
        }
        return s.toUpperCase();
    }

    public double vantoc(){
        String[] s = gio.split(":");
        double h = Double.parseDouble(s[0]);
        double m = Double.parseDouble(s[1]);
        double gio = (h - 6) + (m / 60);
        return 120 / gio;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + dvi + " " + String.format("%.0f", vt) + " Km/h";
    }

    @Override
    public int compareTo(DuaXe o) {
        return Double.compare(o.vt, this.vt);
    }
}

public class J05015_DuaXeDap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DuaXe> a = new ArrayList<>();
        while(t-->0){
            a.add(new DuaXe(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(DuaXe i : a){
            System.out.println(i);
        }
    }
}


//3
//Tran Vu Minh
//Ha Noi
//8:30
//Vu Ngoc Hoang
//Hoa Binh
//8:20
//Pham Dinh Tan
//An Giang
//8:45