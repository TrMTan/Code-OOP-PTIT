/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import model.Bao;
import model.Sach;

/**
 *
 * @author DELL
 */
public class Cau1 {
    public static void main(String[] args) {
        Bao b = new Bao("Kim Dong", "2/2/2002", 100);
        b.setMa();
        System.out.println(b);
        Sach s = new Sach("Kim Dong", 200, "Tan", "Hay mua di", 200);
        s.setMa();
        System.out.println(s);
    }
}
