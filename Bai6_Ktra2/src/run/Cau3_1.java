/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.NganHang;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Cau3_1 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        //n.out();
        Scanner in=new Scanner(System.in);
        String ma=in.nextLine();
        n.xoa(ma);
        n.out();
    }

}

// xoa