
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02022_SoXaCach {
    public static Scanner sc = new Scanner(System.in);
    
    public static int n;
    public static int[] a;
    public static boolean[] dd;
    
    public static void print(){
        for(int i = 1; i < n; i++){
            if(Math.abs(a[i] - a[i + 1]) == 1){
                return;
            }
        }
        
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    public static void sinh(int i){
        for(int j = 1; j <= n; j++){
            if(dd[j] == false){
                dd[j] = true;
                a[i] = j;
                if(i == n){ print();}
                else { sinh(i + 1); }
                dd[j] = false;
            }
        }
    }
    
    public static void check(){
        n = sc.nextInt();
        a = new int[n + 1];
        dd = new boolean[n + 1];
        sinh(1);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
