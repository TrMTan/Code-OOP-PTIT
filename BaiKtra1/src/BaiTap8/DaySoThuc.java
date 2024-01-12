/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
        System.out.print("Nhap vao day so a: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextDouble();
        }
    }
    
    public void xuat(){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public double[] sort(double [] a){
        Arrays.sort(a);
        return a;
    }
    
    public void sx(){
        sort(a);
        System.out.print("Sap xep day so tang dan: ");
        xuat();
        System.out.print("Sap xep day so giam dan: ");
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public void ktrasxt(){
        boolean ok = true;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                ok = false;
                break;
            }
        }
        System.out.println("Day so" + (ok ? " da sap xep tang dan" : " chua sap xep tang dan"));
    }
    
    public void ktrasxg(){
        boolean ok = true;
        for(int i = a.length - 1; i >= 0; i--){
            if(a[i] > a[i - 1]){
                ok = false;
                break;
            }
        }
        System.out.println("Day so" + (ok ? " da sap xep giam dan" : " chua sap xep giam dan"));
    }
    
    public void solanxh(){
        Map<Double, Integer> mp = new HashMap<>();
        for(Double i : a){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i) + 1);   
            }else{
                mp.put(i, 1);
            }
        }
        for(Map.Entry<Double, Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        System.out.println("So lan xuat hien cua moi phan tu trong day" + mp);
    }
    
    public void xh1lan(){
        Map<Double, Integer> mp = new HashMap<>();
        for(Double i : a){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i) + 1);   
            }else{
                mp.put(i, 1);
            }
        }
        System.out.print("Cac phan tu xuat hien mot lan: ");    
        for(Map.Entry<Double, Integer> i : mp.entrySet()){
            if(i.getValue() == 1){
                System.out.print(i.getKey() + " ");
            }
        }
        System.out.println();
    }
    
    
    public void lonnho(){
        sort(a);
        System.out.println("So lon nhat: " + a[a.length - 1]);
        System.out.println("So nho nhat: " + a[0]);
        double tong = 0;
        for(double i : a){
            tong += i;
        }
        System.out.println("Tong day so thuc: " + tong);
        System.out.println("Trung binh cua day so thuc: " + (double)(tong / a.length));
    }
}
