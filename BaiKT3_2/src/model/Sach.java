/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author tan
 */
public class Sach extends TaiLieu implements ITaiLieu, Serializable{
    //Tên tác giả, Tên sách, số trang
    
    private String tenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String ma, String tenNXB, int soBanPH, String tenTG, String tenSach, int soTrang) {
        super(ma, tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
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
        String c = getMa().toUpperCase();
        StringTokenizer s = new StringTokenizer(tenSach.trim().toUpperCase());
        while (s.hasMoreTokens()) {
            c += s.nextToken().charAt(0);
        }
        return c;
    }
    
    public String toString(){
        return getMa() + " " + tenSach + " " + tenTG + " " + soTrang + " " + getTenNXB() + " " + getSoBanPH();
    }
}
