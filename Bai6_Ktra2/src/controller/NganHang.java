/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import model.ChucNang;
import model.GiaoDich;
import model.GiaoDichTT;
import model.GiaoDichVang;

/**
 *
 * @author tan
 */
public class NganHang implements ChucNang{
    List<GiaoDich> list;

    public NganHang() {
        list = new ArrayList<>();
        GiaoDichVang v = new GiaoDichVang("1/1/2022", 100, 10, "24k");
        v.setMa();
        list.add(v);
        v = new GiaoDichVang("12/10/2023", 200, 20, "9999");
        v.setMa();
        list.add(v);
        GiaoDichTT t = new GiaoDichTT("13/09/2022", 100, 10, 1, "VND");
        t.setMa();
        list.add(t);
    }
    
    private GiaoDich nhap(Scanner in){
        // ma,ngay,so luong , gia
        GiaoDich gd = new GiaoDich();
//        System.out.println("Nhap ngay gd:");
        gd.setNgay(in.nextLine());
//        System.out.println("Nhap gia:");
        gd.setGia(Double.parseDouble(in.nextLine()));
//        System.out.println("Nhap so luong:");
        gd.setSoluong(Integer.parseInt(in.nextLine()));
        return gd;
    }

    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDich gd = nhap(in);
        GiaoDichVang gdV = new GiaoDichVang();
        gdV.setMa();
        gdV.setNgay(gd.getNgay());
        gdV.setSoluong(gd.getSoluong());
        gdV.setGia(gd.getGia());
//        System.out.println("Nhap loai vang:");
        gdV.setLoai(in.nextLine());
        list.add(gdV);
    }

    @Override
    public void nhapGDTT(Scanner in) {
        GiaoDich gd = nhap(in);
        GiaoDichTT gdTT= new GiaoDichTT();
        gdTT.setMa();
        gdTT.setNgay(gd.getNgay());
        gdTT.setSoluong(gd.getSoluong());
        gdTT.setGia(gd.getGia());
//        System.out.println("Nhap loai tien:");
        gdTT.setLoaiTien(in.nextLine());
        double tg=1;
        if (gdTT.getLoaiTien().toUpperCase().equals("VND")){
            tg=1;
        }
        else {
            tg=Double.parseDouble(in.nextLine());
        }
        gdTT.setTigia(tg);
        list.add(gdTT);
    }

    @Override
    public void out() {
        for (GiaoDich i : list) {
            System.out.println(i);
        }
//        System.out.println("Tong:"+list.size());
    }
    
    private int getGDByMa(String ma){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1; // khong tim thay
    }

    @Override
    public void xoa(String ma) {
//        System.out.print("nhap ma can xoa:");
        int pos=getGDByMa(ma);
        if(pos==-1){
            System.out.println("thay dau ma xoa");
        }else{
            list.remove(pos);
            System.out.println("xoa thanh cong!!!");
        }
    }

    @Override
    public void sua(String ma) {
        Scanner in = new Scanner(System.in);
        for(int idx = 0; idx < list.size(); idx++){
            GiaoDich i = list.get(idx);
            if(i.getMa().equalsIgnoreCase(ma)){
                if(ma.contains("TT-")){
                    GiaoDichTT gdTT = new GiaoDichTT(in.next(), in.nextDouble(), in.nextInt(), in.next());
                    gdTT.setMa(ma);
                    list.remove(idx);
                    list.add(idx, gdTT);
                }else{
                    GiaoDichVang gdV = new GiaoDichVang(in.next(), in.nextDouble(), in.nextInt(), in.next());
                    gdV.setMa(ma);
                    list.remove(idx);
                    list.add(idx, gdV);
                }
                System.out.println("Sua thanh cong");
                out();
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    @Override
    public void timGDVangTuGiaDenGia(double tu, double den) {
        // tim 
        int check=0;
        for (GiaoDich i : list){
            if (i.getMa().contains("V-")){
                GiaoDichVang gdV = (GiaoDichVang) i;
                if (gdV.getGia()>=tu && gdV.getGia()<=den){
                    System.out.println(gdV);
                    check=1;
                }
            }
        }
        if (check==0) System.out.println("Khong tim thay");
    }

    @Override
    public void timTheoLoaiTien(String loai) {
        int check = 0;
        for(GiaoDich i : list){
            if(i.getMa().contains("TT-")){
                GiaoDichTT gdTT = (GiaoDichTT) i;
                if(gdTT.getLoaiTien().equalsIgnoreCase(loai)){
                    System.out.println(gdTT);
                    check = 1;
                }
            }
        }
        if(check == 0){
            System.out.println("Khong tim thay");
        }
    }
    
    @Override
    public void timTheoLoaiVang(String loai) {
        int check = 0;
        for(GiaoDich i : list){
            if(i.getMa().contains("V-")){
                GiaoDichVang gdV = (GiaoDichVang) i;
                if(gdV.getLoai().equalsIgnoreCase(loai)){
                    System.out.println(gdV);
                    check = 1;
                }
            }
        }
        if(check == 0){
            System.out.println("Khong tim thay");
        }
    }
    
    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                // tang dan
//                return o1.getMa().compareToIgnoreCase(o2.getMa());
                //giam dan
                return -o1.getMa().compareToIgnoreCase(o2.getMa());
            }
        });
    }

    @Override
    public void sapxepTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepVangTheoSoluong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepGDVangTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoNgay() {
        //chuyen ve dang nam/thang/ngay
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                String[] c1 = o1.getNgay().split("\\/");
                String[] c2 = o2.getNgay().split("\\/");
                String b1 = c1[2] + c1[1] + c1[0];
                String b2 = c2[2] + c2[1] + c2[0];
                return b2.compareTo(b1);
            }
        });
    }

    @Override
    public void sapxepTheoThanhTien() {
        //vang TT
        //vang
        List<GiaoDichVang> lvang = new ArrayList<>();
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lvang.add((GiaoDichVang)k);
            }
        }
        lvang.sort(new Comparator<GiaoDichVang>(){
            @Override
            public int compare(GiaoDichVang o1, GiaoDichVang o2) {
                return Double.compare(o1.getThanhTien(), o2.getThanhTien());
            }
        });
        for(GiaoDichVang i : lvang){
            System.out.println(i);
        }
    }
    
    // moi nam co bao nhieu giao dich
    @Override
    public void thongke() {
        Map<Integer, Long> c = list.stream().collect(
                Collectors.groupingBy(GiaoDich::getNam, Collectors.counting()));
        System.out.println(c);
        Iterator<Integer> i = c.keySet().iterator();
        while(i.hasNext()){
            Integer k = i.next();
            System.out.println(k + ":" + c.get(k));
        }
    }  
    
    // tinh tong so luong theo tung loai vang
    public void sumVangTheoLoai(){
        List<GiaoDichVang> lvang = new ArrayList<>();
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lvang.add((GiaoDichVang)k);
            }
        }
        Map<String, Integer> s = lvang.stream().collect(Collectors.groupingBy(GiaoDichVang::getLoai, Collectors.summingInt(GiaoDichVang::getSoluong)));
        System.out.println(s);
    }
    
    // dua ra vang co thanh tien cao nhat
    public void maxVang(){
        List<GiaoDichVang> lvang = new ArrayList<>();
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lvang.add((GiaoDichVang)k);
            }
        }
        Optional<GiaoDichVang> m = lvang.stream().collect(Collectors.maxBy(Comparator.comparing(GiaoDichVang::getThanhTien)));
        System.out.println(m.get());
    }
    
    //dua ra tien cao nhat theo tung loai vang
    public void maxVangTheoLoai(){
        List<GiaoDichVang> lvang = new ArrayList<>();
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lvang.add((GiaoDichVang)k);
            }
        }
        Map<String, GiaoDichVang> m = lvang.stream().collect(Collectors.groupingBy(GiaoDichVang::getLoai,Collectors.collectingAndThen(Collectors.reducing((GiaoDichVang v1, GiaoDichVang v2)->v1.getThanhTien() > v2.getThanhTien() ? v1:v2), Optional::get)));
        Iterator<String> i = m.keySet().iterator();
        while(i.hasNext()){
            String k = i.next();
            System.out.println(k);
            System.out.println(m.get(k));
        }
    }
    
    // xoa vang
    public void xoaVang(String loai){
        
    }
}
