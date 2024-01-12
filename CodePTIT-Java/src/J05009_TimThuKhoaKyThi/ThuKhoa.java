/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009_TimThuKhoaKyThi;

/**
 *
 * @author tan
 */
public class ThuKhoa implements Comparable<ThuKhoa>{
    private String ht, ns;
    private int ma;
    private Float d1, d2, d3, tong;
    private static int cnt = 1;

    public ThuKhoa(String ht, String ns, float d1, float d2, float d3) {
        this.ht = ht;
        this.ns = ns;
        this.ma = cnt++;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1 + d2 + d3;
    }

    public Float getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + ns + " " + tong;
    }

    @Override
    public int compareTo(ThuKhoa o) {
        if(this.tong.compareTo(o.tong) == 0){
            return this.ma - o.ma;
        }
        return -this.tong.compareTo(o.tong);
    }  
}
