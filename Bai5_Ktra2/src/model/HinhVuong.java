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
public class HinhVuong extends Shape implements Hinh2D {
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }
    
    @Override
    public double chuVi() {
        return 4 * canh;
    }

    @Override
    public double dienTich() {
        return canh * canh;
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
