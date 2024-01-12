/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

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

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public int getLength(){
        return a.length;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma tran " + a.length + "x" + a.length + ": ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void xuat(){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public SquareMatrix tong(SquareMatrix a, SquareMatrix b){
        int[][] MA = a.getA();
        int[][] MB = b.getA();
        SquareMatrix c = new SquareMatrix(getLength());
        int[][] MC = c.getA();

        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j < getLength(); j++) {
                MC[i][j] = MA[i][j] + MB[i][j];
            }
        }
        return c;
    }
}
