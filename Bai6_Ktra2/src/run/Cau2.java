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
public class Cau2 {
    public static void main(String[] args) {
        NganHang n = new NganHang();
        Scanner in = new Scanner(System.in);
        n.nhapGDVang(in);
        n.nhapGDTT(in);
        n.nhapGDTT(in);
        n.out();
    }
}
