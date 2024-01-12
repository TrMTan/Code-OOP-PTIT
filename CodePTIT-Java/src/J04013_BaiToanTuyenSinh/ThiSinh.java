/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04013_BaiToanTuyenSinh;

/**
 *
 * @author tan
 */
public class ThiSinh {
    private String ma, ht, tb;
    private float t, l, h, uuTien, tong;

    public ThiSinh(String ma, String ht, float t, float l, float h) {
        this.ma = ma;
        this.ht = ht;
        this.t = t;
        this.l = l;
        this.h = h;
        if(this.ma.charAt(2) == '1'){
            this.uuTien = 0.5f;
        }else if(this.ma.charAt(2) == '2'){
            this.uuTien = 1f;
        }else{
            this.uuTien = 2.5f;
        }
        this.tong = this.t * 2 + this.l + this.h;
        if(this.tong + this.uuTien >= 24){
            this.tb = "TRUNG TUYEN";
        }else{
            this.tb = "TRUOT";
        }
    }

    @Override
    public String toString() {
        String res = String.format("%s %s ", this.ma, this.ht);
        if(this.uuTien == (int)this.uuTien){
            res += String.format("%.0f ", this.uuTien);
        }else{
            res += String.format("%.1f ", this.uuTien);
        }
        if(this.tong == (int)this.tong){
            res += String.format("%.0f ", this.tong);
        }else{
            res += String.format("%.1f ", this.tong);
        }
        res += this.tb;
        return res;
    }
}
