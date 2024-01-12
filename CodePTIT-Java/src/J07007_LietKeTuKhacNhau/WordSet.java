/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07007_LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tan
 */
public class WordSet {
    private Set<String> se = new TreeSet<>();

    public WordSet(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(String i : se){
            res += i + "\n";
        }
        return res;
    }
}
