import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
    private String ht, ns;

    public Person(String ht, String ns) {
        this.ht = ht;
        this.ns = ns;
    }

    public String getHt() {
        return ht;
    }

    @Override
    public String toString() {
        return ht;
    }
    @Override
    public int compareTo(Person arg0) {
        String[] ns1 = ns.split("/");
        String[] ns2 = arg0.ns.split("/");  
        String s1 = ns1[2] + ns1[1] + ns1[0];
        String s2 = ns2[2] + ns2[1] + ns2[0];
        return s2.compareTo(s1);
    }    
}

public class J05032_TreNhatGiaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Person> list = new ArrayList<>();
        while(n --> 0){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            list.add(new Person(tmp[0], tmp[1]));
        }
        Collections.sort(list);
        System.out.println(list.get(0).getHt());
        System.out.println(list.get(list.size() - 1).getHt());
    }
}

// 5
// Nam 01/10/1991
// An 30/12/1990
// Binh 15/08/1993
// Tam 18/09/1990
// Truong 20/09/1990