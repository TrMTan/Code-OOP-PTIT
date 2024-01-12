
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01011_BoiSoChungUocSoChung {
    public static Scanner sc = new Scanner(System.in);
    
    public static long ucln(long a ,long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static long bcnn(long a, long b){
        return a * b / ucln(a, b);
    }
    
    public static void check(){
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.println(bcnn(a, b) + " " + ucln(a, b));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
