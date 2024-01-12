/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author tan
 */
//bai 3
public class Main {
    public static void main(String[] args) {
        HaiSoNguyen c = new HaiSoNguyen();
        while(true){
            System.out.println("1. Nhap vao hai so nguyen m va n");
            System.out.println("2. UCLN va BCNN");
            System.out.println("3. Cac so nguyen to tu m den n");
            System.out.println("4. Cac so thuan nghich tu m den n");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0 - 4):");        
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch(chon){
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    c.nhap();
                    break;
                case 2:
                    int ucln = c.UCLN(c.getM(), c.getN());
                    System.out.print("UCLN cua " + c.getM() + " va " + c.getN() + " la: " + ucln);
                    System.out.println();
                    int bcnn = c.BCNN(c.getM(), c.getN());
                    System.out.print("BCNN cua " + c.getM() + " va "  + c.getN() + " la: " + bcnn);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Cac so nguyen to tu " + c.getM() + " den " + c.getN() + " la: ");
                    c.sntmn(c.getM(), c.getN());
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Cac so thuan nghich tu " + c.getM() + " den " + c.getN() + " la: ");
                    c.stnmn(c.getM(), c.getN());
                    System.out.println();
                    break;
                default:
                    System.out.println("Ban chi chon (0 - 4)");
                    break;
            }
        }
    }
}
