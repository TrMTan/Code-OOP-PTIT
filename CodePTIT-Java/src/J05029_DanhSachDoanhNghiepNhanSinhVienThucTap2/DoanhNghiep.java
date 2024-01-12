package J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma, ten;
    private int soluong;

    public DoanhNghiep(String ma, String ten, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong;
    }

    @Override
    public int compareTo(DoanhNghiep arg0) {
        if(this.soluong != arg0.soluong){
            return -Integer.compare(this.soluong, arg0.soluong);
        } 
        return this.ma.compareTo(arg0.ma);
    }
}
