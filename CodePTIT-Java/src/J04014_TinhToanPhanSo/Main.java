/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04014_TinhToanPhanSo;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo e = a.tong(a, b);
            PhanSo c = a.nhan(e, e);
            PhanSo d = a.nhan(a, a.nhan(b, c));
            System.out.println(c + " " + d);
        }
    }
}
