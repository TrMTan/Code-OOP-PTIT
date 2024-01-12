/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07046_DanhSachLuuTru;

import java.util.Date;

/**
 *
 * @author tan
 */
public class KhachHang implements Comparable<KhachHang> {
    private String ma, ht, phong;
    private Date ngayDen, ngayDi;
    private long ngayO;
    private static int cnt = 1;

    public KhachHang(String ht, String phong, Date ngayDen, Date ngayDi) {
        this.ma = String.format("KH%02d", cnt++);
        this.ht = ht;
        this.phong = phong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.ngayO = (long)(ngayDi.getTime() - ngayDen.getTime()) / (1000 * 60 * 60 * 24);
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + phong + " " + ngayO;
    }
    
    @Override
    public int compareTo(KhachHang o) {
        return (int) (o.ngayO - this.ngayO);
    }
}
