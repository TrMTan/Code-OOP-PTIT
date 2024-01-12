/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author tan
 */
public class Bao extends TaiLieu implements ITaiLieu, Serializable{
    private String ngayPH;

    public Bao() {
    }

    public Bao(String ma, String tenNXB, String ngayPH, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.ngayPH = ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public String getCode() {
        String c = getMa().toUpperCase() + ngayPH.substring(ngayPH.lastIndexOf("/") + 1);
        return c;
    }
    
    public int getNam(){
        try{
            return Integer.parseInt(ngayPH.substring(ngayPH.lastIndexOf("/") + 1));
        }catch(NumberFormatException e){
            Calendar c = Calendar.getInstance();
            return c.get(Calendar.YEAR);
        }
    }
    
    public String toString(){
        return getMa() + " " + getTenNXB() + " " + ngayPH + " " + getSoBanPH();
    }
}
