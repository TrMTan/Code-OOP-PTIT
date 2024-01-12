/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author tan
 */
import java.util.Scanner;
public class BaSoThuc {
    private float a, b, c;

    public BaSoThuc() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thuc a: ");
        a = sc.nextFloat();
        System.out.print("Nhap vao so thuc b: ");
        b = sc.nextFloat();
        System.out.print("Nhap vao so thuc c: ");
        c = sc.nextFloat();
    }
    
    public void ptb2(float a, float b, float c){
        if(a == 0 && b == 0 && c == 0){
            System.out.print("Phuong trinh co vo so nghiem");
        }else if(a == 0 && b == 0){
            System.out.print("Phuong trinh vo nghiem");
        }else if(b == 0){
            if(a > 0 && c > 0){
                System.out.print("Phuong trinh vo nghiem");
            }
            if(a < 0 && c < 0){
                System.out.print("Phuong tinh vo nghiem");
            }
        }else if(a == 0){
            System.out.print("Phuong trinnh co nghiem: x = " + -c / b);
        }else{
            float d = b * b - 4 * a * c;
            if(d < 0){
                System.out.print("Phuong trinh vo nghiem");
            }else if(d == 0){
                System.out.print("Phuong trinh co nghiem kep: x1 = x2 = " + (-b / (2 * a)));
            }else{
                System.out.println("Phuong trinh co nghiem: x1 = " + (-b + Math.sqrt(d)) / 2 * a );
                System.out.println("Phuong trinh co nghiem: x2 = " + (-b - Math.sqrt(d)) / 2 * a );
            }
        }
    }
    
    public float dttg(float a, float b, float c) {
        float p = (a + b + c) / 2;
        return (float)Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public float dt(float a, float b, float c){
        float s = 0;
        if(a == b && b == c && c == a){
            s = 2 * (a * a + a * b);
        }
        if(a == b || b == c || c == a){
            s = 2 * (a * a + a * b);
        }
        if(a != b && b != c && c != a){
            s = 2 * (a * b + a * c + b * c);
        }
        return s;
    }
    
    public float cv(float a, float b, float c){
        float s = 0;
        if(a == b && b == c && c == a){
            s = 4 * a;
        }
        if(a == b || b == c || c == a){
            s = 2 * (a + b + c);
        }
        if(a != b && b != c && c != a){
            s = 4 * (a + b + c);
        }
        return s;
    }
}
