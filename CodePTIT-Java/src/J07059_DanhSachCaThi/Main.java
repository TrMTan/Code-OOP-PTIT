package J07059_DanhSachCaThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        // Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> list = new ArrayList<>();
        while (t-->0) {
            list.add(new CaThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(CaThi i : list){
            System.out.println(i);
        }
    }
}

// 2
// 09/01/2022
// 15:30
// 70172
// 09/01/2022
// 10:00
// 70279