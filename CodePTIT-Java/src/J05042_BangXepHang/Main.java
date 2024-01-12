/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042_BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            a.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
