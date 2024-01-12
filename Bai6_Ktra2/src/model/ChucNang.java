/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public interface ChucNang {
    public void nhapGDVang(Scanner in);
    public void nhapGDTT(Scanner in);
    public void out();
    public void xoa(String ma);
    //sua, xoa, timkiem, sap xep (de, kong kenh)
    public void sua(String ma);
    public void timTheoLoaiVang(String loai);
    public void timGDVangTuGiaDenGia(double tu, double den);
    public void timTheoLoaiTien(String loai);
    public void sapxepTheoMa();
    public void sapxepTheoGia();
    public void sapxepVangTheoSoluong();
    public void sapxepGDVangTheoGia();
    public void sapxepTheoNgay();
    public void sapxepTheoThanhTien();
    //cau thong ke
    public void thongke();
}
