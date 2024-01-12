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
public class Cau4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTV n = new QLTV();
        n.hienthiDS();
        System.out.println("----------");
        n.sapxepSoBanPH();
        n.hienthiDS();
    }
}
