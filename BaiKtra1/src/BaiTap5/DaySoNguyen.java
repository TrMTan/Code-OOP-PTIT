/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    
    public void xuat(){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public int tong(int[] a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }
    
    public int tb(int[] a){
        return tong(a) / a.length;
    }
    
    public int[] sort(int[] a){
        Arrays.sort(a);
        return a;
    }
    
    public void gtlnnn(){
        sort(a);
        System.out.println("Gia tri lon nhat: " + a[a.length - 1]);
        System.out.println("Gia tri nho nhat: " + a[0]);
    }
    
    public void findMax() {
        int max = a[0];
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("Vị trí số lớn nhất: " + (maxIndex + 1));
    }

    
    public void findSecondMax() {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = -1;
        int secondMaxIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = a[i];
                maxIndex = i;
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
                secondMaxIndex = i;
            }
        }
        System.out.println("Vị trí số lớn thứ hai: " + (secondMaxIndex + 1));
    }

    public void findMin() {
        int min = a[0];
        int minIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        System.out.println("Vị trí số nhỏ nhất: " + (minIndex + 1));
    }

    public void findSecondMin() {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int minIndex = -1;
        int secondMinIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                secondMinIndex = minIndex;
                min = a[i];
                minIndex = i;
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
                secondMinIndex = i;
            }
        }
        System.out.println("Vị trí số nhỏ thứ hai: " + (secondMinIndex + 1));
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
    
    public void insnt(){
        for(int i = 0; i < a.length; i++){
            if(snt(a[i])){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    
    public void intsochiahet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so bi chia: ");
        int n = sc.nextInt();
        System.out.print("Cac so chia het cho " + n + " la: ");
        for(int i = 0; i < a.length; i++){
            if(a[i] % n == 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
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
    
    public void dx(){
        boolean ok = true;
        for(int i = 0, j = a.length - 1; i < j ; i++, j--){
            if(a[i] != a[j]){
                ok = false;
                break;
            }
        }
        System.out.println("Day so" + (ok ? " doi xung" : " khong doi xung"));
    }
    
    public void solanxh(){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : a){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i) + 1);   
            }else{
                mp.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        System.out.println("So lan xuat hien cua moi phan tu trong day" + mp);
    }
    
    public void diemcb(){
        int l = 0;
        int r = tong(a);
        for(int i = 0; i < a.length; i++){
            r -= a[i];
            if(l == r){
                System.out.println("Diem can bang cua day so: " + (i + 1));
                return;
            }
            l += a[i];
        }
        System.out.println("-1");
    }
}
