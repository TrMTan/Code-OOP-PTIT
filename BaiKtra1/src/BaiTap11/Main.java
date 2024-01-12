/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap11;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Matrix a = null;
        while(true){
            System.out.println("1. Nhap ma tran A");
            System.out.println("2. Tong tung hang");
            System.out.println("3. Hang hoac cot co tong lon nhat");
            System.out.println("4. Nhap ma tran B, B co la con cua ma tran A khong?");
            System.out.println("5. In ma tran chuyen vi");
            System.out.println("6. In ma tran");
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
                    int h1, c1;
                    System.out.print("Nhap vao so hang: ");
                    h1 = sc.nextInt();
                    System.out.print("Nhap vao so cot: ");
                    c1 = sc.nextInt();
                    a = new Matrix(h1, c1);
                    System.out.println("Nhap ma tran A " + h1 +" hang " + c1 + " cot: ");
                    a.nhap();
                    break;
                case 2:
                    a.inTongHang();
                    break;
                case 3:
                    a.maxTong();
                    break;
                case 4:
                    int h2, c2;
                    System.out.print("Nhap vao so hang: ");
                    h2 = sc.nextInt();
                    System.out.print("Nhap vao so cot: ");
                    c2 = sc.nextInt();
                    Matrix b = new Matrix(h2, c2);
                    System.out.println("Nhap ma tran B " + h2 +" hang " + c2 + " cot: ");
                    b.nhap();
                    boolean c = a.maTranCon(a.getA(), b.getA());
                    if(c) System.out.println("B la ma tran con cua A");
                    else System.out.println("B khong la ma tran con cua A");
                    break;
                case 5:
                    a.maTranChuyenVi();
                    break;
                case 6:
                    System.out.println("In ra ma tran A: ");
                    a.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 6)");
                    break;
            }
        }
    }
}
