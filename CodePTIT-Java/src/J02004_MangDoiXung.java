
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02004_MangDoiXung {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] != a[n - i - 1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
