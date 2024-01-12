/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

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
    
    public void inTongHang(){
        for(int i = 0; i < a.length; i++){
            System.out.println("Tong cua hang thu " + (i + 1) + " la: " + tongHang()[i]);
        }
    }
    
    public int dinhthuc() {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[i][j];
            }
        }

        int det = 1;
        int count = 0;

        // Chuyển ma trận b thành ma trận tam giác
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i][i] == 0) {
                // Nếu b[i][i] bằng 0, tìm b[i][j] != 0 để hoán đổi dòng i
                boolean found = false;
                for (int j = i + 1; j < b.length; j++) {
                    if (b[j][i] != 0) {
                        // Hoán đổi dòng i và dòng j
                        for (int k = i; k < b.length; k++) {
                            int temp = b[i][k];
                            b[i][k] = b[j][k];
                            b[j][k] = temp;
                        }
                        found = true;
                        count++; // Đếm số lần hoán đổi dòng
                        break;
                    }
                }
                if (!found) return 0; // Không tìm thấy dòng không chứa 0, ma trận không khả nghịch
            }
            for (int j = i + 1; j < b.length; j++) {
                int factor = b[j][i] / b[i][i];
                for (int k = i; k < b.length; k++) {
                    b[j][k] -= factor * b[i][k];
                }
            }
        }
        // Tính định thức bằng tích các phần tử trên đường chéo chính
        for (int i = 0; i < b.length; i++) {
            det *= b[i][i];
        }
        // Áp dụng quy tắc biến đổi dòng để tính toán số lần hoán đổi dòng
        if (count % 2 == 0) {
            return det;
        } else {
            return -det;
        }
    }
}
