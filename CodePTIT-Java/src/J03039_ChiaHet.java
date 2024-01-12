
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03039_ChiaHet {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        if(a.mod(b).intValue() == 0 || b.mod(a).intValue() == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
