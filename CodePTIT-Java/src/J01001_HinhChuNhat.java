/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
import java.util.Scanner;

public class J01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cr = sc.nextInt(), cd = sc.nextInt();
        if(cr <= 0 || cd <= 0) {
            System.out.println(0);
        }else{
            System.out.println((cr + cd) * 2 + " " + (cr * cd));
        }
    }
}
