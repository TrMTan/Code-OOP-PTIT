/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap10;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
       SquareMatrix a = null;
        while(true){
            System.out.println("1. Nhap ma tran vuong A cap n");
            System.out.println("2. Hang, cot, hoac duong cheo co tong lon nhat");
            System.out.println("3. Ma tran chuyen vi cua A");
            System.out.println("4. Hang, cot, hoac duong cheo co tong nho nhat");
            System.out.println("5. Kiem tra ma tran A co la ma tran doi xung hay khong?");
            System.out.println("6. Tim dinh thuc ma tran A");
            System.out.println("7. Ma tran nghich dao cua A");
            System.out.println("8. Nhap ma tran B (nx1), giai he phuong trinh tuyen tinh thuan nhat n an AX = B bang phuong phap Gauss");
            System.out.println("9. In ma tran A");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 9):");        
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
                    System.out.print("Nhap vao cap n: ");
                    n = sc.nextInt();
                    a = new SquareMatrix(n);
                    System.out.println("Nhap vao ma tran A: ");
                    a.nhap();
                    break;
                case 2:
                    a.maxTong();
                    break;
                case 3:
                    System.out.println("Ma tran chuyen vi: ");
                    a.mtcv();
                    break;
                case 4:
                    a.minTong();
                    break;
                case 5:
                    a.mtdx();
                    break;
                case 6:
                    int dt = a.dinhthuc();
                    System.out.println("Dinh thuc cua ma tran A: " + dt);
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    System.out.println("In ma tran A");
                    a.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 9)");
                    break;
            }
        }
    }
}
