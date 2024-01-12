/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class SachGiaoKhoa extends SachHoc implements ISach{
    private int lop, tap;
    private boolean baitap;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String ten, String nhaXB, int lop, int tap, boolean baitap, double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
        this.baitap = baitap;
    }
    
    public void setMa(){
        super.setMa();
        super.setMa("SGK" + lop + tap + super.getMa());
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getTap() {
        return tap;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public boolean isBaitap() {
        return baitap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }
    
    public String inBT(){
        if(baitap = false){
            return "bai tap";
        }else{
            return "ly thuyet";
        }
    }
    
    @Override
    public double getGia() {
        double tmp = 0;
        if(lop >= 1 && lop < 6){
            tmp = super.getGia() * 90 / 100;
        }else if(lop <= 9){
            tmp = super.getGia() * 95 / 100;
        }else{
            return super.getGia();
        }
        if(baitap == true){
            tmp = tmp * 105 / 100;
        }
        return tmp;
    }

    @Override
    public String toString() {
        return getMa() + " " + getTen() + " " + getNhaXB() + " " + getLop() + " " + getTap() + " " + inBT() + " " + String.format("%.0f", getGia());
    }
}
