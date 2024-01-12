/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.QuanLysach;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Cau2 {
    public static void main(String[] args) {
        QuanLysach q=new QuanLysach();
        Scanner in=new Scanner(System.in);
        q.nhapSachThamKhao(in);
        q.nhapSachGiaoKhoa(in);
        q.out();
    }
}

//public static void main(String[] args) {
//        SachThamKhao k=new SachThamKhao("toan lop 5","giao duc", true, 50);
//        k.setMa();
//        System.out.println(k);
//        SachGiaoKhoa g=new SachGiaoKhoa("tieng Viet", "dong nai", 4, 1, false, 80);
//        g.setMa();
//        System.out.println(g);
//    }

//toan lop 4
//su pham
//true
//70
//toan
//giao duc
//8
//2
//true
//48