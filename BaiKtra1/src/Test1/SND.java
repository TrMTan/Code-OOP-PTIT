/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class SND {
    private int n;

    public SND() {
    }

    public SND(int n) {
        this.n = n;
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
}
