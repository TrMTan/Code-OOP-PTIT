package J07054_TinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        // Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> res = new ArrayList<>();
        while (t-->0) {
            res.add(new SinhVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(res);
        res.get(0).setHang(1); // cho thang dau tien hang 1
        for(int i = 1; i < res.size(); i++){
            if(res.get(i).getTB() == res.get(i - 1).getTB()){ // kiem tra xem co bang diem voi thang truoc khong
                res.get(i).setHang(res.get(i - 1).getHang()); // neu bang thi cho hang cua thang truoc
            }else{
                res.get(i).setHang(i + 1); // neu khong bang thi cho hang cua thang hien tai
            }
        }
        for(SinhVien i : res){
            System.out.println(i);
        }
    }
}

// 2
//  ha Thi kieu     anh
// 7
// 6
// 7
// Pham    THI  HAO
// 6
// 7
// 6