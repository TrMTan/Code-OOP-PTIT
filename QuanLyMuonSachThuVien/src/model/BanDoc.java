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
public class BanDoc implements Serializable{
    //mã bạn đọc, Họ tên, địa chỉ, Số ĐT
    private int ma;
    private String ht, dc, sdt;
    private static int sma = 10000;

    public BanDoc() {
    }

    public BanDoc(int ma, String ht, String dc, String sdt) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma, ht, dc, sdt
        };
    }
}
