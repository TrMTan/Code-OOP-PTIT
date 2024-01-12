package XepLoaiSanPham;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sanpham.dat"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        while(t-->0){
            String ten = sc.nextLine();
            String loai = sc.nextLine();
            String[] data = sc.nextLine().split("\\s+");
            int soLuong = Integer.parseInt(data[0]);
            double donGia = Double.parseDouble(data[1]) * 1000;
            list.add(new SanPham(ten, loai, soLuong, donGia));
        }
        for(SanPham sp : list){
            System.out.println(sp);
        }
    }
}
