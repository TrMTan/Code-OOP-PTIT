
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
public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        System.out.println(a.gcd(b));
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}
