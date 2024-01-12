/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class BangDSB implements Serializable{
    private MatHang mh;
    private NhanVien nv;
    private String ngayBan;
    private int sl;
    
    public BangDSB() {
    }

    public BangDSB(MatHang mh, NhanVien nv, String ngayBan, int sl) {
        this.mh = mh;
        this.nv = nv;
        this.ngayBan = ngayBan;
        this.sl = sl;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    

    public Object[] toObjects(){
        return new Object[]{
            mh.getMa(), mh.getTen(), mh.getNhom(), nv.getMa(), nv.getHt(), ngayBan, sl, mh.getGia()
        };
    }
}
