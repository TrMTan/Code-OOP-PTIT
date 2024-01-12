/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04002_KhaiBaoLopHinhChuNhat;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String s = sc.next();
        Rectange a = new Rectange(w, h, s);
        s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        if(w > 0 && h > 0){
            System.out.printf("%d %d %s", (int) a.findPerimeter(), (int) a.findArea(), s);
        }else{
            System.out.println("INVALID");
        }
    }
}
