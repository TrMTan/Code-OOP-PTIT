package J05045_SapXepNhanVienTheoThuNhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while(t-->0){
            list.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(NhanVien i : list){
            System.out.println(i);
        }
    }
}


// 4
// Tran Thi Yen
// NV
// 1000
// 24
// Nguyen Van Thanh
// BV
// 1000
// 30
// Doan Truong An
// TP
// 3000
// 25
// Le Thanh
// GD
// 5000
// 28