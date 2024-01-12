/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05020_SapXepSinhVienTheoLop;

/**
 *
 * @author tan
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv, ht, lop, email;

    public SinhVien(String msv, String ht, String lop, String email) {
        this.msv = msv;
        this.ht = ht;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)){
            return this.msv.compareTo(o.msv);
        }
        return this.lop.compareTo(o.lop);
    }
}
