package J05057_BangDiemTuyenSinh;

import java.text.DecimalFormat;

public class ThiSinh{
    private String ma, ten, trangthai;
    private double toan, ly, hoa, tong, uuTien;

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(ma.charAt(2) == '1'){
            this.uuTien = 0.5;
        }
        else if(ma.charAt(2) == '2'){
            this.uuTien = 1.0;
        }
        else{
            this.uuTien = 2.5;
        }
        this.tong = toan * 2 + ly + hoa + uuTien;
    }

    public double getTong() {
        return tong;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String chuanhoa(String s){
        String[] tmp = s.trim().split("\\s+");
        String res = "";
        for(String i : tmp){
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";     
        }
        return res;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + (new DecimalFormat().format(uuTien))  + " " + (new DecimalFormat().format(tong - uuTien)) + " " + trangthai;
    }
}
