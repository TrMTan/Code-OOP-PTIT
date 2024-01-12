/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tan
 */
public class TaiLieu implements Serializable, Comparable<TaiLieu>{
    //Mã tài liệu (không trùng), Tên nhà xuất bản, Số bản phát hành
    private String ma, tenNXB;
    private int soBanPH;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBanPH) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    @Override
    public int compareTo(TaiLieu o) {
        //sx tang dan
        return soBanPH - o.getSoBanPH();
    }
}
