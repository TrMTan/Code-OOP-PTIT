/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class BangChamCong implements Serializable{
    private CongNhan congnhan;
    private Xuong xuong;
    private int soNgay;

    public BangChamCong() {
    }

    public BangChamCong(CongNhan congnhan, Xuong xuong, int soNgay) {
        this.congnhan = congnhan;
        this.xuong = xuong;
        this.soNgay = soNgay;
    }

    public CongNhan getCongnhan() {
        return congnhan;
    }

    public void setCongnhan(CongNhan congnhan) {
        this.congnhan = congnhan;
    }

    public Xuong getXuong() {
        return xuong;
    }

    public void setXuong(Xuong xuong) {
        this.xuong = xuong;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            congnhan.getMa(), xuong.getMa(), congnhan.getHt(), soNgay
        };
    }
}
