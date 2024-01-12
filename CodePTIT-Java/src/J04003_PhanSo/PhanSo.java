/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04003_PhanSo;

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
}
