/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04010_DienTichHinhTronNgoaiTiepTamGiac;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = b.distance(c);
            if(ab + ac <= bc || ab + bc <= ac || bc + ac <= ab){
                System.out.println("INVALID");
            }else{
                double S = 1 / 4f * Math.sqrt((ab + ac + bc) * (ab + ac - bc) * (ab - ac + bc) * (-ab + ac + bc));
                double R = ab * ac * bc / (S * 4);
                System.out.printf("%.3f\n", Math.PI * R * R);
            } 
        }
    }
}
