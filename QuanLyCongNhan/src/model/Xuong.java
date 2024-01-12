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
public class Xuong implements Serializable{
    private int ma;
    private String ten;
    private int heso;
    private static int sma = 100;

    public Xuong() {
    }

    public Xuong(int ma, String ten, int heso) {
        this.ma = ma;
        this.ten = ten;
        this.heso = heso;
    }
    
    public Xuong(String ten, int heso) throws TrongException {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.heso = heso;
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

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Xuong.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, heso
        };    
    }
}
