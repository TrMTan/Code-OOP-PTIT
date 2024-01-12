
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J08015_CapSoCoTongBangK {
    public static long kq(int n, int[] a, int k){
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(int i = 0; i < n; i++){
            if(!m.containsKey(a[i])){ //neu chua co trong map
                m.put(a[i], 0); // dat gt dem = 0
            }
            m.put(a[i], m.get(a[i]) + 1); // neu ton tai thi tang sl len 1
        }
        long dem2 = 0;
        for(int i = 0; i < n; i++){
            if(m.get(k - a[i]) != null){
                dem2 += m.get(k - a[i]);
            }
            if(k - a[i] == a[i]){
                dem2--;
            }
        }
        return dem2 / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            System.out.println(kq(n, a, k));

        }
    }
}
