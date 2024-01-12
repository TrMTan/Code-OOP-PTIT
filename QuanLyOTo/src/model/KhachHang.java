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
public class KhachHang implements Serializable{
    private static int sma = 100;
    private int ma;
    private String ht, sdt;

    public KhachHang() {
    }

    public KhachHang(int ma, String ht, String sdt) {
        this.ma = ma;
        this.ht = ht;
        this.sdt = sdt;
    }

    public KhachHang(String ht, String sdt) throws TrongException, DienThoaiException {
        if(ht.isEmpty()) throw new TrongException();
        if(!sdt.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.ht = ht;
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public Object[] toObjects(){
        return new Object[] {
            ma, ht, sdt
        };
    }
}
