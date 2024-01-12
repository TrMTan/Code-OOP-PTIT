/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1va2va13;

/**
 *
 * @author tan
 */

import java.util.Scanner;

public class songuyenduongN{
    private int n;

    public songuyenduongN() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    
    public int tong1N(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    public int tich1N(int n){
        int tich = 1;
        for(int i = 1; i <= n; i++){
            tich *= i;
        }
        return tich;
    }
    
    public int tongc1N(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    public int tongl1N(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }
    
    public int tongc1s1N(int n, int a){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % a == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    public int tongc2s1N(int n, int a, int b){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % a == 0 && i % b == 0){
                sum += i;
            }
        }
        return sum;
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
    
    public void snt1N(int n){
        for(int i = 1; i <= n; i++){
            if(snt(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public void uocN(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    
    public void uocsntN(int n){
        for(int i = 2; i <= n; i++){
            if(n % i == 0 && snt(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public long fibo(int n){
        long[] f = new long[100];
        f[1] = 1; 
        f[2] = 1;
        for(int i = 3; i <= n; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
    
    public void fiboN(int n){
        for(int i = 0; i < n; i++){
            if(fibo(i) <= n){
                System.out.print(fibo(i) + " ");
            }
        }
    }
    
    public void fibosntN(int n){
        for(int i = 2; i <= n; i++){
            if(fibo(i) <= n && snt((int)fibo(i))){
                System.out.print(fibo(i) + " ");
            }
        }
    }
    
    public void sinhnp(char[] s, int index, int n) {
        if(index > n){
            for(int i = 1; i <= n; i++){
                System.out.print(s[i]);
            }
            System.out.print(" ");
        }else{
            for(char j = '0'; j <= '1'; j++){
                s[index] = j;
                sinhnp(s, index + 1, n);
            }
        }
    }
    
    public void sinhnpN(int n) {
        char[] s = new char[n + 1];
        sinhnp(s, 1, n);
    }
    
    public void sinhhv(int[] a, int[] vs, int i, int n){
        if(i == n){
            for(int j = 0; j < n; j++){
                System.out.print(a[j]);
            }
            System.out.print(" ");
        }
        for(int j = 1; j <= n; j++){
            if(vs[j] == 0){
                a[i] = j;
                vs[j] = 1;
                sinhhv(a, vs, i + 1, n);
                vs[j] = 0;
            }
        }
    }
    
    public void hvN(int n){
        int[] a = new int[n];
        int[] vs = new int[n + 1];
        sinhhv(a, vs, 0, n);
    }
    
    public void sntNcs(int n){
        int start = (int)Math.pow(10, n - 1);
        int end = (int)Math.pow(10, n) - 1;
        for(int i = start; i <= end; i++){
            if(snt(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public boolean stn(int n){
        int a = 0;
        int b = n;
        while(b > 0){
            a =  a * 10 + b % 10;
            b /= 10;
        }
        return a == n;
    }
    
    public void stncNcs(int n){
        int start = (int)Math.pow(10, n - 1);
        int end = (int)Math.pow(10, n) - 1;
        for(int i = start; i <= end; i++){
            if(stn(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    public int tongcs(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public void pttsnt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            int mu = 0;
            if(n % i == 0){
                while(n % i == 0){
                    mu++;
                    n /= i;
                }
                System.out.print(i + "x" + mu + "x");
            }
            if(n == 1) break;
        }
        if(n > 1) System.out.print(n);
    }
    
    public boolean ktrasdc(int n){
        String s = Integer.toString(n);
        if(!stn(n)){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            int so = Character.getNumericValue(s.charAt(i));
            if(so % 2 != 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean ktrasd(int n){
        int tong = 0;
        if(!stn(n)) return false;
        String s = Integer.toString(n);
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        for(int i = 0; i < s.length(); i++){
            tong += Character.getNumericValue(s.charAt(i));
        }
        return tong % 10 == 0;
    }
    
    public boolean ktrasdsnt(int n){
        if(!stn(n)) return false;
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++){
            int so = Character.getNumericValue(s.charAt(i));
            if(!snt(so)){
                return false;
            }
        }
        return true;
    }
}


