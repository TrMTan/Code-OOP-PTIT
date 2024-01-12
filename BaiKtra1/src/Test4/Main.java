/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test4;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        DaySoThuc a = null;
        Matrix b = null;
        while(true){
            System.out.println("1. Nhap vao day so thuc");
            System.out.println("2. Tong day");
            System.out.println("3. Sap xep day");
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. Dua ra phan tu va so lan xuat hien");
            System.out.println("6. Lay ky tu dac biet(chu, cach, so, ky tu dac biet)");
            System.out.println("7. Chuan hoa theo tieng anh");
            System.out.println("8. Nhap vao 1 ma tran chu nhat");
            System.out.println("9. Tinh tong 2 ma tran chu nhat");
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
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                   
                    break;
                case 7: 
                    
                    break;
                case 8:
                    int h1, c1;
                    System.out.print("Nhap vao so hang: ");
                    h1 = sc.nextInt();
                    System.out.print("Nhap vao so cot: ");
                    c1 = sc.nextInt();
                    b = new Matrix(h1, c1);
                    System.out.println("Nhap ma tran B " + h1 +" hang " + c1 + " cot: ");
                    b.nhap();
                    break;
                case 9:
                    int h2, c2;
                    System.out.print("Nhap vao so hang: ");
                    h2 = sc.nextInt();
                    System.out.print("Nhap vao so cot: ");
                    c2 = sc.nextInt();
                    Matrix c = new Matrix(h2, c2);
                    System.out.println("Nhap ma tran C " + h2 +" hang " + c2 + " cot: ");
                    c.nhap();
                    Matrix d = new Matrix(h2, c2);
                    d.tinhTong(b, c);
                    System.out.println("Ma tran tong: ");
                    d.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 9)");
                    break;
            }
        }
    }
}
