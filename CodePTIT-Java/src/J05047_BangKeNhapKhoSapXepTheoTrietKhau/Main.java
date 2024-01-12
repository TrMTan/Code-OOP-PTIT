package J05047_BangKeNhapKhoSapXepTheoTrietKhau;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        while(t-->0){
            list.add(new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(MatHang i : list){
            System.out.println(i);
        }
    }
}

// 3
// May lanh SANYO
// 12
// 4000000
// Dien thoai Samsung
// 30
// 3230000
// Dien thoai Nokia
// 18
// 1240000