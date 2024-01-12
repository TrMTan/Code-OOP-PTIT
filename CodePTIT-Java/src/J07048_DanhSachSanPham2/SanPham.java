/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07048_DanhSachSanPham2;

/**
 *
 * @author tan
 */
public class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int gia, baoHanh;

    public SanPham(String ma, String ten, int gia, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + baoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.gia != o.gia){
            return o.gia - this.gia;
        }
        return this.ma.compareTo(o.ma);
    }  
}
