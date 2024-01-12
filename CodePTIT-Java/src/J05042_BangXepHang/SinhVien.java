/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042_BangXepHang;

/**
 *
 * @author tan
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ht;
    private int AC, S;

    public SinhVien() {
    }

    public SinhVien(String ht, int AC, int S) {
        this.ht = ht;
        this.AC = AC;
        this.S = S;
    } 
    
    @Override
    public String toString() {
        return ht + " " + AC + " " + S;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.AC != o.AC){
            return o.AC - this.AC;
        }else{
            if(this.S != o.S){
                return this.S - o.S;
            }else{
                return this.ht.compareTo(o.ht);
            }
        }
    }
}
