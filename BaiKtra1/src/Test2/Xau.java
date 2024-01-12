/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

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
        System.out.print("Nhap vao 1 doan: ");
        s = sc.nextLine();
    }
    
    public void doDaiXau(){
        System.out.println("Do dai cua Xau: " + s.length());
    }
    
    public static boolean containsDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    public void tachTu(){
        String[] words = s.trim().split("\\s+");
        StringBuilder kq = new StringBuilder();
        for(String i : words){
            if (!containsDigit(i)) {
                kq.append(i).append(" ");
            }
        }
        
        if (kq.length() > 0) {
            kq.setLength(kq.length() - 1);
        }
        System.out.println(kq.toString());
    }
}
