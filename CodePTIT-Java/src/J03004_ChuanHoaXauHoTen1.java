
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03004_ChuanHoaXauHoTen1 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String chuanhoa(String s){
        if(s.length() == 1){
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void check(){
        String word = sc.nextLine().trim();
        String[] s = word.split("\\s+"); // mang chua cac tu
        for(int i = 0; i < s.length; i++){
            s[i] = chuanhoa(s[i]);
        }
        System.out.println(String.join(" ", s));
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}
