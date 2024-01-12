/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

import java.util.Scanner;

/**
 *
 * @author tan
 */

public class TinhLuongGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ht = sc.nextLine();
        long luongCb = sc.nextLong();
        sc.nextLine();
        String c = sc.nextLine();
        System.out.print(ma + " " + ht + " " + c + " ");
        if(c.charAt(0) == 'A'){
            long luong = luongCb * 250000 + luongCb * 125000;
            System.out.println(luong);
        }else if(c.charAt(0) == 'B'){
            long luong = luongCb * 250000 + luongCb * 50000;
            System.out.println(luong);
        }else{
            long luong = luongCb * 250000;
            System.out.println(luong);
        }
    }
}
