package J05034_DanhSachThucTap1;

public class SinhVien implements Comparable<SinhVien> {
    private String stt, maSV, tenSV, lop, email, doanhNghiep;
    private static int cnt = 1;

    public SinhVien(String maSV, String tenSV, String lop, String email, String doanhNghiep) {
        this.stt = String.format("%d", cnt++);
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    @Override
    public String toString() {
        return stt + " " + maSV + " " + tenSV + " " + lop + " " + email + " " + doanhNghiep;
    }

    @Override
    public int compareTo(SinhVien arg0) {
        return this.tenSV.compareTo(arg0.tenSV);
    }
}
