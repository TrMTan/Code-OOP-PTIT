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
    private static int sma = 100;
    private int ma;
    private String ht, loaip;
    private int sopt;

    public KhachHang() {
    }

    public KhachHang(int ma, String ht, String loaip, int sopt) {
        this.ma = ma;
        this.ht = ht;
        this.loaip = loaip;
        this.sopt = sopt;
    }

    public KhachHang(String ht, String loaip, int sopt) throws TrongException {
        if(ht.isEmpty() || loaip.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ht = ht;
        this.loaip = loaip;
        this.sopt = sopt;
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

    public String getLoaip() {
        return loaip;
    }

    public void setLoaip(String loaip) {
        this.loaip = loaip;
    }

    public int getSopt() {
        return sopt;
    }

    public void setSopt(int sopt) {
        this.sopt = sopt;
    }
    
    
    
    public Object[] toObjects(){
        return new Object[] {
            ma, ht, loaip, sopt
        };
    }
}
