/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Xau {
    private String s;

    public Xau() {
    }

    public Xau(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao xau s: ");
        s = sc.nextLine();
    }
    
    public int dodaixau(String s){
        return s.length();
    }
    
    public int socau(String s){
        String[] cau = s.trim().split("[.?!]+");
        return cau.length;
    }
}
