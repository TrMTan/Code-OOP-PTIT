package J05048_BangTheoDoiNhapXuatHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> res = new ArrayList<>();
        while(t-->0){
            res.add(new Hang(sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        for(Hang i : res){
            System.out.println(i);
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