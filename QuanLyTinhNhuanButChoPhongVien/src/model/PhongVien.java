/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class PhongVien implements Serializable{
    private int ma;
    private String ht, dc, loai;
    private static int sma = 1000;

    public PhongVien() {
    }

    public PhongVien(int ma, String ht, String dc, String loai) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.loai = loai;
    }
    
    public PhongVien(String ht, String dc, String loai) throws TrongException {
        if(ht.isEmpty() || dc.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ht = ht;
        this.dc = dc;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongVien.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ht, dc, loai
        };
    }
}
