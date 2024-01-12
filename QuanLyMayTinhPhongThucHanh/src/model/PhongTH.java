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
public class PhongTH implements Serializable{
    private static int sma = 10000;
    private int ma;
    private String tenphong;
    private int slm;

    public PhongTH() {
    }

    public PhongTH(int ma, String tenphong, int slm) {
        this.ma = ma;
        this.tenphong = tenphong;
        this.slm = slm;
    }

    public PhongTH(String tenphong, int slm) throws TrongException {
        if(tenphong.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.tenphong = tenphong;
        this.slm = slm;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongTH.sma = sma;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getSlm() {
        return slm;
    }

    public void setSlm(int slm) {
        this.slm = slm;
    }

    
    public Object[] toObjects(){
        return new Object[] {
            ma, tenphong, slm
        };
    }
}
