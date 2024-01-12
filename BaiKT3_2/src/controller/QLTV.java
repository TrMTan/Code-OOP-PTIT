/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import model.Bao;
import model.ChucNang;
import model.Sach;
import model.TaiLieu;

/**
 *
 * @author tan
 */
public class QLTV implements ChucNang{
    private List<TaiLieu> list; 
    
    private Scanner sc = new Scanner(System.in);
    
    public QLTV() {
        list = new ArrayList<>();
    }

    public void setList(List<TaiLieu> list) {
        this.list = list;
    }
    
    //tim tai lieu theo ma - tra ve vi tri
    private int timViTri(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    private TaiLieu nhap(){
        String ma, tenNXB;
        int soPH;
        String re = "^[ABCD]{1}\\d{3}";
        while(true){
            try{
                System.out.print("Ma: ");
                ma = sc.nextLine().toUpperCase();
                if(timViTri(ma) == -1 && ma.matches(re)){
                    break;
                }else{
                    throw new ValidException("Ma bi trung hoac khong dung dinh dang");
                }
            }catch(ValidException e){
                System.err.println(e);
            }
        }
        
        System.out.print("Ten NXB: ");
        tenNXB = sc.nextLine();
        
        while(true){
            try{
                System.out.print("So Ban PH: ");
                soPH = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        return (new TaiLieu(ma, tenNXB, soPH));
    }
    
    @Override
    public void nhapSach() {
        TaiLieu t = nhap();
        String tenTG, tenSach;
        int soTrang;
        
        System.out.print("Ten Sach: ");
        tenSach = sc.nextLine();
        
        System.out.print("Ten Tac Gia: ");
        tenTG = sc.nextLine();
        
        while(true){
            try{
                System.out.print("So Trang: ");
                soTrang = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.err.println(e);
            }
        }
        list.add(new Sach(t.getMa(), t.getTenNXB(), t.getSoBanPH(), tenTG, tenSach, soTrang));
    }

    @Override
    public void nhapBao() {
        TaiLieu t = nhap();
        String ngay;
        String re = "\\d{1,2}/\\d{1,2}/\\d{4}";
        while(true){
            try{
                System.out.print("Ngay phat hanh: ");
                ngay = sc.nextLine();
                if(ngay.matches(re)){
                    break;
                }else{
                    throw new ValidException("Ngay phat hanh khong dung dinh dang");
                }
            }catch(ValidException e){
                System.err.println(e);
            }
        }
        list.add(new Bao(t.getMa(), t.getTenNXB(), ngay, t.getSoBanPH()));
    }

    @Override
    public void hienthiDS() {
        for(TaiLieu i : list){
            System.out.println(i);
        }
        System.out.println("------------------------------");
        System.out.println("Tong: " + list.size());
    }

    @Override
    public void luu(String fname) {
        IOFile.ghi(fname, list);
    }

    @Override
    public void docra(String fname) {
        setList(IOFile.doc(fname));
    }

    @Override
    public void xoa() {
        System.out.print("Nhap vao ma can xoa: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if(vt == -1){
            System.out.println("Khong tim thay ma can xoa");
        }else{
            System.out.println("Tai lieu xoa: " + list.remove(vt));
            System.out.println("Xoa thanh cong!");
        }
    }

    @Override
    public void sua() {
        System.out.print("Nhap vao ma can sua: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if(vt == -1){
            System.out.println("Khong tim thay ma de sua");
        }else{
            TaiLieu t = list.get(vt);
            // sua phan chung
            System.out.print("Ten NXB: ");
            String tenNXB = sc.nextLine();
            int soPH;
            while(true){
                try{
                    System.out.print("So Ban PH: ");
                    soPH = Integer.parseInt(sc.nextLine());
                    break;
                }catch(NumberFormatException e){
                    System.err.println(e);
                }
            }
            t.setTenNXB(tenNXB);
            t.setSoBanPH(soPH);
            if(t instanceof Sach){
                //sua Sach
                String tenTG, tenSach;
                int soTrang;

                System.out.print("Ten Sach: ");
                tenSach = sc.nextLine();
                
                System.out.print("Ten Tac Gia: ");
                tenTG = sc.nextLine();
                
                while(true){
                    try{
                        System.out.print("So Trang: ");
                        soTrang = Integer.parseInt(sc.nextLine());
                        break;
                    }catch(NumberFormatException e){
                        System.err.println(e);
                    }
                }
                ((Sach) t).setTenSach(tenSach);
                ((Sach) t).setTenTG(tenTG);
                ((Sach) t).setSoTrang(soTrang);
            }
            if(t instanceof Bao){
                // sua Bao
                String ngay;
                String re = "\\d{1,2}/\\d{1,2}/\\d{4}";
                while(true){
                    try{
                        System.out.print("Ngay phat hanh: ");
                        ngay = sc.nextLine();
                        if(ngay.matches(re)){
                            break;
                        }else{
                            throw new ValidException("Ngay phat hanh khong dung dinh dang");
                        }
                    }catch(ValidException e){
                        System.err.println(e);
                    }
                }
                ((Bao) t).setNgayPH(ngay);
            }
            System.out.println("Sua thanh cong!");
        }
    }

    @Override
    public void timTheoTenSach() {
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach) i);
            }
        }
        System.out.print("Nhap ten can tim: ");
        String ten = sc.nextLine();
        int k = 0;
        for(Sach i : sach){
            if(i.getTenSach().toLowerCase().indexOf(ten.toLowerCase()) >= 0){
                System.out.println(i);
                k++;
            }
        }
        if(k == 0){
            System.out.println("Khong tim thay cuon nao!");
        }else System.out.println("Tong sach tim thay: " + k);
    }

    @Override
    public void timBaoTuNamDenNam() {
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao) i);
            }
        }
        try{
            System.out.print("Nhap tu nam: ");
            int nam1 = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap den nam: ");
            int nam2 = Integer.parseInt(sc.nextLine());
            int k = 0;
            for(Bao i : bao){
                if(i.getNam() >= nam1 && i.getNam() <= nam2){
                    System.out.println(i);
                    k++;
                }
            }
            if(k == 0){
                System.out.println("Khong tim thay cuon nao!");
            }else{
                System.out.println("Tong so bao tim thay: " + k);
            }
        }catch(NumberFormatException e){
            System.err.println(e);
        }
    }

    @Override
    public void sapxepSoBanPH() {
        Collections.sort(list);
        hienthiDS();
    }

    @Override
    public void sapxepSachTheoTenTG() {
        //lay ds sach ra - sap xep sach
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach) i);
            }
        }
        sach.sort(new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                // trat tu lai tenHovaTen
                String ten1 = o1.getTenTG();
                String ten2 = o2.getTenTG();
                String t1 = ten1.substring(ten1.lastIndexOf(" ") + 1);
                String t2 = ten2.substring(ten2.lastIndexOf(" ") + 1);
                return t1.compareToIgnoreCase(t2);
            }
            
        });
        for(Sach i : sach){
            System.out.println(i);   
        }
        System.out.println("Tong so sach: " + sach.size());
    }

    @Override
    public void sapxepBao2TTinh() {
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao) i);
            }
        }
        // sap xep theo ngay PH va so ban PH
        bao.sort(new Comparator<Bao>(){
            @Override
            public int compare(Bao o1, Bao o2) {
                //nam/thang/ngay
                StringTokenizer n1 = new StringTokenizer(o1.getNgayPH());
                StringTokenizer n2 = new StringTokenizer(o2.getNgayPH());
                String ng1 = "";
                while(n1.hasMoreTokens()){
                    ng1 = n1.nextToken() + ng1;
                }
                
                String ng2 = "";
                while(n2.hasMoreTokens()){
                    ng2 = n2.nextToken() + ng2;
                }
                
                if(ng1.equalsIgnoreCase(ng2)){
                    return o1.getSoBanPH() - o2.getSoBanPH();
                }else{
                    return ng1.compareToIgnoreCase(ng2);
                }
            }
        });
        for(Bao i : bao){
            System.out.println(i);
        }
        System.out.println("Tong so bao: " + bao.size());
    }

    @Override
    public void thongke1() {
        Map<String, Long> count = list.stream().collect(Collectors.groupingBy(tl -> tl.getTenNXB().toLowerCase(), Collectors.counting()));
        Iterator i = count.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key + ": " + count.get(key));
        }
    }
    
    //sum
    @Override
    public void thongke2() {
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao) i);
            }
        }
        Map<Integer, Integer> sum = bao.stream().collect(Collectors.groupingBy(Bao::getNam, Collectors.summingInt(Bao::getSoBanPH)));
        Iterator i = sum.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key + ": " + sum.get(key));
        }
    }
    //max
    public void thongke3() {
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach) i);
            }
        }
        Optional<Sach> max = sach.stream().collect(Collectors.maxBy(Comparator.comparing(Sach::getSoTrang)));
        System.out.println("Sach co so trang lon nhat: ");
        System.out.println(max.isPresent() ? max.get(): "Khong ton tai");
    }
    
    //max group: sach co so trang lon nhat theo NXH
    public void thongke4() {
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach) i);
            }
        }
        Map<String, Sach> max = sach.stream().collect(Collectors.groupingBy(Sach::getTenNXB, Collectors.collectingAndThen(Collectors.reducing((Sach s1, Sach s2) -> s1.getSoTrang() > s2.getSoTrang()?s1:s2), Optional::get)));
        Iterator i = max.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key + ": " + max.get(key));
        }
    }
    
    //max so phat hanh theo cac nam bao
    public void thongke5() {
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao) i);
            }
        }
        Map<Integer, Bao> max = bao.stream().collect(Collectors.groupingBy(Bao::getNam, Collectors.collectingAndThen(Collectors.reducing((Bao s1, Bao s2) -> s1.getSoBanPH() > s2.getSoBanPH()?s1:s2), Optional::get)));
        Iterator i = max.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key + ": " + max.get(key));
        }
    }
}
