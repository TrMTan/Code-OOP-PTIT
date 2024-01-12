package J06003_QuanLyBaiTapNhom1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> sv = new ArrayList<>();
        while(n-->0){
            sc.nextLine();
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        ArrayList<Nhom> nhom = new ArrayList<>();
        sc.nextLine();
        while(m-->0){
            nhom.add(new Nhom(sc.nextLine()));
        }
        for(SinhVien i : sv){
            for(Nhom j : nhom){
                if(i.getSttn() == j.getMa()){
                    j.getSv().add(i);
                }
            }
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            int sttn = Integer.parseInt(sc.nextLine());
            for(Nhom i : nhom){
                if(i.getMa() == sttn){
                    System.out.println(i);
                }
            }
        }
    }
}


// 5 2
// B17DTCN001
// Nguyen Chi  Linh
// 0987345543
// 1
// B17DTCN011
// Vu Viet Thang
// 0981234567
// 1
// B17DTCN023
// Pham Trong Thang
// 0992123456
// 1
// B17DTCN022
// Nguyen Van  Quyet
// 0977865432
// 2
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19
// 1
// 1