/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

/**
 *
 * @author tan
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int slg;

    public DoanhNghiep(String ma, String ten, int slg) {
        this.ma = ma;
        this.ten = ten;
        this.slg = slg;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + slg;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.slg == o.slg){
            return this.ma.compareTo(o.ma);
        }
        return o.slg - this.slg;
    }
}
