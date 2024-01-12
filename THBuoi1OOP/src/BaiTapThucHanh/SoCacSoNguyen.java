/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class SoCacSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d3 = 0, d5 = 0;
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '3'){
                d3++;
            }
            if(s.charAt(i) == '5'){
                d5++;
            }
        }
        if(d3 + d5 == 3 || d3 + d5 == 5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
