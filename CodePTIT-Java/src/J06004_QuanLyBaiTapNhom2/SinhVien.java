package J06004_QuanLyBaiTapNhom2;

public class SinhVien implements Comparable<SinhVien>{
    private String msv, ht, sdt;
    private int sttn;
    private Nhom nhom;

    public SinhVien(String msv, String ht, String sdt, int sttn) {
        this.msv = msv;
        this.ht = ht;
        this.sdt = sdt;
        this.sttn = sttn;
    }

    public int getSttn() {
        return sttn;
    }

    public void setNhom(Nhom nhom) {
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return msv + " " + ht + " " + sdt + " " +sttn + " " + nhom.getDetai();
    }

    @Override
    public int compareTo(SinhVien arg0) {
        return this.msv.compareTo(arg0.msv);
    }
}
