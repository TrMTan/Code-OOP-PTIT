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
public class MayTinh implements Serializable{
    private int ma;
    private String ten, xuatxu, namnhap, cauhinh;
    private static int sma = 10000;

    public MayTinh() {
    }

    public MayTinh(int ma, String ten, String xuatxu, String namnhap, String cauhinh) {
        this.ma = ma;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namnhap = namnhap;
        this.cauhinh = cauhinh;
    }

    public MayTinh(String ten, String xuatxu, String namnhap, String cauhinh) throws TrongException {
        if(ten.isEmpty() || cauhinh.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namnhap = namnhap;
        this.cauhinh = cauhinh;
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

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getNamnhap() {
        return namnhap;
    }

    public void setNamnhap(String namnhap) {
        this.namnhap = namnhap;
    }

    public String getCauhinh() {
        return cauhinh;
    }

    public void setCauhinh(String cauhinh) {
        this.cauhinh = cauhinh;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MayTinh.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, xuatxu, namnhap, cauhinh                                                           
        };
    }
    
}
