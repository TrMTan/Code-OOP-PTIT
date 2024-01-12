/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap14;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class ChuanHoaXau {
    private String s;

    public ChuanHoaXau() {
    }

    public ChuanHoaXau(String s) {
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
        s = sc.nextLine();
    }
    
    public void xuat(){
        System.out.print(s);
        System.out.println();
    }
    
    public String fullName(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            String word = words[i].toLowerCase();
            if(!word.isEmpty()){
                char vH = Character.toUpperCase(word.charAt(0));
                String tmp = word.substring(1);
                a.append(vH).append(tmp);
            }
            if(i < words.length - 1){
                a.append(" ");
            }
        }
        return a.toString();
    }
    
    public String lastName(String s){
        String a = fullName(s);
        String[] words = a.trim().split("\\s+");
        StringBuilder b = new StringBuilder();
        String tmp = words[0];
        for(int i = 1; i < words.length; i++){
            b.append(words[i]);
            if(i < words.length - 1){
                b.append(" ");
            }
        }
        b.append(", ");
        b.append(tmp);
        return b.toString();
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
    
    public String doanvan(String s){
        // chia doan van thanh cac cau
        String[] caus = s.trim().split("(?<=[.?!])\\s+");
        StringBuilder a = new StringBuilder();
        
        for(int i = 0; i < caus.length; i++){
            //Loai bo khoang trang o dau cau va cuoi cau
            String cau = caus[i].trim();
            
            // chuan hoa chu cai dau tien cua cau
            char fc = Character.toUpperCase(cau.charAt(0));
            String caubt = fc + cau.substring(1);
            
            // them khoang trang giua cac dau cau
            caubt = caubt.replaceAll("\\s*([.,!?])", "$1 ");
            
            a.append(caubt);
            
            // them dau cham, cham hoi, cham than vao cuoi cau
            if(!caubt.endsWith(".") && !caubt.endsWith("!") && !caubt.endsWith("?")){
                a.append(".");
            }
//            if(i < cau.length() - 1){
//                a.append(". ");
//            }
        }
        return a.toString();
    }
}
