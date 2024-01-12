/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.QLTV;
import java.util.Scanner;
import model.Bao;
import model.Sach;

/**
 *
 * @author DELL
 */
public class Cau3_1 {
    public static void main(String[] args) {
        QLTV n = new QLTV();
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        n.xoa(ma);
        n.hienthiDS();
    }
}
