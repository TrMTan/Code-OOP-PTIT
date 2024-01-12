package J07025_DanhSachKhachHangTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        // Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds, new KhachHang());
        for(KhachHang i : ds){
            System.out.println(i);
        }
    }
}
