package J05038_BangKeTienLuong;

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
        int tong = 0;
        for(NhanVien i : list){
            System.out.println(i);
            tong += i.getTong();
        }
        System.out.println("Tong chi phi tien luong: " + tong);
    }
}

// 5
// Cao Van Vu
// 50000
// 26
// GD
// Bui Thi Trang
// 45000
// 23
// PGD
// Do Van Truong
// 40000
// 25
// PGD
// Nguyen Van Cam
// 37000
// 26
// TP
// Truong Thi Tu Linh
// 45000
// 22
// NV