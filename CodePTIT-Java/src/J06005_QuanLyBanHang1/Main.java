package J06005_QuanLyBanHang1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        while (n-->0) {
            kh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> mh = new ArrayList<>();
        while (m-->0) {
            mh.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int p = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> hd = new ArrayList<>();
        for(int i = 0; i < p; i++){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            HoaDon x = new HoaDon(Integer.parseInt(tmp[2]));
            for(KhachHang j : kh){
                if(j.getMaKH().equals(tmp[0])){
                    x.setKh(j);
                    break;
                }
            }
            for(MatHang j : mh){
                if(j.getMaMH().equals(tmp[1])){
                    x.setMh(j);
                    break;
                }
            }
            hd.add(x);
        }
        for(HoaDon i : hd){
            System.out.println(i);
        }
    }
}

// 2
// Nguyen Van Nam
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
// Tran Van Binh
// Nam
// 11/14/1995
// Phung Khoang-Nam Tu Liem-Ha Noi
// 2
// Ao phong tre em
// Cai
// 25000
// 41000
// Ao khoac nam
// Cai
// 240000
// 515000
// 3
// KH001 MH001 2
// KH001 MH002 3
// KH002 MH002 4