
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
    private String msv, ht, sdt, email;
    private String ten, ho, tendem;

    public SinhVien(String msv, String ht, String sdt, String email) {
        this.msv = msv;
        this.ht = ht;
        this.sdt = sdt;
        this.email = email;
        String[] s = ht.split("\\s+");
        this.ho = s[0];
        for(int i = 0; i < s.length; i++){
            this.tendem += s[i];
        }
        this.ten = s[s.length - 1];
    }

    @Override
    public int compareTo(SinhVien o) {
        if(!this.ten.equalsIgnoreCase(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        if(!this.ho.equals(o.ho)){
            return this.ho.compareTo(o.ho);
        }
        if(!this.tendem.equals(o.tendem)){
            return this.tendem.compareTo(o.tendem);
        }
        return this.msv.compareTo(o.msv);
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + sdt + " " + email;
    }
    
    
}

public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}

//3
//B19DCCN999
//Ngo Quang Huy
//0976544443
//B19DCCN999@stu.ptit.edu.vn
//B19DCCN998
//Nguyen Le Tu
//0345678999
//B19DCCN998@stu.ptit.edu.vn
//B19DCCN997
//Nguyen Manh Cuong
//0987654321
//B19DCCN997@stu.ptit.edu.vn