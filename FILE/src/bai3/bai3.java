/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/bai3/test.dat"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] s = line.split("\\s++");
            int cnt = 0;
            double sum = 0;
            for(int i = 2; i < s.length; i++){
                cnt++;
                sum += Double.parseDouble(s[i]);
            }
            for(String i : s){
                System.out.println(i.charAt(1) + " (ID#" + i.charAt(0) + ")" + "worked " + sum + "  hours (" + sum / cnt + " hours/day)");
            }
        }
    }
}
