package J06003_QuanLyBaiTapNhom1;

import java.util.ArrayList;

public class Nhom {
    private int ma;
    private static int sma = 1;
    private String detai;
    private ArrayList<SinhVien> sv;
    
    public Nhom(String detai) {
        this.ma = sma++;
        this.detai = detai;
        this.sv = new ArrayList<>();
    }

    public int getMa() {
        return ma;
    }

    public ArrayList<SinhVien> getSv() {
        return sv;
    }

    @Override
    public String toString() {
        String s = String.format("DANH SACH NHOM %d:\n", ma);
        for(SinhVien i : sv){
            s += (i.toString() + "\n");
        }
        s += String.format("Bai tap dang ky: %s", detai);
        return s;
    }
}
