/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        DaySoThuc a = null;
        Xau s = new Xau();
        SquareMatrix b = null;
        SquareMatrix c = null;
        while(true){
            System.out.println("1. Nhap vao day so thuc");
            System.out.println("2. Viet ra tong day so thuc");
            System.out.println("3. Sap xep day so thuc(tang dan va giam dan)");
            System.out.println("4. Nhap vao 1 doan");
            System.out.println("5. Dua ra do dai xau");
            System.out.println("6. Tach cac tu trong doan(co ca so va dau cach)");
            System.out.println("7. Nhap vao hai ma tran vuong");
            System.out.println("8. Tinh tong hai ma tran vuong");
            System.out.println("9. ");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 9): ");        
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap vao so n: ");
                    int n = sc.nextInt();
                    a = new DaySoThuc(n);
                    a.nhap();
                    break;
                case 2:
                    a.tong();
                    break;
                case 3:
                    a.sapXep();
                    break;
                case 4:
                    s.nhap();
                    break;
                case 5:
                    s.doDaiXau();
                    break;
                case 6:
                    s.tachTu();
                    break;
                case 7: 
                    System.out.print("Nhap vao cap ma tran n: ");
                    n = sc.nextInt();
                    b = new SquareMatrix(n);
                    c = new SquareMatrix(n);
                    b.nhap();
                    c.nhap();
                    break;
                case 8:
                    System.out.println("Tong hai ma tran: ");
                    SquareMatrix d = b.tong(b, c);
                    d.xuat();
                    break;
                case 9:
                    
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 9)");
                    break;
            }
        }
    }
}
