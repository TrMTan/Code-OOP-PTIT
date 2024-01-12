package DanhSachMonHoc;

public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int soTinChi, kyHoc;

    public MonHoc(String ma, String ten, int soTinChi, int kyHoc) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
        this.kyHoc = kyHoc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soTinChi + " " + kyHoc;
    }

    @Override
    public int compareTo(MonHoc arg0) {
        int semesterCompare = Integer.compare(this.kyHoc, arg0.kyHoc);
        if (semesterCompare != 0) {
            return semesterCompare;
        } else {
            return this.ten.compareTo(arg0.ten);
        }
    }
}
