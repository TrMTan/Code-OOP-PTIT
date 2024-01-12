/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class DaySoThuc {
    private double[] a;

    public DaySoThuc(int n) {
        a = new double[n];
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao day so thuc a: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextDouble();
        }
    }
    
    public void tong(){
        double tong = 0;
        for(int i = 0; i < a.length; i++){
            tong += a[i];
        }
        System.out.println("Tong day so thuc: " + tong);
    }
    
    public void sapXep(){
        Arrays.sort(a);
        System.out.print("Day so thuc sap xep tang dan: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Day so thuc sap xep giam dan: ");
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
