/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04015_TinhThuNhapGiaoVien;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.printf("%s %s %d %d %d", a.getId(), a.getHt(), a.getBacluong(), a.getPhucap(), a.getThunhap());
    }
}
