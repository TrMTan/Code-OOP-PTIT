/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoDichVuDien;

/**
 *
 * @author DELL
 */
public class DichVu {
    private String ma, ten, soDienThoai;

    public DichVu() {
    }

    public DichVu(String ma, String ten, String soDienThoai) {
        this.ma = ma;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
