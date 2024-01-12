/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap8;

import BaiTap5.DaySoNguyen;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        DaySoThuc a = null;
        while(true){
            System.out.println("1. Nhap vao mot day so thuc");
            System.out.println("2. Liet ke cac phan tu xuat hien mot lan");
            System.out.println("3. Dua ra so lan xuay hien cua cac phan tu");
            System.out.println("4. Kiem tra day so da sap xep");
            System.out.println("5. Sap xep day so tang dan va giam dan");
            System.out.println("6. Lon nhat, nho nhat, tong, trung binh");
            System.out.println("7. In ra day so nguyen");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 7):");        
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    int n;
                    System.out.print("Nhap vao n: ");
                    n = sc.nextInt();
                    a = new DaySoThuc(n);
                    a.nhap();
                    break;
                case 2:
                    a.xh1lan();
                    break;
                case 3:
                    a.solanxh();
                    break;
                case 4:
                    a.ktrasxt();
                    a.ktrasxg();
                    break;
                case 5:
                    a.sx();
                    break;
                case 6:
                    a.lonnho();
                    break;
                case 7:
                    System.out.print("Day so thuc a: ");
                    a.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 7)");
                    break;
            }
        }
    }
}
