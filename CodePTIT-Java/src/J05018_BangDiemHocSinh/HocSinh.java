/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018_BangDiemHocSinh;

/**
 *
 * @author tan
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ma, ht;
    private static int cnt = 1;
    private Float tb;

    public HocSinh(String ht, float[] p) {
        this.ma = String.format("HS%02d", cnt++);
        this.ht = ht;
        
        tb = 0f;
        for(int i = 0; i < 10; i++){
            tb += p[i] * ((i == 0 || i == 1) ? 2f : 1f);
        }
        tb /= 12f;
        tb = Math.round(tb * 10f) / 10f;
    }
    
    private String xepLoai(){
        if(tb >= 9f){
            return "XUAT SAC";
        }
        if(tb >= 8f){
            return "GIOI";
        }
        if(tb >= 7f){
            return "KHA";
        }
        if(tb >= 5f){
            return "TB";
        }
        return "YEU";
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + String.format("%.1f", tb) + " " + xepLoai();
    }

    @Override
    public int compareTo(HocSinh o) {
        if(this.tb.compareTo(o.tb) == 0){
            return this.ma.compareTo(o.ma);
        }
        return -this.tb.compareTo(o.tb);
    }
}
