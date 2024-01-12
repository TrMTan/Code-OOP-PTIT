/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap9;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class BieuThuc {
    private int n; // bac
    private int[] a; // he so 

    public BieuThuc(int n) {
        a = new int[n];
    }

    public BieuThuc(int n, int[] a) {
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
    
    public void xuat(){
        for(int i = n; i >= 0; i--){
            int hs = a[i];
            if(hs != 0){
                if(hs > 0 && i != n){
                    System.out.print("+");
                }else if(hs < 0){
                    System.out.print("");
                }
                if(i == 0){
                    System.out.print(hs);
                }else if(i == 1){
                    if(hs == 1){
                        System.out.print("x");
                    }else{
                        System.out.print(hs + "x");
                    }
                }else{
                    if(hs == 1){
                        System.out.print("x^" + i);
                    }else{
                        System.out.print(hs + "x^" + i);
                    }
                }
            }
        }
        System.out.println();
    }
    
    public int tinhgtx0(int x){
        int kq = 0;
        for(int i = n; i >= 0; i--){
            int hs = a[i];
            kq += hs * Math.pow(x, i);
        }
        return kq;
    }
    
    public BieuThuc dhb1(){
        int N = n - 1;
        if(N < 0){
            int[] newA = {};
            return new BieuThuc(N, newA);
        }
        
        int[] newA = new int[N + 1];
        for(int i = 0; i <= N; i++){
            newA[i] = a[i + 1] * (i + 1);
        }
        return new BieuThuc(N, newA);
    }
    public BieuThuc tong(BieuThuc q){
        int N = Math.max(n, q.getN());
        int[] newA = new int[N + 1];
        
        for(int i = 0; i <= N; i++){
            int hsp = (i <= n) ? a[i] : 0;
            int hsq = (i <= q.getN()) ? q.getA()[i] : 0;
            newA[i] = hsp + hsq;
        }
        return new BieuThuc(N, newA);
    }
    
    public BieuThuc hieu(BieuThuc q){
        int N = Math.max(n, q.getN());
        int[] newA = new int[N + 1];
        
        for(int i = 0; i <= N; i++){
            int hsp = (i <= n) ? a[i] : 0;
            int hsq = (i <= q.getN()) ? q.getA()[i] : 0;
            newA[i] = hsp - hsq;
        }
        return new BieuThuc(N, newA);
    }
    
    public BieuThuc[] chia(BieuThuc q) {
        int pN = n; // bac cua P(x)
        int qN = q.getN(); // bac cua Q(x)

        if (pN < qN) {
            BieuThuc[] kq = { new BieuThuc(0, new int[]{0}), this };
            return kq;
        }

        int thuongN = pN - qN;
        int duN = qN - 1;
        int[] thuongA = new int[thuongN + 1];
        int[] duA = new int[duN + 1];

        int[] pA = a.clone(); // sao chep hs cua P(x)
        int[] qA = q.getA();  // mang he so Q(x)

        while (pN >= qN) {
            int h = pA[pN] / qA[qN]; // tim he so chia
            thuongA[pN - qN] = h;

            for (int i = 0; i <= qN; i++) {
                pA[pN - i] -= h * qA[qN - i];  //thuc hien phep tru sau moi lan chia tim d athuc du moi
            }
            pN--;  // giam bac P(x) sau moi lan chia
        }

        BieuThuc thuong = new BieuThuc(thuongN, thuongA);
        BieuThuc du = new BieuThuc(duN, pA);

        BieuThuc[] result = { thuong, du };
        return result;
    }
}
