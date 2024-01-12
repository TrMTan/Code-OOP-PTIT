
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03010_DiaChiEmail {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> dd = new ArrayList<>();
        while(t-->0){
            String ar[] = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = ar[ar.length - 1];
            for(int i = 0; i < ar.length - 1; i++){
                s += ar[i].charAt(0);
            }
            dd.add(s);
            int dem = Collections.frequency(dd, s);
            s += (dem == 1 ? "" : dem) + "@ptit.edu.vn";
            System.out.println(s);
        }
    }
}
