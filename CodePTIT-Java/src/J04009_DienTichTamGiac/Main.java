/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04009_DienTichTamGiac;

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
                System.out.printf("%.2f\n", S);
            }
        }
    }
}
