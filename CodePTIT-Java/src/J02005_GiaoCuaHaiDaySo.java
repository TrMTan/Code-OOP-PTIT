
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02005_GiaoCuaHaiDaySo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[1000];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            c[a[i]] = 1; // so da xuat hien
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(int i = 0; i < m; i++){
            if(c[b[i]] == 1){
                System.out.print(b[i] + " ");
                c[b[i]] = 2; // da xuat hien so thu 2
            }
        }
    }
    
    public static void main(String[] args) {
        check();
    }
}
