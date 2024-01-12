
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01014_UocSoNguyenToLonNhat {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean snt(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static void check(){
        long n = sc.nextLong();
        long kq = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(snt(n / i)){
                    System.out.println(n / i);
                    return;
                }
                if(snt(i)){
                    kq = i;
                }
            }
        }
        System.out.println(kq);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
