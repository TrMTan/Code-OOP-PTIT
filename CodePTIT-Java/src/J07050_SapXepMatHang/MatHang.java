/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050_SapXepMatHang;

/**
 *
 * @author tan
 */
public class MatHang implements Comparable<MatHang>{
    private String ma, ten, nhom;
    private float gmua, gban;
    private float lai;
    private static int cnt = 1;

    public MatHang(String ten, String nhom, float gmua, float gban) {
        this.ma = String.format("MH%02d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.gmua = gmua;
        this.gban = gban;
        this.lai = gban - gmua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", lai);
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.lai > o.lai){
            return -1;
        }else if(this.lai < o.lai){
            return 1;
        }
        return 0;
    }
}
