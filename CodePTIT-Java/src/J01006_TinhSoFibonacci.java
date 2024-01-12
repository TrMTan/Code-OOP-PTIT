
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01006_TinhSoFibonacci {
    public static Scanner sc = new Scanner(System.in);
    public static long fb[] = new long[100];
    
    public static void fibo(){
        fb[1] = fb[2] = 1l;
        for(int i = 3; i <= 92; i++){
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }
    
    public static void check(){
        int n = sc.nextInt();
        System.out.println(fb[n]);
    }
    
    public static void main(String[] args) {
        fibo();
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
