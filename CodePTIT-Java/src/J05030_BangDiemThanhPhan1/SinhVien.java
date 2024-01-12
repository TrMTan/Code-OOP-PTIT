/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05030_BangDiemThanhPhan1;

/**
 *
 * @author tan
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv, ht, lop;
    private float d1, d2, d3;

    public SinhVien(String msv, String ht, String lop, float d1, float d2, float d3) {
        this.msv = msv;
        this.ht = ht;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + String.format(" %.1f", d1) + " " + String.format(" %.1f", d2) + " " + String.format(" %.1f", d3);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }

}
