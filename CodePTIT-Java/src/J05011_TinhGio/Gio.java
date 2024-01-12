/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05011_TinhGio;

/**
 *
 * @author tan
 */
public class Gio implements Comparable<Gio>{
    private String ma, ht, vao, ra;
    private int choi;

    public Gio(String ma, String ht, String vao, String ra) {
        this.ma = ma;
        this.ht = ht;
        this.vao = vao;
        this.ra = ra;
        this.choi = 60 * (Integer.parseInt(ra.substring(0, 2)) - Integer.parseInt(vao.substring(0, 2))) + 
                (Integer.parseInt(ra.substring(3)) - Integer.parseInt(vao.substring(3)));
    }
    
    public String getTime(){
        int h = choi / 60;
        int m = choi % 60;
        return String.format("%d gio %d phut", h, m);
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + getTime();
    }

    @Override
    public int compareTo(Gio o) {
        return -(this.choi - o.choi);
    }

}
