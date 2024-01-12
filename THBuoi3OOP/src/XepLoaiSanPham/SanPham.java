package XepLoaiSanPham;

public class SanPham {
    private String ma, ten, loai, xepLoai;
    private int soLuong;
    private double donGia, thanhTien;
    private static int cnt = 1;

    public SanPham(String ten, String loai, int soLuong, double donGia) {
        this.ma = String.format("%s%03d",loai, cnt++);
        this.ten = ten;
        this.loai = loai;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = tinhtien();
        this.xepLoai = xeploaiban(); 
    }

    private String xeploaiban() {
        if (soLuong < 30) {
            return "ngung ban";
        } else if (soLuong <= 50) {
            return "ban";
        } else {
            return "ban nhanh";
        }
    }

    private double tinhtien() {
        double discount = loai.equals("A") ? 0.9 : (loai.equals("B") ? 0.95 : 1);
        return soLuong * donGia * discount;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + loai + " " + soLuong + " " + donGia + " " + thanhTien + " " + xepLoai;
    }
}
