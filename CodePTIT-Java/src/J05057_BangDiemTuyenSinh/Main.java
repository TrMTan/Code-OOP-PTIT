package J05057_BangDiemTuyenSinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();  
        while(t-- > 0){
            ds.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(ThiSinh i : ds){
            if(i.getTong() >= 24){
                i.setTrangthai("TRUNG TUYEN");
            }else{
                i.setTrangthai("TRUOT");
            }
        }
        for(ThiSinh i : ds){
            System.out.println(i);
        }
    }
}

// 2
// KV2A002
// Hoang Thanh Tuan
// 5
// 6
// 5
// KV2B123
// Ly Thi Thu Ha
// 8
// 6.5
// 7