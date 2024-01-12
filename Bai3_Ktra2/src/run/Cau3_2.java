/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.QLTV;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Cau3_2 {
    public static void main(String[] args) {
        QLTV n = new QLTV();
        Scanner sc = new Scanner(System.in);
        n.hienthiDS();
        System.out.println("===============");
        String ma = sc.nextLine();
        n.sua(ma);
    }
}
