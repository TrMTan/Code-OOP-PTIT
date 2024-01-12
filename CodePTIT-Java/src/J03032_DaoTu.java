
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03032_DaoTu {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        String[] s = sc.nextLine().trim().split("\\s+");
        for(String i : s){
           StringBuilder tmp = new StringBuilder(i);
            System.out.print(tmp.reverse().toString() + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            check();
        }
    }
}
