/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class Sach extends TaiLieu implements ITaiLieu{
    // ten tac gia, ten sach, so trang
    private String tenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenNXB, int soBanPH, String tenTG, String tenSach, int soTrang) {
        super(tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }
    
    public void setMa(){
        super.setMa();
        super.setMa("S-" + super.getMa());
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override
    public String getCode() {
        // ma + ky tu dau tien cua ten sach
        String c = getMa().toUpperCase();
        StringTokenizer s = new StringTokenizer(tenSach.trim().toUpperCase());
        while(s.hasMoreTokens()){
            c += s.nextToken().charAt(0);
        }
        return c;
    }

    @Override
    public String toString() {
        return super.getMa() + " " + super.getTenNXB() + " " + super.getSoBanPH() + " " + tenSach + " " + tenTG + " " + soTrang;
    }
}
