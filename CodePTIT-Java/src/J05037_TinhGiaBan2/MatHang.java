package J05037_TinhGiaBan2;

public class MatHang implements Comparable<MatHang> {
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
        this.gb = (int) Math.ceil((tt * 1.02f / sl) / 100) * 100;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + vc + " " + tt + " " + gb;                
    }

    @Override
    public int compareTo(MatHang arg0) {
        return -Integer.compare(this.gb, arg0.gb);
    }
}   
