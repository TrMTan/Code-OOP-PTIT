/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap14;

import BaiTap15.PhanSo;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        ChuanHoaXau s = new ChuanHoaXau();
        while(true){
            System.out.println("1. Nhap vao mot xau");
            System.out.println("2. Chuan hoa dang 1");
            System.out.println("3. Chuan hoa dang 2");
            System.out.println("4. Chuan hoa dang 3");
            System.out.println("5. Chuan hoa dang 4");
            System.out.println("6. In xau");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 6):");        
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap vao xau s: ");
                    s.nhap();
                    break;
                case 2:
                    String t = s.fullName(s.getS());
                    System.out.println("Chuan hoa ten: " + t);
                    break;
                case 3:
                    String a = s.lastName(s.getS());
                    System.out.println("Chuan hoa ten: " + a);
                    break;
                case 4:
                    String b = s.email(s.getS());
                    System.out.println("Chuan hoa email: " + b);
                    break;
                case 5:
                    String c = s.doanvan(s.getS());
                    System.out.println("Doan van: " + c);
                    break;
                case 6:
                    System.out.print("In ra xau s: ");
                    s.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 6)");
                    break;
            }
        }
    }
}
