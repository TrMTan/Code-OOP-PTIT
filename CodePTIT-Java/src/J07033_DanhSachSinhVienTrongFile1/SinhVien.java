/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07033_DanhSachSinhVienTrongFile1;

/**
 *
 * @author tan
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv, ht, lop, email;

    public SinhVien(String msv, String ht, String lop, String email) {
        this.msv = msv;
        this.ht = "";
        ht = ht.trim().toLowerCase();
        String[] s = ht.split("\\s+");
        for(String i : s){
            this.ht += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + email;
    }
    
    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }
}
