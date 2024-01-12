/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05005_DanhSachDoiTuongSinhVien3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>(t);
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            String Name = sc.nextLine();
            String Room = sc.nextLine();
            String Date = sc.nextLine();
            float Gpa = sc.nextFloat();
            SinhVien p = new SinhVien(Name, Room, Date, Gpa);
            a.add(p);
        }
        Collections.sort(a);
        for (SinhVien i : a) {
            System.out.println(i);
        }
    }
}
