import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
  * J07030_CapSoNguyenToTrongFile1
  */
 public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        Set<Integer> set1 = new TreeSet<>((ArrayList) sc.readObject());
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> set2 = new TreeSet<>((ArrayList) sc.readObject());
        for(Integer i : set1){
            if(i < 1000000 - i && snt(i) && snt(1000000 - i) && set2.contains(1000000 - i)){
                System.out.println(i + " " + (1000000 - i));
            } 
        }
    }
 }