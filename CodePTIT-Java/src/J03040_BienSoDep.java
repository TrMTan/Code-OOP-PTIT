
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03040_BienSoDep {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean kttang(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) <= s.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean ktbang(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(0)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean ktDauCuoi(String s){
        return ktbang(s.substring(0, 2)) && ktbang(s.substring(3));
    }
    
    public static boolean kt68(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                return false;
            }
        }
        return true;
    }
    
    public static void check(){
        String s = sc.nextLine().trim().substring(5);
        s = s.substring(0, 3) + s.substring(4);
        if(kttang(s) || ktbang(s) || ktDauCuoi(s) || kt68(s))
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
