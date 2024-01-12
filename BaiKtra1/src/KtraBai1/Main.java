/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KtraBai1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        DaySoNguyen a = null;
        Xau s = null;
        DaThuc p = null;
        while(true){
            System.out.println("1. Nhap vao xau co dang");
            System.out.println("2. Chuan lai ho ten");
            System.out.println("3. Nếu là true thì viết Mr, false thì Miss rồi họ tên chuẩn hóa, tuổi (năm hiện thời – năm sinh)");
            System.out.println("4. Nhap vao 1 day so nguyen");
            System.out.println("5. Dua ra do lon nhat, be nhat");
            System.out.println("6. Dua ra xem day so la gi");
            System.out.println("7. Dua ra so lan xuat hien cua moi phan tu");
            System.out.println("8. Nhap vao mot da thuc");
            System.out.println("9. Tinh gia tri dao ham bac 1 cua da thuc tai xo = 2");
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
                    System.out.print("Nhap vao xau: ");
                    s = new Xau();
                    s.nhap();
                    break;
                case 2:
                    s.chuanHoa();
                    break;
                case 3:
                    break;
                case 4:
                    int n;
                    System.out.print("Nhap vao n: ");
                    n = sc.nextInt();
                    a = new DaySoNguyen(n);
                    a.nhap();
                    break;
                case 5:
                    a.gtlnnn();
                    break;
                case 6:
                    a.ktrasxt();
                    a.ktrasxg();
                    break;
                case 7: 
                    a.tanSuat();
                    break;
                case 8:
                    int m;
                    System.out.print("Nhap bac cua da thuc P(x): ");
                    m = sc.nextInt();
                    p = new DaThuc(m);
                    p.setBac(m);
                    p.nhap();
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
