package J05049_LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> res = new ArrayList<>();
        while(t-->0){
            res.add(new Hang(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(res);
        String s = sc.nextLine();
        for(Hang i : res){
            if (i.getMa().charAt(0) == s.charAt(0)) {
                System.out.println(i);
            }
        }
    }
}

// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582