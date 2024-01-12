/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006_KhaiBaoLopSinhVien;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien();
        String ht = sc.nextLine();
        a.setHt(ht);
        String lop = sc.nextLine();
        a.setLop(lop);
        String ns = sc.nextLine();
        a.setDob(ns);
        Double gpa = sc.nextDouble();
        a.setGpa(gpa);
        System.out.printf("%s %s %s %s %.2f", a.getMsv(), a.getHt(), a.getLop(), a.ngaysinh(a), a.getGpa());
    }
}
