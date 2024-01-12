package J05036_TinhGiaBan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        while (t-->0) {
            list.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(MatHang i : list){
            System.out.println(i);
        }
    }
}
// 4
// DUONG
// KG
// 7500
// 150
// TRUNG
// CHUC
// 10000
// 225
// GAO
// KG
// 14000
// 118
// SUA
// HOP
// 48000
// 430