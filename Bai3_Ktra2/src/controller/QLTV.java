/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.Bao;
import model.ChucNang;
import model.Sach;
import model.TaiLieu;

/**
 *
 * @author DELL
 */
public class QLTV implements ChucNang{
    private List<TaiLieu> list;

    public QLTV() {
        list = new ArrayList<>();
        Bao b1 = new Bao("Kim Dong", "13/13/2013", 130);
        b1.setMa();
        list.add(b1);
        Sach s1 = new Sach("Kim Dong", 200, "Tran Manh C", "Hay mua di", 220);
        s1.setMa();
        list.add(s1);
        Bao b2 = new Bao("Kim Dong", "12/12/2012", 120);
        b2.setMa();
        list.add(b2);
        Sach s2 = new Sach("Kim Dong", 220, "Tran Manh B", "Hay mua di", 200);
        s2.setMa();
        list.add(s2);
    }

    public QLTV(List<TaiLieu> list) {
        this.list = list;
    }
    
    private int timViTri(String ma){
        // neu tim thay thi tra ve i khong thi tra ve -1
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    private TaiLieu nhap(Scanner in){
        TaiLieu g = new TaiLieu();
        g.setTenNXB(in.nextLine());
        g.setSoBanPH(Integer.parseInt(in.nextLine()));
        return g;
    }

    @Override
    public void nhapSach(Scanner in) {
        TaiLieu g = nhap(in);
        Sach s = new Sach();
        s.setMa();
        s.setTenNXB(g.getTenNXB());
        s.setSoBanPH(g.getSoBanPH());
        s.setTenTG(in.nextLine());
        s.setTenSach(in.nextLine());
        s.setSoTrang(Integer.parseInt(in.nextLine()));
        list.add(s);
    }

    @Override
    public void nhapBao(Scanner in) {
        TaiLieu g = nhap(in);
        Bao b = new Bao();
        b.setMa();
        b.setTenNXB(g.getTenNXB());
        b.setSoBanPH(g.getSoBanPH());
        b.setNgayPH(in.nextLine());
        list.add(b);
    }

    @Override
    public void hienthiDS() {
        for(TaiLieu i : list){
            System.out.println(i);
        }
    }

    @Override
    public void xoa(String ma) {
        int pos = timViTri(ma);
        if(pos == -1){
            System.out.println("Khong tim thay");
        }else{
            list.remove(pos);
            System.out.println("Xoa Thanh Cong");
        }
    }

    @Override
    public void sua(String ma) {
        Scanner sc = new Scanner(System.in);
        for(int idx = 0; idx < list.size(); idx++){
            TaiLieu i = list.get(idx);
            if(i.getMa().equalsIgnoreCase(ma)){
                if(ma.contains("B-")){
                    Bao b = new Bao(sc.nextLine(), sc.nextLine(), sc.nextInt());
                    b.setMa(ma);
                    list.remove(idx);
                    list.add(idx, b);
                }else{
                    Sach s = new Sach(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                    s.setMa(ma);
                    list.remove(idx);
                    list.add(idx, s);
                }
                System.out.println("Sua thanh cong");
                hienthiDS();
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    @Override
    public void timTheoTenSach(String sach) {
        int k = 0;
        List<Sach> s = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                s.add((Sach) i);
            }
        }
        for(Sach i : s){
            if(i.getTenSach().equalsIgnoreCase(sach)){
                System.out.println(i);
                k++;
            }
        }
        if(k == 0){
            System.out.println("Khong tim thay");
        }
    }
    
    @Override
    public void timBaoTheoNgayPH(String ngay) {
        int check = 0;
        for(TaiLieu i : list){
            if(i.getMa().contains("B-")){
                Bao b = (Bao) i;
                if(b.getNgayPH().equalsIgnoreCase(ngay)){
                    System.out.println(b);
                    check = 1;
                }
            }
        }
        if(check == 0){
            System.out.println("Khong thay");
        }
    }

    @Override
    public void timBaoTuNamDenNam(int tu, int den) {
        int check = 0;
        for(TaiLieu i : list){
            if(i.getMa().contains("B-")){
                Bao b = (Bao) i;
                String[] a = b.getNgayPH().split("\\/");
                int nam = Integer.parseInt(a[2]);
                if(nam >= tu && nam <= den){
                    System.out.println(b);
                    check = 1;
                }
            }
        }
        if(check == 0){
            System.out.println("Khong thay");
        }
    }

    @Override
    public void sapxepSoBanPH() {
        list.sort(new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getSoBanPH() - o2.getSoBanPH();
            }
        });
    }

    @Override
    public void sapxepSachTheoTenTG() {
        List<Sach> s = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                s.add((Sach) i);
            }
        }
        s.sort(new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                String t1 = o1.getTenTG();
                String t2 = o2.getTenTG();
                String ten1 = t1.substring(t1.lastIndexOf(" ") + 1);
                String ten2 = t2.substring(t2.lastIndexOf(" ") + 1);
                return ten1.compareToIgnoreCase(ten2);
            }
        });
        for(Sach i : s){
            System.out.println(i);
        }
    }

    @Override
    public void sapxepBao2TTinh() {
        // sx theo ngayPH va so ban PH
        List<Bao> b = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                b.add((Bao) i);
            }
        }
        b.sort(new Comparator<Bao>(){
            @Override
            public int compare(Bao o1, Bao o2) {
                String[] c1 = o1.getNgayPH().split("\\/");
                String[] c2 = o2.getNgayPH().split("\\/");
                String b1 = c1[2] + c1[1] + c1[0];
                String b2 = c2[2] + c2[1] + c2[0];
                if(b1.equalsIgnoreCase(b2)){
                    return o1.getSoBanPH() - o2.getSoBanPH();
                }else{
                    return b1.compareToIgnoreCase(b2);
                }
            }
        });
        for(Bao i : b){
            System.out.println(i);
        }
    }

    @Override
    public void thongke1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void thongke2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
