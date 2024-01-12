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
public class Cau2 {
    public static void main(String[] args) {
        QLTV n = new QLTV();
        Scanner sc = new Scanner(System.in);
        n.nhapBao(sc);
        n.nhapSach(sc);
        n.hienthiDS();
    }
}
