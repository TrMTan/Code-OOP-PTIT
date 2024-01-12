
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01016_ChuSo4VaChuSo7 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
       int dem4 = 0, dem7 = 0;
       String s = sc.nextLine();
       for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == '7') dem7++;
           if(s.charAt(i) == '4') dem4++;
       }
       if(dem7 + dem4 == 7 || dem7 + dem4 == 4){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
    
    public static void kt(){
        String s = sc.nextLine();
        Set<Character> se = new HashSet<>(Arrays.asList('4', '7'));
        long len = s.chars().filter(c->se.contains((char) c)).count();
        if(len == 7 || len == 4){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
    
    public static void main(String[] args) {
//        check();
        kt();
    }
}
