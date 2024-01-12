/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoDichVuDien;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma, ht, sdt;
        int thang, soKW;  
        DVDien a = new DVDien();
        while(true){
            try {
                ma = sc.nextLine();
                if(a.isMa(ma)){
                    a.setMa(ma);
                    break;
                }else{
                    System.out.println("nhap sai");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        ht = sc.nextLine();
        a.setTen(ht);
        thang = Integer.parseInt(sc.nextLine());
        a.setThang(thang);
        while(true){
            try {
                sdt = sc.nextLine();
                if(a.isDienThoai(sdt)){
                    a.setSoDienThoai(sdt);
                    break;
                }else{
                    System.out.println("nhap sai");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        soKW = sc.nextInt();
        a.setSoKW(soKW);
        System.out.println(a);
    }
}
