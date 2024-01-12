/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.NgayGuiException;
import controller.SoThangGuiException;
import controller.TienGuiException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class STK implements Serializable{
    private KhachHang kh;
    private NganHang nh;
    private int tiengui, sothanggui;
    private String ngaygui;

    public STK() {
    }

    public STK(KhachHang kh, NganHang nh, int tiengui, int sothanggui, String ngaygui) throws SoThangGuiException, NgayGuiException, TienGuiException {
        if(!(sothanggui >= 1 && sothanggui <= 12)) throw new SoThangGuiException();
        if(!ngaygui.matches("\\d{2}/\\d{2}/\\d{4}")) throw new NgayGuiException();
        if(tiengui <= 0) throw new TienGuiException();
        this.kh = kh;
        this.nh = nh;
        this.tiengui = tiengui;
        this.sothanggui = sothanggui;
        this.ngaygui = ngaygui;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public NganHang getNh() {
        return nh;
    }

    public void setNh(NganHang nh) {
        this.nh = nh;
    }

    public int getTiengui() {
        return tiengui;
    }

    public void setTiengui(int tiengui) {
        this.tiengui = tiengui;
    }

    public int getSothanggui() {
        return sothanggui;
    }

    public void setSothanggui(int sothangui) {
        this.sothanggui = sothangui;
    }

    public String getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        this.ngaygui = ngaygui;
    }

    public Object[] toObjects(){
        return new Object[]{
            kh.getMa(), kh.getHt(), nh.getMa(), nh.getTenNH(), tiengui, sothanggui, ngaygui
        };
    }
}
