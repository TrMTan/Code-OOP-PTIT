
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
public class J03015_HieuSoNguyenLon2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        System.out.println(a.subtract(b));
    }
    
    public static void main(String[] args) {
        check();
    }
}
