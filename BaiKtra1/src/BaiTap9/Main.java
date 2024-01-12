/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap9;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        BieuThuc p = null;
        BieuThuc q = null;
        while(true){
            System.out.println("1. Nhap he so cho da thuc");
            System.out.println("2. Tinh P^n(x0) va Q^m(x0)");
            System.out.println("3. Dao ham bac 1");
            System.out.println("4. Tinh P^n(x)+Q^m(x)");
            System.out.println("5. Tinh P^n(x)-Q^m(x)");
            System.out.println("6. Tinh P^n(x)/Q^m(x) va da thu chia du");
            System.out.println("7. In ra P^n(x) va Q^m(x)");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 7):");        
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
                    int n, m;
                    System.out.print("Nhap bac cua da thuc P(x): ");
                    n = sc.nextInt();
                    p = new BieuThuc(n);
                    p.setBac(n);
                    p.nhap();
                    
                    System.out.print("Nhap bac cua da thuc Q(x): ");
                    m = sc.nextInt();
                    q = new BieuThuc(m);
                    q.setBac(m);
                    q.nhap();
                    break;
                case 2:
                    int x0;
                    System.out.print("Nhap vao x0: ");
                    x0 = sc.nextInt();
                    int kq1 = p.tinhgtx0(x0);
                    System.out.println("P^n(x0) = " + kq1);
                    int kq2 = q.tinhgtx0(x0);
                    System.out.println("Q^m(x0) = " + kq2);
                    break;
                case 3:
                    System.out.print("Dao ham bac 1 cua bieu thuc P(x): ");
                    BieuThuc a = p.dhb1();
                    a.xuat();
                    System.out.print("Dao ham bac 1 cua bieu thuc Q(x): ");
                    BieuThuc b = q.dhb1();
                    b.xuat();
                    break;
                case 4:
                    System.out.print("Tong cua hai da thuc P(x) va Q(x): ");
                    BieuThuc c = p.tong(q);
                    c.xuat();
                    break;
                case 5:
                    System.out.print("hieu cua hai da thuc P(x) va Q(x): ");
                    BieuThuc d = p.hieu(q);
                    d.xuat();
                    break;
                case 6:
                    BieuThuc[] kq = p.chia(q);
                    BieuThuc thuong = kq[0];
                    BieuThuc du = kq[1];
                    
                    System.out.print("Phan nguyen cua P(x) / Q(x): ");
                    if (thuong.getN() == 0 && thuong.getA()[0] == 0) {
                        System.out.print("0");
                    } else {
                        thuong.xuat();
                    }
                    System.out.print("Phan du cua P(x) / Q(x): ");
                    if (du.getN() == 0 && du.getA()[0] == 0) {
                        System.out.print("0");
                    } else {
                        du.xuat();
                    }
                    break;
                case 7: 
                    System.out.print("In ra bieu thuc P(x): ");
                    p.xuat();
                    System.out.print("In ra bieu thuc Q(x): ");
                    q.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 7)");
                    break;
            }
        }
    }
}
