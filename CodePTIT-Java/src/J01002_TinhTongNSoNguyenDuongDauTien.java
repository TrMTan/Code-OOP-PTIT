
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01002_TinhTongNSoNguyenDuongDauTien {
    public static Scanner sc = new Scanner(System.in);

    public static void check(){
        long n = sc.nextLong();
        System.out.println(n * (n + 1) / 2);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
