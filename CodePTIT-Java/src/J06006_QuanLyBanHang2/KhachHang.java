package J06006_QuanLyBanHang2;

public class KhachHang {
    private static int cnt = 1;
    private String maKH, tenKH, gt, ns, dc;

    public KhachHang(String tenKH, String gt, String ns, String dc) {
        this.maKH = "KH" + String.format("%03d", cnt++);
        this.tenKH = tenKH;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDc() {
        return dc;
    }

    
}
