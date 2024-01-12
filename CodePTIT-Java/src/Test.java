
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

class SanPham {
    private String maSP, tenSP;
    private int dg1, dg2;

    public SanPham(String maSP, String tenSP, int dg1, int dg2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dg1 = dg1;
        this.dg2 = dg2;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getDg1() {
        return dg1;
    }

    public int getDg2() {
        return dg2;
    }
}

class HoaDon {
    private String maHD;
    private static int cnt = 1;
    private int sl;
    private int giamgia, tientra;
    private SanPham sp;

    public HoaDon(String maHD, int sl) {
        this.maHD = String.format("%s-%03d", maHD, cnt++);
        this.sl = sl;
        this.giamgia = 0;
    }

    public String getMaHD() {
        return maHD;
    }
    
    public void setSP(SanPham sp, char c){
        this.sp = sp;
        int loaigia = 0;
        if(c == '1'){
            loaigia = sp.getDg1();
        }else {
            loaigia = sp.getDg2();
        }
        int gia = sl * loaigia;
        if(sl >= 150){
            giamgia = (int) (gia * 0.5);
        }else if(sl >= 100){
            giamgia = (int) (gia * 0.3);
        }else if(sl >= 50){
            giamgia = (int) (gia * 0.15);
        }
        this.tientra = gia - giamgia;
    }

    @Override
    public String toString() {
        return maHD + " " + sp.getTenSP() + " " + giamgia + " " + tientra;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        while(n-->0){
            a.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> b = new ArrayList<>();
        while(m-->0){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            b.add(new HoaDon(tmp[0],Integer.parseInt(tmp[1])));
        }
        for(HoaDon i : b){
            for(SanPham j : a){
                if(j.getMaSP().equals(i.getMaHD().substring(0, 2))){
                    i.setSP(j, i.getMaHD().charAt(2));
                    break;
                }
            }
        }
        for(HoaDon i : b){
            System.out.println(i);
        }
    }
}

//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105