/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tan
 */
public class GiaoDichTT extends GiaoDich implements IGiaoDich{
    //tỉ giá, loại tiền tệ
    private double tigia;
    private String loaiTien;

    public GiaoDichTT() {
    }

    public GiaoDichTT(String ngay, double gia, int soluong, double tigia, String loaiTien) {
        super(ngay, gia, soluong);
        this.tigia = tigia;
        this.loaiTien = loaiTien;
    }
    
    public GiaoDichTT(String ngay, double gia, int soluong, String loaiTien) {
        super(ngay, gia, soluong);
        this.loaiTien =loaiTien.toUpperCase();
        if (this.loaiTien.equals("VND")){
            this.tigia = 1.0;
        } else this.tigia=23.0;
    }
    
    public void setMa(){
        super.setMa();
        super.setMa("TT-" + super.getMa());
    }

    public double getTigia() {
        return tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public double getThanhTien() {
        if(getLoaiTien().equalsIgnoreCase("VN")){
            return super.getSoluong() * super.getGia();
        }else{
            return super.getSoluong() * super.getGia() * getTigia();
        }
    }

    @Override
    public String toString() {
        return getMa() + " " + getNgay() + " " + getGia() + " " + getSoluong() + " " + getLoaiTien() + " " + getTigia() + " " + getThanhTien();
    }
}
