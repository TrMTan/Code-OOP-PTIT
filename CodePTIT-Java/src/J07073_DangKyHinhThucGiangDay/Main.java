package J07073_DangKyHinhThucGiangDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-->0) {
            list.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(MonHoc i : list){
            if(!i.getTh().equals("Truc tiep")){
                System.out.println(i);
            }
        }
    }
}
// 3
// INT1306
// Cau truc du lieu va giai thuat
// 3
// Truc tiep
// code.ptit.edu.vn
// INT13110
// Lap trinh mang voi C++
// 3
// Truc tiep
// Truc tuyen
// INT1155
// Tin hoc co so 2
// 2
// Truc tiep
// code.ptit.edu.vn