/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07058_DanhSachMonThi;

/**
 *
 * @author tan
 */
public class MonThi implements Comparable<MonThi>{
    private String ma, ten, ht;

    public MonThi(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ht;
    }

    @Override
    public int compareTo(MonThi o) {
        return this.ma.compareTo(o.ma);
    }
}
