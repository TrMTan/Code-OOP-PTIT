import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07031_CapSoNguyenToTrongFile2 {
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList) sc1.readObject();
        Set<Integer> set1 = new TreeSet<>(arr1);
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList) sc2.readObject();
        Set<Integer> set2 = new TreeSet<>(arr2);
        for(Integer i : set1){
            if(i < 1000000 - i && snt(i) && snt(1000000 - i) && set1.contains(1000000 - i) && !set2.contains(1000000 - i) && !set2.contains(i)){
                System.out.println(i + " " + (1000000 - i));
            } 
        }
    }
}
