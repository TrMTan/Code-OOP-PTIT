/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04005_KhaiBaoLopThiSinh;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("%s %s %.1f" , a.getHt(), a.getDob(),a.tong());
    }
}
