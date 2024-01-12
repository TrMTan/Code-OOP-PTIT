
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03006_SoDep1 {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean sodep(String s){
        StringBuilder tmp = new StringBuilder(s);
        tmp.reverse();
        if(!tmp.toString().equals(s)) return false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) % 2 != 0){
                return false;
            }
        }
        return true;
    }
   
    public static void check(){
        String s = sc.nextLine();
        if(sodep(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}
