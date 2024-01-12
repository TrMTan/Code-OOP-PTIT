package J07025_DanhSachKhachHangTrongFile;

import java.util.Comparator;

public class KhachHang implements Comparator<KhachHang> {
    private String ma, ht, gt, ns, dc;
    private static int cnt = 1;

    public KhachHang() {
    }

    public KhachHang(String ht, String gt, String ns, String dc) {
        this.ma = String.format("KH%03d", cnt++);
        this.ht = chuanhoa(ht);
        this.gt = gt;
        this.ns = sua(ns);
        this.dc = dc;
    }

    private String sua(String ns) {
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        return sb.toString();
    }

    private String chuanhoa(String s) {
        String[] tmp = s.trim().split("\\s+");
        String a = "";
        for(String i : tmp){
            a += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return a;
    }

    @Override
    public String toString() {
        return ma + " " + ht + gt + " " + dc + " " + ns;
    }

    @Override
    public int compare(KhachHang arg0, KhachHang arg1) {
        String[] tmp0 = arg0.ns.split("/");
        String[] tmp1 = arg1.ns.split("/");
        String s1 = tmp0[2] + tmp0[1] + tmp0[0];
        String s2 = tmp1[2] + tmp1[1] + tmp1[0];
        return s1.compareTo(s2);
    }
}
