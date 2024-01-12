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
public class HinhCau extends Shape implements Hinh3D{
    private double r;

    public HinhCau(double r) {
        this.r = r;
    }

    @Override
    public double chuVi() {
        return Math.round(2 * Math.PI * r);
    }

    @Override
    public double dienTich() {
        return Math.round(4 * Math.PI * r * r);
    }

    @Override
    public double tinhTheTich() {
        return Math.round(4 * Math.PI * r * r * r / 3);
    }

    @Override
    public double tinhDienTichXungQuanh() {
        return Math.round(4 * Math.PI * r * r);
    }

    @Override
    public int tinhSoDinh() {
        return 0;
    }

    @Override
    public int tinhSoCanh() {
        return 0;
    }
    
}
