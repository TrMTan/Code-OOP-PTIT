
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03008_SoDep3 {
    public static Scanner sc = new Scanner(System.in);
   
    public static boolean sodep(String s){
        StringBuilder tmp = new StringBuilder(s);
        tmp.reverse();
        if(!tmp.toString().equals(s)) return false;
        return true;
    }
    
    public static void check(){
        String s = sc.next();
        System.out.println(s.matches("[^014689]+") && sodep(s) ? "YES" : "NO");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
