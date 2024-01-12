
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        while(true){
            s = sc.nextLine().toLowerCase().trim();
            String[] a = s.split("\\s+");
            if(a[0].compareTo("end") == 0){
                break;
            }
            for(String i : a){
                System.out.print(i.substring(0, 1).toUpperCase() + i.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
