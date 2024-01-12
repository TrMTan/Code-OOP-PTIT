/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap15;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class PhanSo {
    private double t;
    private double m;

    public PhanSo() {
    }

    public PhanSo(double t, double m) {
        this.t = t;
        this.m = m;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }
    
    public PhanSo nhap(){
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();
        m = sc.nextDouble();
        return new PhanSo(t, m);
    }

    public void xuat(){
        System.out.println(t + "/" + m);
    }
    
    public double gcd(double a, double b){
        while(b != 0){
            double tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public void rutgon(PhanSo a){
        double uc = gcd(a.t, a.m);
        a.t /= uc;
        a.m /= uc;
    }
    
    public PhanSo tong(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.t = a.t * b.m + a.m * b.t;
        c.m = a.m * b.m;
        rutgon(c);
        return c;
    }
    
    public PhanSo hieu(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.t = a.t * b.m - a.m * b.t;
        c.m = a.m * b.m;
        rutgon(c);
        return c;
    }
    
    public PhanSo tich(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.t = a.t * b.t;
        c.m = a.m * b.m;
        rutgon(c);
        return c;
    }
    
    public PhanSo thuong(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.t = a.t * b.m;
        c.m = a.m * b.t;
        rutgon(c);
        return c;
    }
}
