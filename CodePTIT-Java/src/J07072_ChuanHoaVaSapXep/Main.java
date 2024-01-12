/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072_ChuanHoaVaSapXep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> a = new ArrayList<>();
        while(sc.hasNext()){
            a.add(new HoTen(sc.nextLine()));
        }
        Collections.sort(a);
        for(HoTen i : a){
            System.out.println(i);
        }
    }
}
