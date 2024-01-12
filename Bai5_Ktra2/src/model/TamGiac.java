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
public class TamGiac extends Shape implements Hinh2D{
    private double canhA, canhB, canhC;

    public TamGiac(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
    
    public boolean ktra(){
        return (canhA + canhB > canhC) && (canhB + canhC > canhA) && (canhA + canhC > canhB);
    }
    
    @Override
    public double chuVi() {
        return canhA + canhB + canhC;
    }

    @Override
    public double dienTich() {
        double s = (canhA + canhB + canhC) / 2;
        return Math.sqrt(s * (s - canhA) * (s - canhB) * (s - canhC));
    }

    @Override
    public int tinhSoDinh() {
        return 3;
    }

    @Override
    public int tinhSoCanh() {
        return 3;
    }
}
