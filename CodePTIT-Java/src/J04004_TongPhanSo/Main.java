/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04004_TongPhanSo;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo c = a.tong(a, b);
        System.out.println(c.getTu() + "/" + c.getMau());
    }
}
