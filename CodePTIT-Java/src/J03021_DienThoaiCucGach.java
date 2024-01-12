
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03021_DienThoaiCucGach {
    public static Scanner sc = new Scanner(System.in);
    
    public static String so(Character c){
        if(c <= 'c') 
            return "2";
        else if(c <= 'f') 
            return "3";
        else if(c <= 'i') 
            return "4";
        else if(c <= 'l') 
            return "5";
        else if(c <= 'o') 
            return "6";
        else if(c <= 's') 
            return "7";
        else if(c <= 'v') 
            return "8";
        return "9";
    } 
    
    public static void check(){
        String s = sc.nextLine().toLowerCase();
        String a = "";
        for(int i = 0; i < s.length(); i++){
            a += so(s.charAt(i));
        }
        String tmp = new StringBuilder(a).reverse().toString();
        if(a.equals(tmp)) 
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}
