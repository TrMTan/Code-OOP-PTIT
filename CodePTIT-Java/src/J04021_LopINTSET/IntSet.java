/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04021_LopINTSET;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tan
 */
public class IntSet {
    private int[] arr;

    public IntSet(int[] arr) {
        this.arr = arr;
    }
    
    public IntSet union(IntSet A){
         Set<Integer> se = new TreeSet<>();
         for(int i : arr){
             se.add(i);
         }
         for(int i : A.arr){
             se.add(i);
         }
         return new IntSet(se.stream().mapToInt(Integer::intValue).toArray());
    }

    @Override
    public String toString() {
        String s = "";
        for(int i : arr){
            s += Integer.toString(i) + " ";
        }
        return s;
    }
}
