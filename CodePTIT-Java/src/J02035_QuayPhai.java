
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), ok = 0;
            long[] a = new long[n + 1];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            for(int i = 1; i < n; i++){
                if(a[i] < a[i - 1]){
                    ok = 1;
                    System.out.println(i);
                    break;
                }
            }
            if(ok == 0){
                System.out.println(0);
            }
        }
    }
}
