/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test3;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        SoNguyenDuong n = new SoNguyenDuong();
        Xau s = new Xau();
        SquareMatrix a = null;
        while(true){
            System.out.println("1. Nhap vao so nguyen duong n");
            System.out.println("2. Viet ra cac so chia het cho 7 tu 1 den n");
            System.out.println("3. Tinh n!");
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. Email(ten)");
            System.out.println("6. Tach cac tu trong doan(co ca so va dau cach)");
            System.out.println("7. Nhap vao 1 ma tran vuong");
            System.out.println("8. Tinh tong hang hoac cot hoac cheo chinh co tong max");
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
                    n.nhap();
                    break;
                case 2:
                    n.chia7();
                    break;
                case 3:
                    n.giaiThua();
                    break;
                case 4:
                    s.nhap();
                    break;
                case 5:
                    String t = s.email(s.getS());
                    System.out.println("Dia Chi Email: " + t);
                    break;
                case 6:
                    s.tachTu();
                    break;
                case 7: 
                    System.out.print("Nhap vao n: ");
                    int c = sc.nextInt();
                    a = new SquareMatrix(c);
                    System.out.println("Nhap vao ma tran: ");
                    a.nhap();
                    break;
                case 8:
                    a.maxTong();
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
