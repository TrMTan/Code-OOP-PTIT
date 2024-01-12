
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class Mon {
    private String ma, ten;
    
    public Mon() {
    }
    
    public Mon(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public Mon(Mon o) {
        this.ma = o.ma;
        this.ten = o.ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}

class GiangVien {
    private String ma, ht;

    public GiangVien() {
    }
    
    public GiangVien(GiangVien o) {
        this.ma = o.ma;
        this.ht = o.ht;
    }
    
    public GiangVien(String ma, String ht) {
        this.ma = ma;
        this.ht = ht;
    }

    public String getMa() {
        return ma;
    }

    public String getHt() {
        return ht;
    }
}

class HocPhan {
    private String magv, mamon;
    private double hour;

    public HocPhan(HocPhan o) {
        this.magv = o.magv;
        this.mamon = o.mamon;
        this.hour = o.hour;
    }
    
    public HocPhan(String magv, String mamon, double hour) {
        this.magv = magv;
        this.mamon = mamon;
        this.hour = hour;
    }

    public String getMagv() {
        return magv;
    }

    public String getMamon() {
        return mamon;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour += hour;
    }
}

class LopHoc {
    private Mon mh;
    private GiangVien gv;
    private HocPhan hp;

    public LopHoc(Mon mh, GiangVien gv, HocPhan hp) {
        this.mh = mh;
        this.gv = gv;
        this.hp = hp;
    }

    public Mon getMh() {
        return mh;
    }

    public GiangVien getGv() {
        return gv;
    }

    public HocPhan getHp() {
        return hp;
    }
}

public class J06008_TinhGioChuanChoTungGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mon> a = new ArrayList<>();
        while(n-->0){
            String s1 = sc.nextLine();
            String[] a1 = s1.split("\\s+");
            String tenmon = "";
            for(int i = 1; i < a1.length; i++){
                tenmon += a1[i] + " ";
            }
            a.add(new Mon(a1[0], tenmon.trim()));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> b = new ArrayList<>();
        while(m-->0){
            String s2 = sc.nextLine();
            String[] a2 = s2.split("\\s+");
            String tengv = "";
            for(int i = 1; i < a2.length; i++){
                tengv += a2[i] + " ";
            }
            b.add(new GiangVien(a2[0], tengv.trim()));
        }
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<LopHoc> c = new ArrayList<>();
        ArrayList<LopHoc> c2 = new ArrayList<>();
        while(k-->0){
            String s3 = sc.nextLine();
            String[] a3 = s3.split("\\s+");
            HocPhan hp = new HocPhan(a3[0], a3[1], Double.parseDouble(a3[2]));
            Mon mon = new Mon();
            for(Mon i : a){
                if(hp.getMamon().equals(i.getMa())){
                    mon = i;
                    break;
                }
            }
            GiangVien gv = new GiangVien();
            for(GiangVien i : b){
                if(hp.getMagv().equals(i.getMa())){
                    gv = i;
                    break;
                }
            }
            boolean flag = false;
            for(LopHoc i : c){
                if(i.getGv().getMa().equals(hp.getMagv())){
                    flag = true;
                    i.getHp().setHour(Double.parseDouble(a3[2]));
                    break;
                }
            }
            
            c2.add(new LopHoc(new Mon(mon), new GiangVien(gv), new HocPhan(hp)));
            
            if(!flag){
                LopHoc lophoc = new LopHoc(mon, gv, hp);
                c.add(lophoc);
            }
        }
        String s = sc.nextLine();
        for(LopHoc i : c){
            if(i.getGv().getMa().equals(s)){
                System.out.println("Giang vien: " + i.getGv().getHt());
                for(LopHoc j : c2){
                    if(j.getGv().getMa().equals(s)){
                        System.out.println(j.getMh().getTen() + " " + j.getHp().getHour());
                    }
                }
                System.out.println("Tong: " + String.format("%.02f", i.getHp().getHour()));
            }
        }
    }
}


//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01