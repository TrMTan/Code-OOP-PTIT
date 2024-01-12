/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class DanhSach implements Serializable{
    private DichVu dichvu;
    private NhanVien nhanvien;
    private int sl;

    public DanhSach() {
    }

    public DanhSach(DichVu dichvu, NhanVien nhanvien, int sl) {
        this.dichvu = dichvu;
        this.nhanvien = nhanvien;
        this.sl = sl;
    }

    public DichVu getDichvu() {
        return dichvu;
    }

    public void setDichvu(DichVu dichvu) {
        this.dichvu = dichvu;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public Object[] toObjects() {
        return new Object[] {
            nhanvien.getMa(), nhanvien.getHoten(), dichvu.getMa(), dichvu.getTen(), sl
        };
    }
}
