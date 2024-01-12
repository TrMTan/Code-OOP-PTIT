package J07059_DanhSachCaThi;

import java.text.SimpleDateFormat;

public class CaThi implements Comparable<CaThi>{
    private String ma, ngayt, giot, pt;
    private static int cnt = 1;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    public CaThi(String ngayt, String giot, String pt) {
        this.ma = String.format("C%03d", cnt++);
        this.ngayt = ngayt;
        this.giot = giot;
        this.pt = pt;
    }

    @Override
    public String toString() {
        return ma + " " + ngayt + " " + giot + " " + pt;
    }

    @Override
    public int compareTo(CaThi arg0) {
        try {
            long x = sdf.parse(this.ngayt + " " + this.giot).getTime(); // chuyen ve milisecond
            long y = sdf.parse(arg0.ngayt + " " + arg0.giot).getTime(); // chuyen ve milisecond
            if(x != y){
                return Long.compare(x, y); // so sanh 2 so long
            }
            return this.ma.compareTo(arg0.ma); // so sanh 2 ma
        } catch (Exception e) {
            return 0;
        }
    }
}
