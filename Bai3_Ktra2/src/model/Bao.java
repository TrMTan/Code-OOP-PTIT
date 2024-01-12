/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Bao extends TaiLieu implements ITaiLieu{
    private String ngayPH;

    public Bao() {
    }

    public Bao(String tenNXB, String ngayPH, int soBanPH) {
        super(tenNXB, soBanPH);
        this.ngayPH = ngayPH;
    }
    
    public void setMa(){
        super.setMa();
        super.setMa("B-" + super.getMa());
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    
    @Override
    public String getCode() {
        // ma + 4 so: so nam trong ngay phat hanh
        String c = getMa().toUpperCase() + ngayPH.substring(ngayPH.lastIndexOf("/") + 1);
        return c;
    }

    @Override
    public String toString() {
        return super.getMa() + " " + super.getTenNXB() + " " + super.getSoBanPH() + " " + ngayPH;
    }
}
