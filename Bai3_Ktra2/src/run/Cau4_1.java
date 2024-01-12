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
public class Cau4_1 {
    public static void main(String[] args) {
        QLTV n = new QLTV();
        Scanner sc = new Scanner(System.in);
        n.hienthiDS();
        System.out.println("---------------");
        String tenSach = sc.nextLine();
        n.timTheoTenSach(tenSach);
        System.out.println("--------------");
        String ngay = sc.nextLine();
        n.timBaoTheoNgayPH(ngay);
    }
}
