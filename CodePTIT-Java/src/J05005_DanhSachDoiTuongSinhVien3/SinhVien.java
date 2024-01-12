/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05005_DanhSachDoiTuongSinhVien3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author tan
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv, ht, lop, ns;
    private float gpa;
    private static int cnt = 1;
    
    private String chuanHoa(String s){
        String t = "";
        String[] a = s.toLowerCase().trim().split("\\s+");
        for(String i : a){
            t += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return t;
    }

    public SinhVien(String ht, String lop, String ns, float gpa) throws ParseException {
        DateFormat dfm = new SimpleDateFormat("dd/mm/yyyy");
        this.msv = String.format("B20DCCN%03d", cnt++);
        this.ht = chuanHoa(ht);
        this.lop = lop;
        this.ns = dfm.format(dfm.parse(ns));
        this.gpa = gpa;
    }

    public Float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(SinhVien o) {
        return -(this.getGpa().compareTo(o.getGpa()));
    }
}
