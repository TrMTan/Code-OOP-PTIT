/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04015_TinhThuNhapGiaoVien;

/**
 *
 * @author tan
 */
public class GiaoVien {
    private String id, ht;
    private long luongcb, bacluong, phucap, thunhap;

    public GiaoVien(String id, String ht, long luongcb) {
        this.id = id;
        this.ht = ht;
        this.luongcb = luongcb;
        if(id.charAt(1) == 'T'){
            this.phucap = 2000000;
        }else if(id.charAt(1) == 'P'){
            this.phucap = 900000;
        }else if(id.charAt(1) == 'V'){
            this.phucap = 500000;
        }
        this.bacluong = 0;

        for (int i = 2; i < 4; ++i)
            this.bacluong = this.bacluong * 10 + (this.id.charAt(i) - '0');
        
        this.thunhap = this.luongcb * this.bacluong + this.phucap;
    }

    public String getId() {
        return id;
    }

    public String getHt() {
        return ht;
    }

    public long getLuongcb() {
        return luongcb;
    }

    public long getBacluong() {
        return bacluong;
    }

    public long getPhucap() {
        return phucap;
    }

    public long getThunhap() {
        return thunhap;
    }
}
