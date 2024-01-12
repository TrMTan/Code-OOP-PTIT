/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class SquareMatrix {
    private int[][] a;

    public SquareMatrix(int n) {
        a = new int[n][n];
    }

    public SquareMatrix(int[][] a) {
        this.a = a;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public int[] tongHang(){
        int t[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            t[i] = 0;
            for(int j = 0; j < a.length; j++){
                t[i] += a[i][j];
            }
        }
        return t;
    }
    
    public int[] tongCot(){
        int t[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            t[i] = 0;
            for(int j = 0; j < a.length; j++){
                t[i] += a[j][i];
            }
        }
        return t;
    }
    
    public int tCheoChinh(){
        int t = 0;
        for(int i = 0; i < a.length; i++){
            t += a[i][i];
        }
        return t;
    }
    
    public int tCheoPhu(){
        int t = 0;
        for(int i = 0; i < a.length; i++){
            t += a[i][a.length - i - 1];
        }
        return t;
    }
    
    public void maxTong(){
        int[] a = tongHang();
        int[] b = tongCot();
        int cc = tCheoChinh();
        int cp = tCheoPhu();
        
        int maxTong = Math.max(Math.max(Math.max(Arrays.stream(a).max().getAsInt(), Arrays.stream(b).max().getAsInt()), cc), cp);

        System.out.println("Các hàng, cột và đường chéo có tổng lớn nhất:");
        System.out.print("Hàng: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxTong) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.print("\nCột: ");
        for (int i = 0; i < a.length; i++) {
            if (b[i] == maxTong) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.print("\nĐường chéo chính: ");
        if (cc == maxTong) {
            System.out.print("Có ");
        }else{
            System.out.print("Khong");
        }
        System.out.print("\nĐường chéo phụ: ");
        if (cp == maxTong) {
            System.out.print("Có ");
        }else{
            System.out.print("Khong");
        }
        System.out.println();
    }
}
