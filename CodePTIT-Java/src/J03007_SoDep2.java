
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03007_SoDep2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean sum(String s){
        int tong = 0;
        for(int i = 0; i < s.length(); i++){
            tong += s.charAt(i) - '0';
        }
        return tong % 10 == 0;
    }
   
    public static void check(){
        StringBuilder s = new StringBuilder(sc.next());
        System.out.println(s.toString().matches("^8.*8$") && s.equals(s.reverse()) && sum(s.toString()) ? "YES" : "NO");
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}   
