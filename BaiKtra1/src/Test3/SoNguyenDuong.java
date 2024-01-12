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
public class SoNguyenDuong {
    private int n;

    public SoNguyenDuong() {
    }
    
    public SoNguyenDuong(int n) {
        this.n = n;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        n = sc.nextInt();
    }
    
    public void chia7(){
        System.out.print("Cac so chia het cho 7: ");
        for(int i = 1; i <= n; i++){
            if(i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public void giaiThua(){
        int tich = 1;
        for(int i = 1; i <= n; i++){
            tich *= i;
        }
        System.out.println("Giai thua n!: " + tich);
    }
}
