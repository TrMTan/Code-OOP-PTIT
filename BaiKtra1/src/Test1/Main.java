/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        SND n = new SND();
        Xau s = new Xau();
        SquareMatrix a = null;
        while(true){
            System.out.println("1. Nhap vao so nguyen n");
            System.out.println("2. Viet ra tong tu 1 den n");
            System.out.println("3. Dua ra day so nguyen to nho hon va bang n");
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. Dua ra do dai xau");
            System.out.println("6. Dua ra so cau cua xau");
            System.out.println("7. Nhap vao mot ma tran vuong A");
            System.out.println("8. Dua ra tong cac hang cua ma tran");
            System.out.println("9. Tinh dinh thuc ma tran A");
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
                    System.out.print("Nhap vao so n: ");
                    n.nhap();
                    break;
                case 2:
                    int sum = n.tong1N(n.getN());
                    System.out.print("Tong cac so tu 1 den " + n.getN() + ": " + sum);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("So nguyen to tu 1 den " + n.getN() + ": ");
                    n.snt1N(n.getN());
                    System.out.println();
                    break;
                case 4:
                    s.nhap();
                    break;
                case 5:
                    int dd = s.dodaixau(s.getS());
                    System.out.println("Do dai xau: " + dd);
                    break;
                case 6:
                    int cau = s.socau(s.getS());
                    System.out.println("So cau cua xau: " + cau);
                    break;
                case 7: 
                    int N;
                    System.out.print("Nhap vao cap N: ");
                    N = sc.nextInt();
                    a = new SquareMatrix(N);
                    System.out.println("Nhap vao ma tran A: ");
                    a.nhap();
                    break;
                case 8:
                    a.inTongHang();
                    break;
                case 9:
                    int dt = a.dinhthuc();
                    System.out.println("Dinh thuc cua ma tran A: " + dt);
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 9)");
                    break;
            }
        }
    }
}
