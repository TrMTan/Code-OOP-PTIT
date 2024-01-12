/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04012_BaiToanTinhCong;

/**
 *
 * @author tan
 */
public class NhanVien {
    private String ma, ht, chucVu;
    private double luongCB, phuCap, ngayCong, tienLuong, thuNhap, tienThuong;

    public NhanVien(String ht, double luongCB, double ngayCong, String chucVu) {
        this.ma = "NV01";
        this.ht = ht;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.tienLuong = this.luongCB * this.ngayCong;
        if(this.ngayCong >= 25){
            this.tienThuong = this.tienLuong * 20 / 100;
        }else if(this.ngayCong >= 22){
            this.tienThuong = this.tienLuong * 10 / 100;
        }
        if(this.chucVu.equals("GD")){
            this.phuCap = 250000;
        }else if(this.chucVu.equals("PGD")){
            this.phuCap = 200000;
        }else if(this.chucVu.equals("TP")){
            this.phuCap = 180000;
        }else{
            this.phuCap = 150000;
        }
        this.thuNhap = this.tienLuong + this.phuCap + this.tienThuong;
    }
    
    

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f %.0f %.0f", this.ma, this.ht, this.tienLuong, this.tienThuong, this.phuCap, this.thuNhap);
    }
}
