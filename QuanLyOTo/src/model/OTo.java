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
public class OTo implements Serializable{
    private int ma;
    private String loai;
    private double tienthue;
    private int sl;
    private static int sma = 1000;

    public OTo() {
    }

    public OTo(String loai, double tienthue, int sl) {
        this.ma = sma++;
        this.loai = loai;
        this.tienthue = tienthue;
        this.sl = sl;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getTienthue() {
        return tienthue;
    }

    public void setTienthue(double tienthue) {
        this.tienthue = tienthue;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        OTo.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, loai, tienthue, sl
        };
    }
    
}
