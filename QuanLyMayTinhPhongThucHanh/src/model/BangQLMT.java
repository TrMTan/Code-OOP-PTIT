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
public class BangQLMT implements Serializable{
    private MayTinh mt;
    private PhongTH pth;
    private String tinhtrang;
    private int sl;

    public BangQLMT() {
    }

    public BangQLMT(MayTinh mt, PhongTH pth, String tinhtrang, int sl) {
        this.mt = mt;
        this.pth = pth;
        this.tinhtrang = tinhtrang;
        this.sl = sl;
    }

    public MayTinh getMt() {
        return mt;
    }

    public void setMt(MayTinh mt) {
        this.mt = mt;
    }

    public PhongTH getPth() {
        return pth;
    }

    public void setPth(PhongTH pth) {
        this.pth = pth;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }  

    public Object[] toObjects(){
        return new Object[]{
            mt.getMa(), mt.getTen(), pth.getMa(), pth.getTenphong(), tinhtrang, sl
        };
    }
}
