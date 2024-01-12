package J07056_TinhTienDien;

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
        ArrayList<KhachHang> a = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            a.add(new KhachHang(name, tmp[0], Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
        }
        Collections.sort(a);
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}
