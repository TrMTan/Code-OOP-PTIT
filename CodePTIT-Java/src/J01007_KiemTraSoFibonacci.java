
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01007_KiemTraSoFibonacci {
    public static Scanner sc = new Scanner(System.in);
    public static long fb[] = new long[100];
    
    public static void fibo(){
        fb[1] = fb[2] = 1l;
        for(int i = 3; i <= 92; i++){
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }
    
    public static boolean checkfibo(long n){
        for(long i : fb){
            if(i == n) return true;
        }
        return false;
    }
    
    public static void check(){
        long n = sc.nextLong();
        if(checkfibo(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        fibo();
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
