/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07055_XepLoai;

/**
 *
 * @author tan
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ht, ma, hang;
    private static int cnt = 1;
    private int d1, d2, d3;
    
    public SinhVien(String ht, int d1, int d2, int d3) {
        this.ma = String.format("SV%02d", cnt++);
        this.ht = "";
        ht = ht.trim().toLowerCase();
        String[] s = ht.split("\\s+");
        for(String i : s){
            this.ht += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        float tb = this.tb();
        if(tb >= 8f){
            this.hang = "GIOI";
        }else if(tb >= 6.5f){
            this.hang = "KHA";
        }else if(tb >= 5f){
            this.hang = "TRUNG BINH";
        }else{
            this.hang = "KEM";
        }
    }
    
    public float tb(){
        return d1 * 0.25f + d2 * 0.35f + d3 * 0.4f;
    }

    @Override
    public String toString() {
        return ma + " " + ht + String.format("%.2f", tb()) + " " + hang;
    }

    @Override
    public int compareTo(SinhVien o) {
        return -Float.compare(this.tb(), o.tb());
    }

}
