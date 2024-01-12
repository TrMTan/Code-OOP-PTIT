/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04014_TinhToanPhanSo;

/**
 *
 * @author tan
 */
public class PhanSo {
    private long tu, mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long gcd(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public PhanSo rutGon(PhanSo a){
        long t = gcd(a.tu, a.mau);
        a.tu /= t;
        a.mau /= t;
        return a;
    }
    
    public PhanSo tong(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = a.tu * b.mau + a.mau * b.tu;
        c.mau = a.mau * b.mau;
        return c.rutGon(c);
    }
    
    public PhanSo nhan(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = a.tu * b.tu;
        c.mau = a.mau * b.mau;
        return c.rutGon(c);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
