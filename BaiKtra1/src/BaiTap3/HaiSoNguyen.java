/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author tan
 */
import java.util.Scanner;

public class HaiSoNguyen {
    private int m, n;
    
    public HaiSoNguyen(){
    }
    
    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen m: ");
        m = sc.nextInt();
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
    }
    
    public int UCLN(int m, int n){
        while(n != 0){
            int tmp = n;
            n = m % n;
            m = tmp;
        }
        return m;
    }
    
    public int BCNN(int m, int n){
        int ucln = UCLN(m, n);
        return m * n / ucln;
    }
    
    public boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public void sntmn(int m, int n){
        for(int i = m; i <= n; i++){
            if(snt(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public boolean stn(int a){
        String s = Integer.toString(a);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public void stnmn(int m, int n){
        for(int i = m; i <= n; i++){
            if(stn(i)){
                System.out.print(i + " ");
            }
        }
    }
}
