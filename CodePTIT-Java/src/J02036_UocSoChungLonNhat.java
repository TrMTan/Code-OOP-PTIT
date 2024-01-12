
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02036_UocSoChungLonNhat {
    public static long bcnn(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static long ucln(long a, long b){
        return a * b / bcnn(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n + 2];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            b[0] = a[0]; b[n] = a[n - 1];
            for(int i = 1; i < n; i++){
                b[i] = ucln(a[i], a[i - 1]);
            }
            for(int i = 0; i <= n; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
