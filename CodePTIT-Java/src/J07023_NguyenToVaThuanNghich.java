import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class J07023_NguyenToVaThuanNghich {
    public static boolean snt(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); ++i)
            if (n % i == 0) return false;
        return true;
    }
    public static boolean check(int n) {
        String s = Integer.toString(n);
        StringBuffer sb = new StringBuffer(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        TreeMap<Integer, Integer> map2 = new TreeMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : a) {
            if (snt(i) && check(i)) {
                if(map1.containsKey(i)) map1.put(i, map1.get(i) + 1);
                else map1.put(i, 1);
                set.add(i);
            }
        }
        for(int i : b) {
            if (snt(i) && check(i)) {
                if(map2.containsKey(i)) map2.put(i, map2.get(i) + 1);
                else map2.put(i, 1);
                set.add(i);
            }
        }
        for(int i : set) {
            if(map1.containsKey(i) && map2.containsKey(i)) 
                System.out.println(i + " " + map1.get(i) + " " + map2.get(i));
        }
    }
}
