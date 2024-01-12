/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test4;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Matrix {
    private int[][] a;

    public Matrix(int h, int c) {
        a = new int[h][c];
    }

    public Matrix(int[][] a) {
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
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void xuat(){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static Matrix tinhTong(Matrix mat1, Matrix mat2){
        int rows = mat1.a.length;
        int cols = mat1.a[0].length;
        
        // Tạo ma trận kết quả có cùng kích thước với ma trận mat1
        Matrix result = new Matrix(rows, cols);
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                // Tính tổng từng phần tử tương ứng của hai ma trận
                result.a[i][j] = mat1.a[i][j] + mat2.a[i][j];
            }
        }
        
        return result;
    }
}
