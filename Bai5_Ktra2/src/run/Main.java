/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.Scanner;
import model.HinhCau;
import model.HinhVuong;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhVuong a = new HinhVuong(sc.nextDouble());
        System.out.println(a.chuVi());
        System.out.println(a.dienTich());
        HinhCau b = new HinhCau(sc.nextDouble());
        System.out.println(b.tinhDienTichXungQuanh());
        System.out.println(b.tinhSoCanh());
    }
}
