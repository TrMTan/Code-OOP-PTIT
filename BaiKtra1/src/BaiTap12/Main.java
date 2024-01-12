/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap12;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        SquareMatrix a = null;
        SquareMatrix b = null;
        while(true){
            System.out.println("1. Nhap vao hai ma tran vuong");
            System.out.println("2. Tong hai ma tran vuong");
            System.out.println("3. Hieu hai ma tran vuong");
            System.out.println("4. Tich hai ma tran vuong");
            System.out.println("5. In ra hai ma tran vuong");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 5):");        
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
                    System.out.print("Nhap vao cap ma tran n: ");
                    n = sc.nextInt();
                    a = new SquareMatrix(n);
                    b = new SquareMatrix(n);
                    a.nhap();
                    b.nhap();
                    break;
                case 2:
                    System.out.println("Tong hai ma tran: ");
                    SquareMatrix c = a.tong(a, b);
                    c.xuat();
                    break;
                case 3:
                    System.out.println("Hieu hai ma tran: ");
                    SquareMatrix d = a.hieu(a, b);
                    d.xuat();
                    break;
                case 4:
                    System.out.println("Tich hai ma tran: ");
                    SquareMatrix e = a.tich(a, b);
                    e.xuat();    
                    break;
                case 5:
                    System.out.println("In ra ma tran a: ");
                    a.xuat();
                    System.out.println("In ra ma tran b: ");
                    b.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 5)");
                    break;
            }
        }
    }
}
