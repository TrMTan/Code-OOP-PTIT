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
    private int ma;
    private String hoten, diachi, dth;
    private static int sma = 1000;

    public NhanVien() {
    }

    public NhanVien(int ma, String hoten, String diachi, String dth) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dth = dth;
    }
    
    

    public NhanVien(String hoten, String diachi, String dth) throws TrongException, DienThoaiException {
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongException();
        if(!dth.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dth = dth;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDth() {
        return dth;
    }

    public void setDth(String dth) {
        this.dth = dth;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }

    public Object[] toObjects(){
        return new Object[]{
            ma, hoten, diachi, dth
        };
    }
}
