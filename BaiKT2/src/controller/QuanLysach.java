/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.ChucNang;
import model.SachGiaoKhoa;
import model.SachHoc;
import model.SachThamKhao;

/**
 *
 * @author DELL
 */
public class QuanLysach implements ChucNang{
    List<SachHoc> list;

    public QuanLysach() {
        list = new ArrayList<>();
    }

    public List<SachHoc> getList() {
        return list;
    }

    public void setList(List<SachHoc> list) {
        this.list = list;
    }
    
    @Override
    public void nhapSachThamKhao(Scanner in) {
        SachThamKhao stk = new SachThamKhao();
        stk.setTen(in.nextLine());
        stk.setNhaXB(in.nextLine());
        stk.setMa();
        stk.setLoai(Boolean.parseBoolean(in.nextLine()));
        stk.setGia(Double.parseDouble(in.nextLine()));
        list.add(stk);
    }

    @Override
    public void nhapSachGiaoKhoa(Scanner in) {
        SachGiaoKhoa sgk = new SachGiaoKhoa();
        sgk.setTen(in.nextLine());
        sgk.setNhaXB(in.nextLine());
        sgk.setLop(Integer.parseInt(in.nextLine()));
        sgk.setTap(Integer.parseInt(in.nextLine()));
        sgk.setBaitap(Boolean.parseBoolean(in.nextLine()));
        sgk.setGia(Double.parseDouble(in.nextLine()));
        sgk.setMa();
        list.add(sgk);
    }

    @Override
    public void out() {
        for(SachHoc i : list){
            System.out.println(i);
        }
    }

    @Override
    public void sapXepSachGiaoKhoa() {
        
    }
    
}
