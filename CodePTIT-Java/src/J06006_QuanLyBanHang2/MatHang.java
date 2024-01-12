package J06006_QuanLyBanHang2;

public class MatHang {
    private static int cnt = 1;
    private String maMH, tenMH, dvi;
    private int gm, gb;

    public MatHang(String tenMH, String dvi, int gm, int gb) {
        this.maMH = "MH" + String.format("%03d", cnt++);
        this.tenMH = tenMH;
        this.dvi = dvi;
        this.gm = gm;
        this.gb = gb;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDvi() {
        return dvi;
    }

    public int getGm() {
        return gm;
    }

    public int getGb() {
        return gb;
    }

    
}
