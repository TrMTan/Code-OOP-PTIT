/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009_TimThuKhoaKyThi;

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
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> a = new ArrayList<>();
        while(t-->0){
            a.add(new ThuKhoa(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(a);
        float max = a.get(0).getTong();
        for(ThuKhoa i : a){
            if(i.getTong() == max){
                System.out.println(i);
            }else{
                break;
            }
        }
    }
}
