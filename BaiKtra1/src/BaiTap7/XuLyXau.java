/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap7;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author tan
 */
public class XuLyXau {
    private String s;

    public XuLyXau() {
    }

    public XuLyXau(String s) {
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
    
    public void xuat(){
        System.out.print("In ra xau s: " + s);
    }
    
    public int dodaixau(String s){
        return s.length();
    }
    
    public int sotu(String s){
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
    
    public int socau(String s){
        String[] cau = s.trim().split("[.?!]+");
        return cau.length;
    }
    
    public void tachTu(String s){
        String[] words = s.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    
    public void tachSo(String s){
        String[] words = s.trim().split("\\s+");
        for(String word : words){
            boolean ok = true;
            for(char c : word.toCharArray()){
                if(Character.isLetter(c)){
                    ok = false;
                    break;
                }
            }
            if(ok){
                System.out.println(word);
            }
        }
    }
    
    public void ktdb(String s){
        String[] words = s.trim().split("[\\w\\s]+");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    
    public void tongSo(String s){
        int sum = 0;
        String[] words = s.trim().split("\\s+");
        for(String word : words){
            boolean ok = true;
            for(char c : word.toCharArray()){
                if(Character.isLetter(c)){
                    ok = false;
                    break;
                }
            }
            if(ok){
                int num = Integer.parseInt(word);
                sum += num;
            }
        }
        System.out.println("Tong cac so trong xau: " + sum);
    }
    
    public void tansuat(String s){
        Map<String, Integer> mp = new HashMap<>();
        String[] words = s.trim().split("\\s+");
        for(String word : words){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        System.out.println("Tan suat cac tu trong xau: ");
        for(Map.Entry<String, Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
    
    public void hopxau(String s1, String s2){
        Map<String, Integer> mp = new HashMap<>();
        String[] words1 = s1.trim().split("\\s+");
        String[] words2 = s2.trim().split("\\s+");
        for(String word : words1){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        for(String word : words2){
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
        System.out.print("Cac tu xuat hien trong ca hai xau: ");
        for(Map.Entry<String, Integer> i : mp.entrySet()){
            if(i.getValue() >= 2){
                System.out.print(i.getKey() + " ");
            }
        }
        System.out.println();
    }
}
