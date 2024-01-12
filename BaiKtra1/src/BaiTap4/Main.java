/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        BaSoThuc c = new BaSoThuc();
        while(true){
            System.out.println("1. Nhap vao ba so thuc a, b, c");
            System.out.println("2. Nghiem cua pnuong trinh ax^2 + bx + c: ");
            System.out.println("3. Dien tich tam giac");
            System.out.println("4. Chu vi, dien tich hinh hop(Kich thuoc a, b, c)");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 4):");        
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    c.nhap();
                    break;
                case 2:
                    System.out.println("Giai pnuong trinh " + c.getA() +"x^2 +" + c.getB() + "x +" + c.getC() + " = 0");
                    c.ptb2(c.getA(), c.getB(), c.getC());
                    System.out.println();
                    break;
                case 3:
                    float s = c.dttg(c.getA(), c.getB(), c.getC());
                    System.out.print("Dien tich tam giac: " + s);
                    System.out.println();
                    break;
                case 4:
                    float dt = c.dt(c.getA(), c.getB(), c.getC());
                    float cv = c.cv(c.getA(), c.getB(), c.getC());
                    System.out.println("Dien tich hinh hop: " + dt);
                    System.out.println("Chu vi hinh hop: " + cv);
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 4)");
                    break;
            }
        }
    }
}
