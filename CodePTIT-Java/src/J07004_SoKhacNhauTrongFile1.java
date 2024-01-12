
import java.io.File;
import java.io.FileNotFoundException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            if(mp.containsKey(n)){
                int tansuat = mp.get(n);
                tansuat++;
                mp.put(n, tansuat);
            }else mp.put(n, 1);
        }
        List<Integer> l = new ArrayList<>(mp.keySet());
        Collections.sort(l);
        
        for(Integer i : l){
            System.out.println(i + " " + mp.get(i));
        }
    }
}
