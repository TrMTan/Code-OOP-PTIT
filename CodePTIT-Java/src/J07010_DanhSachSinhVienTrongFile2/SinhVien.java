/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07010_DanhSachSinhVienTrongFile2;

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
        msv = String.format("B20DCCN%03d", cnt++);
        this.ht = ht;
        DateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        this.ns = date.format(date.parse(ns));
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}
