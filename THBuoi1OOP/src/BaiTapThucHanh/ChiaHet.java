/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();
            if(a.mod(c).intValue() == 0 && b.mod(c).intValue() == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
