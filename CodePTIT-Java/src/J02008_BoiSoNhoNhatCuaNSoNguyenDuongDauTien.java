
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02008_BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static Scanner sc = new Scanner(System.in);
    
    public static long ucln(long a, long b){
        while(b > 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static long bcnn(long a, long b){
        return a * b / ucln(a, b);
    }
    
    public static void check(){
        int n = sc.nextInt();
        long res = 1;
        for(int i = 2; i <= n; i++){
            res = bcnn(res, i);
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
