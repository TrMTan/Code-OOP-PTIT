/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007_SapXepDoiTuongDanhSachNhanVien;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tan
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ht, gt, dc, mst, hd;
    private Date ns;
    private static int cnt = 1;
    private SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");


    public NhanVien(String ht, String gt, String ns, String dc, String mst, String hd) throws ParseException {
        this.ma = String.format("%05d", cnt++);
        this.ht = ht;
        this.gt = gt;
        this.ns = dfm.parse(ns);
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + gt + " " + dfm.format(ns) + " " + dc + " " + mst + " " + hd;
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ns.compareTo(o.ns);
    }
}
