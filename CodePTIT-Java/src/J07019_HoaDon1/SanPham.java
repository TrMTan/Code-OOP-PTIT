package J07019_HoaDon1;

public class SanPham {
    private String maSP, tenSP;
    private int gial1, gial2;

    public SanPham(String maSP, String tenSP, int gial1, int gial2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gial1 = gial1;
        this.gial2 = gial2;
    }
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getGial1() {
        return gial1;
    }

    public int getGial2() {
        return gial2;
    }
}
