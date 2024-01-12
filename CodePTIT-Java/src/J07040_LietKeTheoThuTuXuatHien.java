
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> a = (ArrayList<String>) ip.readObject();
        Set<String> se = new TreeSet<>();
        for(String i : a){
            String[] words = i.trim().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(words));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(se.contains(s)){
                System.out.println(s);
                se.remove(s);
            }
        }
    }
}
