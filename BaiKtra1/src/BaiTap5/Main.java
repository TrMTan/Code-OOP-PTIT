/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap5;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        DaySoNguyen a = null;
        while(true){
            System.out.println("1. Nhap vao mot day so nguyen");
            System.out.println("2. Tong day so nguyen");
            System.out.println("3. Trung binh cua day so nguyen");
            System.out.println("4. Gia tri lon nhat, nho nhat cua day so nguyen");
            System.out.println("5. Vi tri so lon nhat, so nho nhat, so lon thu hai, so nho thu hai");
            System.out.println("6. Liet ke cac so nguyen to");
            System.out.println("7. Dua ra cac so chia het cho mot so");
            System.out.println("8. Sap xep day so tang dan, giam dan");
            System.out.println("9. Kiem tra day so da duoc sap xep hay chua");
            System.out.println("10. Kiem tra day so co phai mang doi xung hay khong");
            System.out.println("11. Dua ra so lan xuat hien cua moi phan tu");
            System.out.println("12. Diem can bang dau tien cua day so");
            System.out.println("13. In ra day so nguyen");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 13):");        
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
                    a = new DaySoNguyen(n);
                    a.nhap();
                    break;
                case 2:
                    int tong = a.tong(a.getA());
                    System.out.println("Tong cua day so nguyen: " + tong);
                    break;
                case 3:
                    int tb = a.tb(a.getA());
                    System.out.println("Trung binh cua day so nguyen: " + tb);
                    break;
                case 4:
                    a.gtlnnn();
                    break;
                case 5:
                    a.findMax();
                    a.findSecondMax();
                    a.findMin();
                    a.findSecondMin();
                    break;
                case 6:
                    System.out.print("Cac so nguyen to la: ");
                    a.insnt();
                    break;
                case 7:
                    a.intsochiahet();
                    break;
                case 8:
                    a.sx();
                    break;
                case 9:
                    a.ktrasxt();
                    a.ktrasxg();
                    break;
                case 10:
                    a.dx();
                    break;
                case 11:
                    a.solanxh();
                    break;
                case 12:
                    a.diemcb();
                    break;
                case 13:
                    System.out.print("Day so nguyen a: ");
                    a.xuat();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 13)");
                    break;
            }
        }
    }
}
