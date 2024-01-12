
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01010_CatDoi {
    public static Scanner sc = new Scanner(System.in);
    
    public static long solve(String s){
        long n = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c) {
                case '0':
                case '8':
                case '9':
                    n = n * 10;
                    break;
                case '1':
                    n = n * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }
        return n;
    }
    
    public static void check(){
        String s = sc.next();
        long res = solve(s);
        if(res == 0){
            System.out.println("INVALID");
        }else{
            System.out.println(res);
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
