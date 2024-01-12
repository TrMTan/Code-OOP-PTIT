/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test3;

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
        System.out.print("Nhap vao 1 xau: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }
    
    public void xuat(){
        System.out.print(s);
        System.out.println();
    }
    
    public String email(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder a = new StringBuilder();
        String tmp = words[words.length - 1].toLowerCase();
        a.append(tmp);
        for(int i = 0; i < words.length - 1; i++){
            String word = words[i].toLowerCase();
            a.append(word.charAt(0));
        }
        a.append("@ptit.edu.vn");
        return a.toString();
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
