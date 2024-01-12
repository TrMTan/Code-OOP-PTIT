/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006_KhaiBaoLopSinhVien;

/**
 *
 * @author tan
 */
public class SinhVien {
    private String msv, ht, lop, dob;
    private double gpa;

    public SinhVien() {
        this.msv = "B20DCCN001";
        this.ht = "";
        this.lop = "";
        this.dob = "";
        this.gpa = 0;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public String ngaysinh(SinhVien a){
        StringBuilder c = new StringBuilder(a.getDob());
        if(c.charAt(1) == '/') c.insert(0, "0");
        if(c.charAt(4) == '/') c.insert(3, "0");
        return c.toString();
    }
}
