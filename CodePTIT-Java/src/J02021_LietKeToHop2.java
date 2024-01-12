
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02021_LietKeToHop2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static int[] a = new int[10];
    public static int n, k, dem = 0;
    
    public static void print(){
        dem++;
        for(int i = 1; i <= k; i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    
    public static void sinh(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k) print();
            else sinh(i + 1);
        }
    }
    
    public static void check(){
        n = sc.nextInt();
        k = sc.nextInt();
        sinh(1);
        System.out.println();
        System.out.println("Tong cong co " + dem + " to hop");
    }
    
    public static void main(String[] args) {
        check();
    }
}
