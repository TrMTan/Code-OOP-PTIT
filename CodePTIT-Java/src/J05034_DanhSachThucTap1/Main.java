package J05034_DanhSachThucTap1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while(t-->0){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            for(SinhVien i : list){
                if(i.getDoanhNghiep().equals(s)){
                    System.out.println(i);
                }
            }
        }
    }
}
