package J05073_TinhToanGiaBan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ans = new ArrayList<>();
        while(t-->0){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            ans.add(new MatHang(tmp[0], Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
        }
        for(MatHang i : ans){
            System.out.println(i);
        }
    }
}

// 2
// TTVC 400 300
// CCAK 200 200