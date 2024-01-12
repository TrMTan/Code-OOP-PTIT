
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
public class J03016_ChiaHetCho11 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        BigInteger s = sc.nextBigInteger();
        BigInteger a = new BigInteger("11");
        System.out.println(s.mod(a).intValue() == 0 ? 1 : 0);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
