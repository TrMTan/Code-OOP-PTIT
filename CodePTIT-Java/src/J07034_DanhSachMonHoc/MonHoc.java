/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07034_DanhSachMonHoc;

/**
 *
 * @author tan
 */
public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, tin;

    public MonHoc(String ma, String ten, String tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tin;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ten.compareTo(o.ten);
    }
}
