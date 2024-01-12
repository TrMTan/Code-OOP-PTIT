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
    private Phong p;
    private KhachHang kh;
    private String ngayt;
    private int slp;

    public BangSX() {
    }

    public BangSX(Phong p, KhachHang kh, String ngayt, int slp) {
        this.p = p;
        this.kh = kh;
        this.ngayt = ngayt;
        this.slp = slp;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public String getNgayt() {
        return ngayt;
    }

    public void setNgayt(String ngayt) {
        this.ngayt = ngayt;
    }

    public int getSlp() {
        return slp;
    }

    public void setSlp(int slp) {
        this.slp = slp;
    }
    
    

    public Object[] toObjects(){
        return new Object[]{
            p.getMa(), p.getKieup(), kh.getMa(), kh.getHt(), slp, ngayt
        };
    }
}
