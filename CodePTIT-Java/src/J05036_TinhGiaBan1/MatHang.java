package J05036_TinhGiaBan1;

public class MatHang {
    private String ma, ten, dvi;
    private int gianhap, vc, tt, gb;
    private int sl;
    private static int count = 1;
    
    public MatHang(String ten, String dvi, int gianhap, int sl) {
        this.ma = "MH" + String.format("%02d", count++);
        this.ten = ten;
        this.dvi = dvi;
        this.gianhap = gianhap;
        this.sl = sl;
        this.vc = Math.round(gianhap * sl * 0.05f);
        this.tt = gianhap * sl + this.vc;
        this.gb = Math.round(tt * 1.02f);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + vc + " " + tt + " " + gb;                
    }
}   
