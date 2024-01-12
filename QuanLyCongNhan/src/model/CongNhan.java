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
public class CongNhan implements Serializable{
    private int ma;
    private String  ht, dc, sdt;
    private int bac;
    private static int sma = 1000;

    public CongNhan() {
    }

    public CongNhan(int ma, String ht, String dc, String sdt, int bac) {
        this.ma = ma;
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
        this.bac = bac;
    }
    
    public CongNhan(String ht, String dc, String sdt, int bac) throws TrongException, DienThoaiException {
        this.ma = sma++;
        if(ht.isEmpty() || dc.isEmpty() || sdt.isEmpty()) throw new TrongException();
        if(!sdt.matches("\\d+")) throw new DienThoaiException();
        this.ht = ht;
        this.dc = dc;
        this.sdt = sdt;
        this.bac = bac;
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

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ht, dc, sdt, bac
        };
    }

}
