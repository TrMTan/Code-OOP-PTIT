
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
class MonHoc {
    private String ma, ten;
    private int stc;

    public MonHoc(String ma, String ten, int stc) {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getStc() {
        return stc;
    }
}

class HocPhan implements Comparable<HocPhan>{
    private String manhom, mamon;
    private int ngay, gio;
    private String ht, phong;
    private static int cnt = 1;
    private MonHoc mh;

    public HocPhan(String mamon, int ngay, int gio, String ht, String phong) {
        this.manhom = String.format("HP%03d", cnt++);
        this.mamon = mamon;
        this.ngay = ngay;
        this.gio = gio;
        this.ht = ht;
        this.phong = phong;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public MonHoc getMh() {
        return mh;
    }

    public String getHt() {
        return ht;
    }
    
    @Override
    public int compareTo(HocPhan o) {
        if(this.ngay != o.ngay){
            return Integer.compare(this.ngay, o.ngay);
        }
        if(this.gio != o.gio){
            return Integer.compare(this.gio, o.gio);
        }
        return this.ht.compareTo(o.ht);
    }

    @Override
    public String toString() {
        return manhom + " " + mh.getTen()+ " " + ngay + " " + gio + " " + phong;
    }
}

public class J07075_LichGiangDayTheoGiangVien {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while(n-->0){
            a.add(new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine())));
        }
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<HocPhan> b = new ArrayList<>();
        while(m-->0){
            String mamon = sc2.nextLine();
            int ngay = Integer.parseInt(sc2.nextLine());
            int kip = Integer.parseInt(sc2.nextLine());
            String ht = sc2.nextLine();
            String phong = sc2.nextLine();
            HocPhan c = new HocPhan(mamon, ngay, kip, ht, phong);
            for(MonHoc i : a){
                if(i.getMa().equals(mamon)){
                    c.setMh(i);
                    break;
                }
            }
            b.add(c);
        }
        Collections.sort(b);
        String ht = sc2.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + ht + ":");
        for(HocPhan i : b){
            if(i.getHt().equals(ht)){
                System.out.println(i);
            }
        }
    }
}


//2
//INT1449       
//Phat trien ung dung cho cac thiet bi di dong
//3
//INT13162
//Lap trinh voi Python
//3
//3
//INT13162
//5
//4
//Nguyen Trong Khanh
//102-A2
//INT1449
//2
//2
//Nguyen Hoang Anh
//105-A2
//INT13162
//5
//1
//Nguyen Hoang Anh
//102-A2
//Nguyen Hoang Anh

