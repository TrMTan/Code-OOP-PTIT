
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02006_HopCuaHaiDaySo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> se = new TreeSet<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            se.add(b[i]);
        }
        Object[] c = se.toArray();
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        check();
    }
}
