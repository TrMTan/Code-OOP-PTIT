
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02007_DemSoLanXuatHien {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(int t){
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(mp.containsKey(a[i])){
                int tanSuat = mp.get(a[i]);
                ++tanSuat;
                mp.put(a[i], tanSuat);
            }else mp.put(a[i], 1);
        }
        System.out.println("Test " + t + ":");
        for(Map.Entry<Integer, Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " xuat hien " + i.getValue() + " lan");
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            check(i);
        }
    }
}
