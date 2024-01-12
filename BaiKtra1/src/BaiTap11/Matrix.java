/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap11;

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
    
    public int[] tongHang(){
        int t[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            t[i] = 0;
            for(int j = 0; j < a[0].length; j++){
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
    
    public int[] tongCot(){
        int t[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            t[i] = 0;
            for(int j = 0; j < a[0].length; j++){
                t[i] += a[j][i];
            }
        }
        return t;
    }
    
    public void inTongCot(){
        for(int i = 0; i < a.length; i++){
            System.out.println("Tong cua cot thu " + (i + 1) + " la: " + tongCot()[i]);
        }
    }
    
    public void maxTong(){
        int[] a = tongHang();
        int[] b = tongCot();
        int m1 = a[0];
        int m2 = b[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > m1){
                m1 = a[i];
            }
        }
        for(int i = 0; i < b.length; i++){
            if(b[i] > m2){
                m2 = b[i];
            }
        }
        if(m2 > m1){
            System.out.print("Cac cot co tong lon nhat bang " + m2 + " la: ");
            for(int i = 0; i < b.length; i++){
                if(b[i] == m2){
                    System.out.print((i + 1) + " ");
                }
            }
        }else if(m2 < m1){
            System.out.print("Cac hang co tong lon nhat bang " + m1 + " la: ");
            for(int i = 0; i < a.length; i++){
                if(a[i] == m1){
                    System.out.print((i + 1) + " ");
                }
            }
        }else{
            System.out.print("Cac cot co tong lon nhat bang " + m2 + " la: ");
            for(int i = 0; i < b.length; i++){
                if(b[i] == m2){
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();
            System.out.print("Cac hang co tong lon nhat bang " + m1 + " la: ");
            for(int i = 0; i < a.length; i++){
                if(a[i] == m1){
                    System.out.print((i + 1) + " ");
                }
            }
        }
        System.out.println();
    }
    
    public boolean maTranCon(int[][] a, int[][] b){
        int ar = a.length;
        int ac = a[0].length;
        int br = b.length;
        int bc = b[0].length;
        if(br > ar || bc > ac) return false;
        for(int i = 0; i <= ar - br; i++){
            for(int j = 0; j <= ac - bc; j++){
                boolean ok = true;
                for(int k = 0; k < br; k++){
                    for(int l = 0; l < bc; l++){
                        if(a[i + k][j + l] != b[k][l]){
                            ok = false;
                            break;
                        }
                    }
                    if(!ok) return false;
                    
                }
                if(ok) return true;
            }
        }
        return false;
    }
    
    public void maTranChuyenVi(){
        for(int i = 0; i < a[0].length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
