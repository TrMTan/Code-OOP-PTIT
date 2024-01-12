package J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        while(t --> 0){
            list.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q --> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep i : list){
                if(i.getSoluong() >= a && i.getSoluong() <= b){
                    System.out.println(i);
                }
            }
        }
    }
}


