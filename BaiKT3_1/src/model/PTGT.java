/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Collections;
import javax.print.DocFlavor;

/**
 *
 * @author tan
 */
public class PTGT implements Serializable, Comparable<PTGT>{
//     mã, hãng sản xuất, năm sản xuất, giá bán, màu.
    private String ma, hang;
    private int nam;
    private double gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String ma, String hang, int nam, double gia, String mau) {
        this.ma = ma;
        this.hang = hang;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    @Override
    public String toString(){
        DecimalFormat f = new DecimalFormat("##.##"); 
        return ma + " " + hang + " " + nam + " " + f.format(gia) + " " + mau;
    }

    @Override
    public int compareTo(PTGT o) { // dung compareTo chi sx dc 1 thuoc tinh, muon sx thuoc tinh khac phai thay 
        // sap xep theo nam - tang dan
        return this.nam - o.getNam();
        // giam dan
//        return o.getNam() - this.nam;
    }
}
