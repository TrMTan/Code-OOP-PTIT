
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
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try {
                tong += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                
            }
        }
        System.out.println(tong);
    }
}
