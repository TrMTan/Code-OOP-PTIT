package J05082_DanhSachKhachHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        while(t-->0){
            kh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kh);
        for(KhachHang i : kh){
            System.out.println(i);
        }
    }
}
// 2
//  nGuyen VAN     nAm
// Nam
// 2/2/1995
// Mo Lao-Ha Dong-Ha Noi
//  TRan    vAn     biNh
// Nam
// 2/3/1995
// Phung Khoang-Nam Tu Liem-Ha Noi