/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Shape;

/**
 *
 * @author DELL
 */
public class HinhChuNhat extends Shape implements Hinh2D{
    private double chieuDai, chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    @Override
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public int tinhSoDinh() {
        return 4;
    }

    @Override
    public int tinhSoCanh() {
        return 4;
    }
}
