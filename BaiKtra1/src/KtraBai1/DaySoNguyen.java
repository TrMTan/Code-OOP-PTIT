/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KtraBai1;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class DaySoNguyen {
    private int[] a;

    public DaySoNguyen(int n) {
        a = new int[n];
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao day so a: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }
    
    public void gtlnnn(){
        sort(a);
        System.out.println("Gia tri lon nhat: " + a[a.length - 1]);
        System.out.println("Gia tri nho nhat: " + a[0]);
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
    
    public void tanSuat(){
        int[] mp = new int[1001];
        for(int i = 0; i < a.length; i++){
            mp[a[i]]++;
        }
        for(int i = 0; i < a.length; i++){
            if(mp[a[i]] > 0){
                System.out.println(a[i] + " " + mp[a[i]]);
            }
        }
    }
}
