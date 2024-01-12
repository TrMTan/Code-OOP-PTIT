/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010_SapXepDanhSachMatHang;

/**
 *
 * @author tan
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, nhom;
    private Float mua, ban, lai;
    private static int cnt = 1;

    public MatHang(String ten, String nhom, float mua, float ban) {
        this.ma = String.format("%01d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.lai = ban - mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", lai);
    }

    @Override
    public int compareTo(MatHang o) {
        return -this.lai.compareTo(o.lai);
    } 
}
