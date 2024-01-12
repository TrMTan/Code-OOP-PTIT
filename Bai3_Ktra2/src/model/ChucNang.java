/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public interface ChucNang {
    public void nhapSach(Scanner in);
    public void nhapBao(Scanner in);
    public void hienthiDS();
    public void xoa(String ma);
    public void sua(String ma);
    public void timTheoTenSach(String sach);
    public void timBaoTheoNgayPH(String ngay);
    public void timBaoTuNamDenNam(int tu, int den);
    public void sapxepSoBanPH();
    public void sapxepSachTheoTenTG();
    public void sapxepBao2TTinh();
    public void thongke1();
    public void thongke2();   
}
