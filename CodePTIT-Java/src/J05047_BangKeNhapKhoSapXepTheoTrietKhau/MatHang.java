package J05047_BangKeNhapKhoSapXepTheoTrietKhau;

import java.util.HashMap;

public class MatHang implements Comparable<MatHang>{
    public static HashMap<String, Integer> map = new HashMap<>();
    private String ten, ma;
    private int sl, gia, trietkhau, tong;

    public MatHang(String ten, int sl, int gia) {
        this.ten = ten;
        String[] tmp = ten.toUpperCase().split("\\s+");
        String s = tmp[0].substring(0, 1) + tmp[1].substring(0, 1);
        if(map.containsKey(s)){
            map.put(s, map.get(s) + 1);
        }else{
            map.put(s, 1);
        }
        this.ma = s + String.format("%02d", map.get(s));
        this.sl = sl;
        this.gia = gia;
        if(this.sl > 10){
            this.trietkhau = this.sl * this.gia * 5 / 100;
        }else if(this.sl >= 8 && this.sl <= 10){
            this.trietkhau = this.sl * this.gia * 2 / 100;
        }else if(this.sl >= 5 && this.sl < 8){
            this.trietkhau = this.sl * this.gia * 1 / 100;
        }else{
            this.trietkhau = 0;
        }    
        this.tong = this.sl * this.gia - this.trietkhau;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + trietkhau + " " + tong;
    }

    @Override
    public int compareTo(MatHang arg0) {
        return Integer.compare(arg0.trietkhau, this.trietkhau);
    }
}
