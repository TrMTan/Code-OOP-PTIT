/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04001_KhaiBaoLopPoint;

import java.util.Scanner;

/**
 *
 * @author tan
 */

// co the dua class Point vao ham main va nop luon k can phai tao package
//class Point {
//    private double x, y;
//
//    public Point() {
//        this.x = 0;
//        this.y = 0;
//    }
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    
//    public Point(Point p){
//        this.x = p.x;
//        this.y = p.y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    
//    public double distance(Point p){
//        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
//    }
//    
//    public double distance(Point p1, Point p2){
//        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
//    }
//
//    @Override
//    public String toString() {
//        return x + " " + y;
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
