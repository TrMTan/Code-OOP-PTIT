/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap7;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        XuLyXau s = new XuLyXau();
        while(true){
            System.out.println("1. Nhap vao mot xau");
            System.out.println("2. Dua ra do dai xau");
            System.out.println("3. Dua ra so tu");
            System.out.println("4. Dua ra so cau");
            System.out.println("5. Tach cac tu trong xau");
            System.out.println("6. Tach cac so trong xau");
            System.out.println("7. Tach cac ky tu dac biet trong 1 xau");
            System.out.println("8. Tinh tong cac so trong xau");
            System.out.println("9. Dua ra cac tu trong xau va so lan xuat hien");
            System.out.println("10. Nhap them mot xau, dua ra cac tu xuat hien trong ca hai xau");
            System.out.println("11. In ra xau");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 11):");        
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    s.nhap();
                    break;
                case 2:
                    System.out.println("Do dai cua xau: " + s.dodaixau(s.getS()));
                    break;
                case 3:
                    System.out.println("So tu trong xau: " + s.sotu(s.getS()));
                    break;
                case 4:
                    System.out.println("So cau trong xau: " + s.socau(s.getS()));
                    break;
                case 5:
                    System.out.println("Cac tu trong xau: ");
                    s.tachTu(s.getS());
                    break;
                case 6:
                    System.out.println("Cac so trong xau: ");
                    s.tachSo(s.getS());
                    break;
                case 7: 
                    System.out.println("Cac ky tu dac biet trong xau: ");
                    s.ktdb(s.getS());
                    break;
                case 8:
                    s.tongSo(s.getS());
                    break;
                case 9:
                    s.tansuat(s.getS());
                    break;
                case 10:
                    System.out.print("Nhap vao mot xau khac: ");
                    String b = sc.nextLine();
                    s.hopxau(b, s.getS());
                    break;
                case 11:
                    s.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 11)");
                    break;
            }
        }
    }
}
