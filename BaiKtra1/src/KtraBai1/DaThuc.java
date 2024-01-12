/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KtraBai1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class DaThuc {
    private int n; // bac
    private int[] a; // he so 

    public DaThuc(int n) {
        a = new int[n];
    }

    public DaThuc(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    
    public void heSo(int i, int value){
        if(i >= 0 && i <= n){
            a[i] = value;
        }
    }
    
    public void setBac(int n){
        this.n = n;
        a = new int[n + 1];
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        for(int i = n; i >= 0; i--){
            System.out.print("Nhap he so cua x^" + i + ": ");
            int hs = sc.nextInt();
            heSo(i, hs);
        }
    }
}
