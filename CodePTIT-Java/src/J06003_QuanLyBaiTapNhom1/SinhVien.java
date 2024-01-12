package J06003_QuanLyBaiTapNhom1;

public class SinhVien {
    private String msv, ht, sdt;
    private int sttn;

    public SinhVien(String msv, String ht, String sdt, int sttn) {
        this.msv = msv;
        this.ht = ht;
        this.sdt = sdt;
        this.sttn = sttn;
    }

    public int getSttn() {
        return sttn;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + sdt;
    }
}
