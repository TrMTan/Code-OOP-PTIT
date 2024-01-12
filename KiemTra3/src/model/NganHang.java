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
public class NganHang implements Serializable{
    private static int sma = 100;
    private int ma;
    private String tenNH;
    private int laisuat;

    public NganHang() {
    }

    public NganHang(int ma, String tenNH, int laisuat) {
        this.ma = ma;
        this.tenNH = tenNH;
        this.laisuat = laisuat;
    }

    public NganHang(String tenNH, int laisuat) throws TrongException {
        if(tenNH.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.tenNH = tenNH;
        this.laisuat = laisuat;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NganHang.sma = sma;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenNH() {
        return tenNH;
    }

    public void setTenNH(String tenNH) {
        this.tenNH = tenNH;
    }

    public int getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(int laisuat) {
        this.laisuat = laisuat;
    }

    public Object[] toObjects(){
        return new Object[] {
            ma, tenNH, laisuat
        };
    }
}
