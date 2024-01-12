package J07053_XetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThiSinh {
    private String ht, ma, loai;
    private Date ns;
    private int tuoi;
    private double lt, th, thuong, tb;
    private static int cnt = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ThiSinh(String ht, String ns, double lt, double th) throws ParseException{
        this.ma = String.format("PH%02d", cnt++);
        this.ht = chuanhoa(ht);
        this.ns = sdf.parse(ns);
        this.tuoi = 2021 - this.ns.getYear() - 1900;
        this.lt = lt;
        this.th = th;
        if(lt >= 8 && th >= 8){
            this.thuong = 1.0;
        }else if(lt >= 7.5 && th >= 7.5){
            this.thuong = 0.5;
        }
        this.tb = (int) Math.min(10, Math.round((lt + th) / 2 + thuong));
        if(tb > 10){
            this.tb = 10;
        }
        else if(tb >= 9 && tb <= 10){
            this.loai = "Xuat sac";
        }else if(tb >= 8){
            this.loai = "Gioi";
        }else if(tb >= 7){
            this.loai = "Kha";
        }else if(tb >= 5){
            this.loai = "Trung binh";
        }else{
            this.loai = "Truot";
        }
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
        return ma + " " + ht + tuoi + " " + String.format("%.0f", tb)+ " " + loai;
    } 
}
