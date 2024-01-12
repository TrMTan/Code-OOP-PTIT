/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05024_LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            for(SinhVien i : a){
                i.setnganh();
            }
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            for(SinhVien i : a){
                if(i.getNganh().equals(s)){
                    System.out.println(i);
                }
            }
        }
    }
}
