/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04005_KhaiBaoLopThiSinh;

/**
 *
 * @author tan
 */
public class ThiSinh {
    private String ht, dob;
    private double d1, d2, d3;

    public ThiSinh() {
        ht = "";
        dob = "";
        d1 = d2 = d3 = 0;
    }
    

    public ThiSinh(String ht, String dob, double d1, double d2, double d3) {
        this.ht = ht;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getD3() {
        return d3;
    }

    public void setD3(double d3) {
        this.d3 = d3;
    }
    
    public double tong(){
        return getD1() + getD2() + getD3();
    }
}
