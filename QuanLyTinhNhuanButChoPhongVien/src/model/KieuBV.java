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
public class KieuBV implements Serializable{
    private int ma;
    private String ten;
    private int gia;
    private static int sma = 100;

    public KieuBV() {
    }

    public KieuBV(int ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    
    public KieuBV(String ten, int gia) throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KieuBV.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, gia
        };
    }
}
