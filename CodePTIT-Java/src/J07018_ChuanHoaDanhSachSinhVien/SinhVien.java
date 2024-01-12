/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07018_ChuanHoaDanhSachSinhVien;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author tan
 */
public class SinhVien {
    private String msv, ht, lop, ns;
    private double gpa;
    private static int cnt = 1;

    public SinhVien(String ht, String lop, String ns, double gpa) throws ParseException {
        DateFormat dfm = new SimpleDateFormat("dd/mm/yyyy");
        this.msv = String.format("B20DCCN%03d", cnt++);
        this.ht = chuanHoa(ht);
        this.lop = lop;
        this.ns = dfm.format(dfm.parse(ns));
        this.gpa = gpa;
    }

    public String chuanHoa(String s){
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        s = "";
        for(String i : tmp){
            s += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return s.trim();
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}
