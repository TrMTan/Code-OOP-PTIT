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
public class KhachHang implements Serializable{
    private int ma;
    private String ht, dc, loaiKH;
    private static int sma = 10000;

    public KhachHang() {
    }

    public KhachHang(int ma, String ht, String dc, String loaiKH) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.loaiKH = loaiKH;
    }

    public KhachHang(String ht, String dc, String loaiKH) throws TrongException {
        if(ht.isEmpty() || dc.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ht = ht;
        this.dc = dc;
        this.loaiKH = loaiKH;
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

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ht, dc, loaiKH                                                           
        };
    }
    
}
