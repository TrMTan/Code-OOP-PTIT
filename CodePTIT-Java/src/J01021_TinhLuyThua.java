
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01021_TinhLuyThua {
    public static Scanner sc = new Scanner(System.in);
    public static int MOD = (int) (1e9 + 7);
    
    public static long pown(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a % MOD;
        long x = pown(a, b / 2);
        long y = (x * x) % MOD;
        if(b % 2 == 0){
            return y;
        }else{
            return (a * y) % MOD;
        }
    }
    
    public static void main(String[] args) {
        while(true){
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b == 0){
                return;
            }
            System.out.println(pown(a, b));
        }
    }
}
