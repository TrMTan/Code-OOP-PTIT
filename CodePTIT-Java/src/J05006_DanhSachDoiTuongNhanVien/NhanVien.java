/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05006_DanhSachDoiTuongNhanVien;

/**
 *
 * @author tan
 */
public class NhanVien {
    private String ma, ht, gt, ns, dc, mst, hd;
    private static int cnt = 1;

    public NhanVien(String ht, String gt, String ns, String dc, String mst, String hd) {
        this.ma = String.format("%05d", cnt++);
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + gt + " " + ns + " " + dc + " " + mst + " " + hd;
    }
}
