/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1va2va13;

/**
 *
 * @author tan
 */
import java.util.Scanner;
// bai 1 va bai 2 va bai 13
public class Main {
    public static void main(String[] args) {
        songuyenduongN n = new songuyenduongN();
        while(true){
            System.out.println("1. Nhap vao so nguyen n");
            System.out.println("2. Viet ra tong tu 1 den n");
            System.out.println("3. Viet ra tich tu 1 den n");
            System.out.println("4. Viet ra tong cac so chan tu 1 den n");
            System.out.println("5. Viet ra tong cac so le tu 1 den n");
            System.out.println("6. Viet ra tong cac so chia het cho 1 so (so nhap vao bat ky) nho hon n");
            System.out.println("7. Viet ra tong cac so chia het cho 2 so (so nhap vao bat ky) nho hon n");
            System.out.println("8. Viet ra cac so nguyen to nho hon n");
            System.out.println("9. Viet ra cac uoc so cua n");
            System.out.println("10. Viet ra cac uoc so nguyen to cua n");
            System.out.println("11. Viet ra so Fibonacci thu n");
            System.out.println("12. Viet ra day so Fibonacci nho hon n");
            System.out.println("13. Viet ra day so Fibonacci nho hon n la so nguyen to");
            System.out.println("14. Viet ra cac so nhi phan co do dai n");
            System.out.println("15. Viet ra cac hoan vi cua n");
            System.out.println("16. Viet ra cac so nguyen to co n chu so");
            System.out.println("17. Viet ra cac so thuan nghich co n chu so");
            System.out.println("18. Tong cac chu so cua n");
            System.out.println("19. Phan tich so nguyen n thanh cac thua so nguyen to");
            System.out.println("20. Kiem tra co phai la so thuan nghich hay khong");
            System.out.println("21. Kiem tra co la so dep khong neu la so thuan nghich va toan cac chu so chan");
            System.out.println("22. Kiem tra co la so dep khong neu la so thuan nghich, bat dau va ket thuc bang chu so 8, tong cac chu so chia het cho 10");
            System.out.println("23. Kiem tra co la so dep khong neu la so thuan nghich va chi toan cac chu so nguyen to");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 23):");        
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
                    int tich = n.tich1N(n.getN());
                    System.out.print("Tich cac so tu 1 den " + n.getN() + ": " + tich);
                    System.out.println();
                    break;
                case 4:
                    int tc = n.tongc1N(n.getN());
                    System.out.print("Tong cac so chan tu 1 den " + n.getN() + ": " + tc);
                    System.out.println();
                    break;
                case 5:
                    int tl = n.tongl1N(n.getN());
                    System.out.print("Tong cac so le tu 1 den " + n.getN() + ": " + tl);
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Nhap vao so a: ");
                    int a = sc.nextInt();
                    int c1 = n.tongc1s1N(n.getN(), a);
                    System.out.println("Tong cac so chia het cho " + a + " tu 1 den " + n.getN() + ": " + c1);
                    break;
                case 7: 
                    System.out.print("Nhap vao so a: ");
                    int b = sc.nextInt();
                    System.out.print("Nhap vao so b: ");
                    int c = sc.nextInt();
                    int c2 = n.tongc2s1N(n.getN(), b, c);
                    System.out.println("Tong cac so chia het cho " + b + " va " + c + " tu 1 den " + n.getN() + ": " + c2);
                    break;
                case 8:
                    System.out.print("So nguyen to tu 1 den " + n.getN() + ": ");
                    n.snt1N(n.getN());
                    System.out.println();
                    break;
                case 9:
                    System.out.print("Cac uoc cua so " + n.getN() + ": ");
                    n.uocN(n.getN());
                    System.out.println();
                    break;
                case 10:
                    System.out.print("Cac uoc cua so " + n.getN() + " la so nguyen to: ");
                    n.uocsntN(n.getN());
                    System.out.println();
                    break;
                case 11:
                    long fb = n.fibo(n.getN());
                    System.out.print("So Fibonnacci thu " + n.getN() + ": " + fb);
                    System.out.println();
                    break;
                case 12:
                    System.out.print("Cac so Fibonnacci nho hon " + n.getN() + ": ");
                    n.fiboN(n.getN());
                    System.out.println();
                    break;
                case 13:
                    System.out.print("Cac so Fibonnacci nho hon " + n.getN() + " la so nguyen to: ");
                    n.fibosntN(n.getN());
                    System.out.println();
                    break;
                case 14:
                    System.out.print("Cac xau nhi phan co do dai " + n.getN() + ": ");
                    n.sinhnpN(n.getN());
                    System.out.println();
                    break;
                case 15:
                    System.out.print("Cac hoan vi cua " + n.getN() + ": ");
                    n.hvN(n.getN());
                    System.out.println();
                    break;
                case 16:
                    System.out.print("Cac so nguyen to co " + n.getN() + " chu so: ");
                    n.sntNcs(n.getN());
                    System.out.println();
                    break;
                case 17:
                    System.out.print("Cac so thuan nghich to co " + n.getN() + " chu so: ");
                    n.stncNcs(n.getN());
                    System.out.println();
                    break;
                case 18:
                    System.out.print("Tong cac chu so cua " + n.getN() + " la: " + n.tongcs(n.getN()));
                    System.out.println();
                    break;
                case 19:
                    System.out.print("Phan tich so " + n.getN() + " thanh cac thua so nguyen to: ");
                    n.pttsnt(n.getN());
                    System.out.println();
                    break;
                case 20:
                    if(n.stn(n.getN())){
                        System.out.println("So " + n.getN() + " la so thuan nghich");
                    }else{
                        System.out.println("So " + n.getN() + " khong la so thuan nghich");
                    }
                    System.out.println();
                    break;
                case 21:
                    if(n.ktrasdc(n.getN())){
                        System.out.println("So " + n.getN() + " la so dep");
                    }else{
                        System.out.println("So " + n.getN() + " khong la so dep");
                    }
                    break;
                case 22:
                    if(n.ktrasd(n.getN())){
                        System.out.println("So " + n.getN() + " la so dep");
                    }else{
                        System.out.println("So " + n.getN() + " khong la so dep");
                    }
                    break;
                case 23:
                    if(n.ktrasdsnt(n.getN())){
                        System.out.println("So " + n.getN() + " la so dep");
                    }else{
                        System.out.println("So " + n.getN() + " khong la so dep");
                    }
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 23)");
                    break;
            }
        }
    }
}
