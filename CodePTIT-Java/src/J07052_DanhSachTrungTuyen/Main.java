package J07052_DanhSachTrungTuyen;

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
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();  
        while(t-- > 0){
            ds.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ds);
        int chitieu = Integer.parseInt(sc.nextLine());  
        double diemchuan = ds.get(chitieu - 1).getTong();
        if(chitieu > ds.size()){
            chitieu = ds.size();
        }
        System.out.println(String.format("%.1f", diemchuan));
        for(ThiSinh i : ds){
            if(i.getTong() >= diemchuan){
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