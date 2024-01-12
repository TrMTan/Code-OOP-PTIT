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
public class BangSX implements Serializable{
    private OTo oto;
    private KhachHang khachhang;
    private int sl, soNgayT;

    public BangSX() {
    }

    public BangSX(OTo oto, KhachHang khachhang, int sl, int soNgayT) {
        this.oto = oto;
        this.khachhang = khachhang;
        this.sl = sl;
        this.soNgayT = soNgayT;
    }

    public OTo getOto() {
        return oto;
    }

    public void setOto(OTo oto) {
        this.oto = oto;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getSoNgayT() {
        return soNgayT;
    }

    public void setSoNgayT(int soNgayT) {
        this.soNgayT = soNgayT;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            oto.getMa(), oto.getLoai(), khachhang.getMa(), khachhang.getHt(), sl, soNgayT
        };
    }
}
