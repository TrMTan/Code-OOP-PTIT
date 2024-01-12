/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap12;

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
    
    public SquareMatrix hieu(SquareMatrix a, SquareMatrix b){
        int[][] MA = a.getA();
        int[][] MB = b.getA();
        SquareMatrix c = new SquareMatrix(getLength());
        int[][] MC = c.getA();

        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j < getLength(); j++) {
                MC[i][j] = MA[i][j] - MB[i][j];
            }
        }
        return c;
    }
    
    public SquareMatrix tich(SquareMatrix a, SquareMatrix b){
        int[][] MA = a.getA();
        int[][] MB = b.getA();
        SquareMatrix c = new SquareMatrix(getLength());
        int[][] MC = c.getA();

        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j < getLength(); j++) {
                for(int k = 0; k < getLength(); k++){
                    MC[i][j] += MA[i][k] * MB[k][j];
                }
            }
        }
        return c;
    }
}
