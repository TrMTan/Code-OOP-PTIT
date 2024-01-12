package J05027_TimKiemGiangVien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            list.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q --> 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(GiangVien i : list){
                if(i.getTen().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(i);
                }
            }
        }
    }
}


