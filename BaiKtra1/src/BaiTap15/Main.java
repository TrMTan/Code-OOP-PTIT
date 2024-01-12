/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap15;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        while(true){
            System.out.println("1. Nhap vao hai phan so");
            System.out.println("2. Tong hai phan so");
            System.out.println("3. Hieu hai phan so");
            System.out.println("4. Tich hai phan so");
            System.out.println("5. Thuong hai phan so");
            System.out.println("6. In ra phan so");
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
                    System.out.print("Nhap vao tu so va mau so cua phan so a: ");
                    a.nhap();
                    System.out.print("Nhap vao tu so va mau so cua phan so b: ");
                    b.nhap();
                    break;
                case 2:
                    PhanSo c = a.tong(a, b);
                    System.out.print("Tong cua hai phan so a va b la: ");
                    c.xuat();
                    break;
                case 3:
                    PhanSo d = a.hieu(a, b);
                    System.out.print("Hieu cua hai phan so a va b la: ");
                    d.xuat();
                    break;
                case 4:
                    PhanSo e = a.tich(a, b);
                    System.out.print("Tich cua hai phan so a va b la: ");
                    e.xuat();
                    break;
                case 5:
                    PhanSo f = a.thuong(a, b);
                    System.out.print("Thuong cua hai phan so a va b la: ");
                    f.xuat();
                    break;
                case 6:
                    a.xuat();
                    b.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 6)");
                    break;
            }
        }
    }
}
