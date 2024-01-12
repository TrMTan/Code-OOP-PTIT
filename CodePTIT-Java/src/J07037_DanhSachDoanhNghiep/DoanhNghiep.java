/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037_DanhSachDoanhNghiep;

/**
 *
 * @author tan
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten, sosv;

    public DoanhNghiep(String ma, String ten, String sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sosv;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.ma.compareTo(o.ma);
    }   
}
