/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04019_LopTriangle1;

/**
 *
 * @author tan
 */
public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        if(ab + bc > ac && ab + ac > bc && bc + ac > ab){
            return true;
        }else{
            return false;
        }
    }
    
    public String getPerimeter(){
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        return String.format("%.3f", ab + ac + bc);
    }
}
