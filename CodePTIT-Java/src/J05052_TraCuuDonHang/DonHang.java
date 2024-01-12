/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05052_TraCuuDonHang;

/**
 *
 * @author tan
 */
public class DonHang {
    private String ten, ma, stt;
    private long donGia, soLuong, giamGia, thanhTien;

    public DonHang(String ten, String ma, long donGia, long soLuong) {
        this.ten = ten;
        this.ma = ma;
        this.stt = String.valueOf(ma.substring(1, 4));
        this.donGia = donGia;
        this.soLuong = soLuong;
        if(this.ma.charAt(4) == '1'){
            this.giamGia = donGia * soLuong * 50 / 100;
            this.thanhTien = this.giamGia;
        }else{
            this.giamGia = donGia * soLuong * 30 / 100;
            this.thanhTien = this.donGia * this.soLuong - this.giamGia;
        }
        
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + stt + " " + giamGia + " " + thanhTien;
    }
}
