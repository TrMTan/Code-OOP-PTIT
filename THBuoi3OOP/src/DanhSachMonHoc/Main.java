package DanhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("monhoc.dat"));
        ArrayList<MonHoc> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String[] data = sc.nextLine().split(",");
            list.add(new MonHoc(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
        }
        Collections.sort(list);
        for(MonHoc i : list) {
            System.out.println(i);
        }
    }
}
