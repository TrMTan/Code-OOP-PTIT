/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04022_WORDSET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tan
 */
public class WordSet {
    private ArrayList<String> a;

    public WordSet(String s) {
        s = s.toLowerCase();
        this.a = new ArrayList<>();
        String[] b = s.split("\\s+");
        this.a.addAll(Arrays.asList(b));
    }

    public WordSet(ArrayList<String> a) {
        this.a = a;
    }

    public WordSet union(WordSet A) {
        Set<String> se = new TreeSet<>();
        for(String i : a){
            se.add(i);
        }
        for(String i : A.a){
            se.add(i);
        }
        return new WordSet(new ArrayList<String>(se));
    }

    public WordSet intersection(WordSet A) {
        Set<String> se = new TreeSet<>();
        for(String i : a){
            if(A.a.contains(i)){
                se.add(i);
            }
        }
        return new WordSet(new ArrayList<String>(se));
    }

    @Override
    public String toString() {
        String res = "";
        for(String i : a){
            res += i + " ";
        }
        return res;
    }
}
