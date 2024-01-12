package J06005_QuanLyBanHang1;

public class HoaDon {
    private static int cnt = 1;
    private String maHD;
    private KhachHang kh;
    private MatHang mh;
    private int sl;

    public HoaDon(int sl) {
        this.maHD = "HD" + String.format("%03d", cnt++);
        this.sl = sl;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    @Override
    public String toString() {
        return maHD + " " + kh.getTenKH() + " " + kh.getDc() + " " + mh.getTenMH() + " " + mh.getDvi() + " " + mh.getGm() + " " + mh.getGb() + " " + sl + " " + sl * mh.getGb();
    }
}
