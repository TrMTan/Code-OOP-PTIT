/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04008_ChuViTamGiac;

/**
 *
 * @author tan
 */
public class Triangle {
    private Point a = new Point(), b = new Point(), c = new Point();
    private double ab, ac, bc;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        a.setX(x1);
        a.setY(y1);
        b.setX(x2);
        b.setY(y2);
        c.setX(x3);
        c.setY(y3);
        this.ab = a.distance(b);
        this.ac = a.distance(c);
        this.bc = b.distance(c);
    }

    @Override
    public String toString() {
        if(ab + ac <= bc || ab + bc <= ac || bc + ac <= ab){
            return String.format("INVALID");
        }
        return String.format("%.3f", ab + ac + bc);
    }
}
