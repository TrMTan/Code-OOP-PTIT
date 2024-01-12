
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine(); // xau con
            int i = 0;
            while(s1.indexOf(s2, i) != -1){
                System.out.print(s1.indexOf(s2, i) + 1 + " ");
                i = s1.indexOf(s2, i) + 1;
                if(i >= s1.length()){
                    break;
                }   
            }
            System.out.println();
        }
    }
}
