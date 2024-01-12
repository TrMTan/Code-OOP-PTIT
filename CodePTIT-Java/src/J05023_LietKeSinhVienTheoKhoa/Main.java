/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023_LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String year = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for(SinhVien i : a){
                if(i.getLop().substring(1, 3).equals(year.substring(2))){
                    System.out.println(i);
                }
            }
        }
    }
}
