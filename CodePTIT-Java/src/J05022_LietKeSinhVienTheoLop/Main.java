/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05022_LietKeSinhVienTheoLop;

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
            String name = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + name + ":");
            for(SinhVien i : a){
                if(name.equals(i.getLop())){
                    System.out.println(i);
                }
            }
        }
    }
}
