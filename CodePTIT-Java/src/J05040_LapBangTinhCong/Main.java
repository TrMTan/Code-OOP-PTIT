package J05040_LapBangTinhCong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while(t-->0){
            list.add(new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        for(NhanVien i : list){
            System.out.println(i);
        }
    }
}

// 3
// Cao Van Vu
// 50000
// 26
// GD
// Do Van Truong
// 40000
// 25
// PGD
// Truong Thi Tu Linh
// 45000
// 22
// NV