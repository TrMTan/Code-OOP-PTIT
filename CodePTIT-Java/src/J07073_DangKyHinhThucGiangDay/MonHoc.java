package J07073_DangKyHinhThucGiangDay;

public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, lt, th;
    private int soTinChi;
    public MonHoc(String ma, String ten, int soTinChi, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.lt = lt;
        this.th = th;
        this.soTinChi = soTinChi;
    }

    public String getTh() {
        return th;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soTinChi + " " + lt + " " + th;
    }

    @Override
    public int compareTo(MonHoc arg0) {
        return this.ma.compareTo(arg0.ma);
    }
}
