
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
public class J03033_BoiSoChungNhoNhat {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger ucln = a.gcd(b);
            BigInteger mul = a.multiply(b);
            BigInteger c = mul.divide(ucln);
            System.out.println(c);
        }
    }
}
