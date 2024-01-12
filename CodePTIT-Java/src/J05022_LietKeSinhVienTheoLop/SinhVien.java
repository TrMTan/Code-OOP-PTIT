/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05022_LietKeSinhVienTheoLop;

/**
 *
 * @author tan
 */
public class SinhVien {
    private String msv, ht, lop, email;

    public SinhVien(String msv, String ht, String lop, String email) {
        this.msv = msv;
        this.ht = ht;
        this.lop = lop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + email;
    }
}
