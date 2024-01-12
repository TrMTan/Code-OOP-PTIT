
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03009_TapTuRiengCuaHaiXau {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        String[] a = sc.nextLine().split("\\s+");
        String b = sc.nextLine();
        TreeSet<String> se = new TreeSet<>();
        for(String i : a){
            if(!b.contains(i)){
                se.add(i);
            }
        }
        for(String i : se){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}
