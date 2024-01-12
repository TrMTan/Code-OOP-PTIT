/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class NhanVien implements Serializable{
    private static int sma = 100;
    private int ma;
    private String ht, dc, sdt;

    public NhanVien() {
    }

    public NhanVien(int ma, String ht, String dc, String sdt) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
    }

    

    public NhanVien(String ht, String dc, String sdt) throws TrongException, DienThoaiException {
        if(ht.isEmpty() || dc.isEmpty()) throw new TrongException();
        if(!sdt.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
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

    
    
    public Object[] toObjects(){
        return new Object[] {
            ma, ht, dc, sdt
        };
    }
}
