/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081_DanhSachMatHang;

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
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String dvi = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());
            MatHang p = new MatHang(name, dvi, giaMua, giaBan);
            a.add(p);
        }
        Collections.sort(a);
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
