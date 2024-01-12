/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<HocSinh> a = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            String name = sc.nextLine();
            float[] p = new float[10];
            for(int i = 0; i < 10; i++){
                p[i] = sc.nextFloat();
            }
            a.add(new HocSinh(name, p));
        }
        Collections.sort(a);
        for(HocSinh i : a){
            System.out.println(i);
        }
    }
}
