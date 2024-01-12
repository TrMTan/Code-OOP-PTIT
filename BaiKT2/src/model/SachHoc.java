/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class SachHoc {
    private String ma, ten, nhaXB;
    private double gia;
    private static int cnt = 1;

    public SachHoc() {
    }

    public SachHoc(String ten, String nhaXB, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }
    
    public void setMa(){
        this.ma = String.format("%02d", cnt++);
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
