
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
    private String ma, ht, xeploai;
    private Date ns;
    private double lt, th, thuong;
    private int tuoi, tong;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static int cnt = 1;

    public ThiSinh(String ht, String ns, double lt, double th) throws ParseException {
        this.ma = String.format("PH%02d", cnt++);
        this.ht = ht;
        this.ns = sdf.parse(ns);
        this.lt = lt;
        this.th = th;
        if(lt >= 8 && th >= 8){
            thuong = 1f;
        }else if(lt >= 7.5 && th >= 7.5){
            thuong = 0.5f;
        }else{
            thuong = 0;
        }
        this.tong = (int) Math.round((th + lt) / 2 + thuong);
        String[] s = ns.split("/");
        this.tuoi = 2021 - Integer.parseInt(s[2]);
        if(tong > 10){
            tong = 10;
        }
        if(tong < 5){
            xeploai = "Truot";
        }else if(tong <= 6){
            xeploai = "Trung binh";
        }else if(tong <= 7){
            xeploai = "Kha";
        }else if(tong <= 8){
            xeploai = "Gioi";
        }else {
            xeploai = "Xuat sac";
        }
        
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + tuoi + " " + tong + " " + xeploai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tong != o.tong){
            return Integer.compare(o.tong, this.tong);
        }
        return this.ma.compareTo(o.ma);
    }
    
    
}

public class J05061_SapXepKetQuaXetTuyen {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        while(t-->0){
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        for(ThiSinh i : a){
            System.out.println(i);
        }
    }
}
