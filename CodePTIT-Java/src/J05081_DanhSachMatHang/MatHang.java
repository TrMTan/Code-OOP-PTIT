/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081_DanhSachMatHang;

/**
 *
 * @author tan
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, dvi;
    private int giaMua, giaBan, loiNhuan;
    private static int cnt = 1;

    public MatHang(String ten, String dvi, int giaMua, int giaBan) {
        this.ma = String.format("MH%03d", cnt++);
        this.ten = ten;
        this.dvi = dvi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
    
    @Override
    public int compareTo(MatHang o) {
        if(this.loiNhuan != o.loiNhuan){
            return o.loiNhuan - this.loiNhuan;
        }
        return this.ma.compareTo(o.ma);
    }
}
