/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05053_SapXepDonHang;

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
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> a = new ArrayList<>();
        while(t-->0){
            a.add(new DonHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(a);
        for(DonHang i : a){
            System.out.println(i);
        }
    }
}

// 3
// Kaki 2
// K0252
// 80000
// 15
// Jean 1
// J2011
// 200000
// 24
// Jean 2
// J0982
// 150000
// 12
