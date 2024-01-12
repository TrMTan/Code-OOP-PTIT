/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KtraBai1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Xau {
    private String s;
    private String ht, kt;
    private String nam;

    public Xau() {
    }

    public Xau(String s) {
        this.s = s;
    }

    public Xau(String ht, String kt, String nam) {
        this.ht = ht;
        this.kt = kt;
        this.nam = nam;
    }

    public void nhap(){
         Scanner sc = new Scanner(System.in);
         s = sc.nextLine();
    }
    
    public void chuanHoa(){
        String[] tmp = s.split("[\\s+|]");
        ht = tmp[0].substring(0, 1).toUpperCase() + tmp[0].substring(1).toLowerCase() + " " + 
                tmp[1].substring(0, 1).toUpperCase() + tmp[1].substring(1).toLowerCase() + " " + 
                tmp[2].substring(0, 1).toUpperCase() + tmp[2].substring(1).toLowerCase();
        System.out.println(ht);
    }
}
