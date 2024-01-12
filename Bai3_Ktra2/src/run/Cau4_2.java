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
public class Cau4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTV n = new QLTV();
        int tu = sc.nextInt();
        int den = sc.nextInt();
        n.timBaoTuNamDenNam(tu, den);
    }
}
