package ThucHanhBuoi3.TinhTienChoiGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("game.dat"));
        // Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        while(t-->0){
            String ten = sc.nextLine();
            String tenMay = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            double tienDoAnUong = Double.parseDouble(sc.nextLine());
            list.add(new KhachHang(ten, tenMay, gioVao, gioRa, tienDoAnUong));
        }
        Collections.sort(list, Comparator.comparingInt(a -> a.getSoGioChoi()));
        for(KhachHang kh : list){
            System.out.println(kh);
        }
    }
}


// 3
// To an an
// Hacom poseidom
// 9:20
// 10:20
// 50000
// Lai thu ha
// Dell inspiron
// 15:12
// 20:30
// 0
// Vu Tuan anh
// Asus rog
// 10:20
// 13:45
// 200000