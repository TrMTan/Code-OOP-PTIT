
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class WordSet {
    private TreeSet<String> set;

    public WordSet(String file) throws FileNotFoundException {
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    
    public WordSet(TreeSet<String> set) {
        this.set = set;
    }
    
    public WordSet union(WordSet o){
        TreeSet<String> tmp = new TreeSet<>();
        tmp.addAll(set);
        tmp.addAll(o.set);
        return new WordSet(tmp);
    }
    
    public WordSet intersection(WordSet o){
        TreeSet<String> tmp = new TreeSet<>();
        for(String i : set){
            if(o.set.contains(i)){
                tmp.add(i);
            }
        }
        return new WordSet(tmp);
    }
    
    public WordSet difference(WordSet o){
        TreeSet<String> tmp = new TreeSet<>();
        tmp.addAll(set);
        for(String i : o.set){
            tmp.remove(i);
        }
        return new WordSet(tmp);
    }

    @Override
    public String toString() {
        String s = "";
        for(String i : set){
            s += i + " ";
        }
        return s;
    }
}


public class J07024_HieuCuaHaiTapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
