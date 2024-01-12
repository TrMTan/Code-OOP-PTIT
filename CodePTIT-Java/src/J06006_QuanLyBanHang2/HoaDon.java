package J06006_QuanLyBanHang2;

public class HoaDon implements Comparable<HoaDon>{
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

    public int getLoiNhuan(){
        return sl * (mh.getGb() - mh.getGm());
    }

    @Override
    public String toString() {
        return maHD + " " + kh.getTenKH() + " " + kh.getDc() + " " + mh.getTenMH() + " " + sl + " " + sl * mh.getGb() + " " + getLoiNhuan();
    }

    @Override
    public int compareTo(HoaDon arg0) {
        return -Integer.compare(this.getLoiNhuan(), arg0.getLoiNhuan());
    }
}
