/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05025_SapXepDanhSachGiangVien;

/**
 *
 * @author tan
 */
public class GiangVien implements Comparable<GiangVien>{
    private String ma, ht, nganh, ten, nganhHoc;
    private static int cnt = 1;

    public GiangVien(String ht, String nganh) {
        this.ma = String.format("GV%02d", cnt++);
        this.ht = ht;
        this.nganh = nganh;
        String[] words = ht.split("\\s+");
        ten = words[words.length - 1];
        String[] tu = nganh.split("\\s+");
        nganhHoc = "";
        for(String i : tu){
            nganhHoc += i.substring(0, 1).toUpperCase();
        }
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + nganhHoc;
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.ten.equals(o.ten)){
            return this.ma.compareTo(o.ma);
        }
        return this.ten.compareTo(o.ten);
    }
}
