package J07019_HoaDon1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int n = Integer.parseInt(sc1.nextLine()); 
        ArrayList<SanPham> sp = new ArrayList<>();
        while (n-->0) {
            sp.add(new SanPham(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine())));
        }
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> hd = new ArrayList<>();
        while(m-->0){
            String s = sc2.nextLine();
            String[] tmp = s.split("\\s+");
            hd.add(new HoaDon(tmp[0], Integer.parseInt(tmp[1])));
        }
        for(HoaDon i : hd){
            for(SanPham j : sp){
                if(j.getMaSP().equals(i.getMaHD().substring(0, 2))){
                    i.setSp(j, i.getMaHD().charAt(2));
                    break;
                }
            }
        }
        for(HoaDon i : hd){
            System.out.println(i);
        }
    }
}

// 2
// AT
// Ao thun
// 80000
// 45000
// QJ
// Quan Jean
// 220000
// 125000
// 2
// AT1 95
// QJ2 105