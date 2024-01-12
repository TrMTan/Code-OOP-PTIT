package J07057_DiemTuyenSinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while (t-->0) {
            list.add(new ThiSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (ThiSinh thiSinh : list) {
            System.out.println(thiSinh);
        }
    }
}

// 3
// Nguyen  hong ngat
// 22
// Kinh
// 1
// Chu thi MINh
// 14
// Dao
// 3
// tran manh tran
// 22
// Dao
// 3