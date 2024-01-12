package J05026_DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new GiangVien(sc.nextLine(), sc.nextLine())); 
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s++");
            String b = "";
            for(String i : a){
                b += i.substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + b + ":");
            for(GiangVien i : list){
                if(i.getBoMon().equalsIgnoreCase(s)){
                    System.out.println(i);
                }
            }
        }
    }
}

