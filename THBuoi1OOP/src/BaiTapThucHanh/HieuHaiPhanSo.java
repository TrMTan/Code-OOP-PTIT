/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

import java.util.Scanner;

/**
 *
 * @author tan
 */
class PhanSo {
    private long tu, mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public long gcd(long x, long y){
        while(y != 0){
            long tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
    
    public PhanSo rutGon(PhanSo a){
        long tmp = gcd(a.tu, a.mau);
        a.tu /= tmp;
        a.mau /= tmp;
        return a;
    }
    
    public PhanSo hieu(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.setTu(a.getTu() * b.getMau() - b.getTu() * a.getMau());
        c.setMau(a.getMau() * b.getMau());

        // Kiểm tra nếu tử nhỏ hơn mẫu thì thêm dấu âm
        if (Math.abs(c.getTu()) > c.getMau()) {
            c.setTu(-Math.abs(c.getTu()));
        }

        return c.rutGon(c);
    }
}

public class HieuHaiPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        a.rutGon(a);
        PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
        b.rutGon(b);
        if(a.getTu() == b.getTu() && b.getMau() == a.getMau()){
            System.out.println(0);
        }else{
            PhanSo c = a.hieu(a, b);
            System.out.println(c.getTu() + "/" + c.getMau());
        }
    }
}
