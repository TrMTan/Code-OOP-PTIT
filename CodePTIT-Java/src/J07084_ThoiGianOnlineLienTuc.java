
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class SinhVien implements Comparable<SinhVien>{
    private String ht;
    private Date bd, kt;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public SinhVien(String ht, String bd, String kt) throws ParseException {
        this.ht = ht;
        this.bd = sdf.parse(bd);
        this.kt = sdf.parse(kt);
    }
    
    public long time(){
        return kt.getTime() - bd.getTime();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.time() != o.time()){
            return Long.compare(o.time(), this.time());
        }
        return this.ht.compareTo(o.ht);
    }

    @Override
    public String toString() {
        return ht + " " + (int)(time() / (1000 * 60));
    }
}

public class J07084_ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}

//3
//Do Viet Anh
//11/12/2021 16:35:00
//11/12/2021 17:35:00
//Le Tuan Anh
//11/12/2021 16:45:00
//11/12/2021 18:15:00
//Nguyen Tuan Anh
//11/12/2021 17:00:00
//11/12/2021 19:15:00