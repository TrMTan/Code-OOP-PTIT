/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033_SapXepThoiGian;

/**
 *
 * @author tan
 */
public class Time implements Comparable<Time>{
    private int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
    @Override
    public int compareTo(Time o) {
        if(this.h != o.h){
            return this.h - o.h;
        }
        if(this.m != o.m){
            return this.m - o.m;
        }
        return this.s - o.s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }
}
