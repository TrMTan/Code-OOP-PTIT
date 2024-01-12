/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.PTGT;

/**
 *
 * @author tan
 */
public class QLPT {

    private List<PTGT> list;

    Scanner sc = new Scanner(System.in);

    public QLPT() {
        list = new ArrayList<>();
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }

//    check ma trung
    private int vitri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    // nhap PTGT
    public void nhap() {
        String re = "^[AB]{1}\\d{4}";
        String ma, hang, mau;
        int nam;
        double gia;
        while (true) {
            try {
                System.out.print("Ma: ");
                ma = sc.nextLine().toUpperCase();
                if ((vitri(ma) == -1) && ma.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Trung ma hoa khong dung dinh dang");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        System.out.print("Hang: ");
        hang = sc.nextLine();
        while (true) {
            try {
                System.out.print("Nam: ");
                nam = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.print("Nhap 4 so!");
            }
        }
        while (true) {
            try {
                System.out.print("Gia: ");
                gia = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.print("Nhap so thuc!");
            }
        }
        System.out.print("Mau sac: ");
        mau = sc.nextLine();
        list.add(new PTGT(ma, hang, nam, gia, mau));
    }

    public void hienthi() {
        System.out.println("DS PTGT: ");
        for (PTGT i : list) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        System.out.println("Tong so: " + list.size());
    }

    public void luu(String fname) {
        IOFile.ghi(fname, list);
    }

    public void doc(String fname) {
        setList(IOFile.doc(fname));
    }

    //tim theo hang
    public void timTheoHang() {
        int t = 0;
        System.out.print("Nhap vao hang can tim: ");
        String key = sc.nextLine();
        for (PTGT p : list) {
            if (p.getHang().toLowerCase().indexOf(key.toLowerCase()) >= 0) {
                System.out.println(p);
                t++;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao");
        }
    }

    //tim theo mau
    public void timTheoMau() {
        int t = 0;
        System.out.print("Nhap vao mau can tim: ");
        String mau = sc.nextLine();
        for (PTGT p : list) {
            if (p.getMau().toLowerCase().indexOf(mau.toLowerCase()) >= 0) {
                System.out.println(p);
                t++;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao");
        }
    }

    // tim theo gia
    public void timTheoGia() {
        int t = 0;
        double gt, gd;
        while (true) {
            try {
                System.out.print("Nhap gia tu: ");
                gt = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap gia den: ");
                gd = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap vao gia la so!");
            }
        }
        for (PTGT p : list) {
            if (p.getGia() >= gt && p.getGia() <= gd) {
                System.out.println(p);
                t++;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao");
        }
    }

    public void xoa() {
        System.out.print("Nhap ma can xoa: ");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Kkhong tim thay phuong tien co ma: " + ma);
        } else {
            PTGT p = list.remove(vt);
            System.out.println(p);
        }
    }

    public void sua() {
        System.out.print("Nhap ma PT can sua: ");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay PT co ma " + ma + " de sua!");
        } else {
            PTGT p = list.get(vt);
            String hang, mau;
            int nam;
            double gia;
            System.out.print("Hang moi: ");
            hang = sc.nextLine();
            while (true) {
                try {
                    System.out.print("Nam moi: ");
                    nam = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.print("Nhap 4 so!");
                }
            }
            while (true) {
                try {
                    System.out.print("Gia moi: ");
                    gia = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.print("Nhap so thuc!");
                }
            }
            System.out.print("Mau sac moi: ");
            mau = sc.nextLine();
            p.setHang(hang);
            p.setNam(nam);
            p.getGia();
            p.setMau(mau);
            System.out.println("Sua thanh cong!");
        }
    }
    
    // sap xep theo nam tang dan
    public void sxTheoNam(){
        Collections.sort(list);
    }
    
    // sap xep theo ten hang
    public void sxTheoHang(){
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                // tang dan
                return o1.getHang().compareToIgnoreCase(o2.getHang());
                
                // giam dan
//                return o2.getHang().compareToIgnoreCase(o1.getHang());
            }
        });
    }
    
    //sx theo hang va gia
    public void sxTheoHangvaGia(){
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                if(o1.getHang().equals(o2.getHang())){
                    return Double.compare(o1.getGia(), o2.getGia());
                }else{
                    return o1.getHang().compareToIgnoreCase(o2.getHang());
                }
            }
        });
    }
}

