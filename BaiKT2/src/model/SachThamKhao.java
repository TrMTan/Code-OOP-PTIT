/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class SachThamKhao extends SachHoc implements ISach{
    private boolean loai;

    public SachThamKhao() {
    }

    public SachThamKhao(String ten, String nhaXB, boolean loai, double gia) {
        super(ten, nhaXB, gia);
        this.loai = loai;
    }
    
    public void setMa(){
        super.setMa();
        String[] a = getNhaXB().split("\\s+");
        String c = "";
        for(String i : a){
            c += i.substring(0, 1).toUpperCase();
        }
        super.setMa(c + super.getMa());
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
    
    public String inloai(){
        if(loai == true){
            return "co ban";
        }else{
            return "nang cao";
        }
    }
    
    @Override
    public double getGia() {
        if(loai == true){
            return super.getGia() * 110 / 100;
        }else{
            return super.getGia() * 115 / 100;
        }
    }

    @Override
    public String toString() {
        return getMa() + " " + getTen() + " " + getNhaXB() + " " + inloai() + " " + String.format("%.0f", getGia());
    }
}
