package ThucHanhBuoi3.TinhTienChoiGame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private static int count = 0;
    String maKhachHang;
    private String ten;
    private String tenMay;
    private String gioVao;
    private String gioRa;
    private double tienDoAnUong;
    private int soGioChoi;
    private double thanhTien;

    KhachHang(String ten, String tenMay, String gioVao, String gioRa, double tienDoAnUong) throws ParseException {
        this.setTen(chuanHoaTen(ten));
        this.setTenMay(tenMay);
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.tienDoAnUong = tienDoAnUong;
        this.maKhachHang = "KH" + String.format("%02d", ++count);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1 = format.parse(gioVao);
        Date date2 = format.parse(gioRa);
        long difference = date2.getTime() - date1.getTime();
        this.setSoGioChoi((int) Math.ceil(difference / (60.0 * 60 * 1000)));
        double donGia;
        switch (tenMay.toLowerCase()) {
            case "hacom poseidom":
                donGia = 100000;
                break;
            case "asus rog":
                donGia = 40000;
                break;
            case "dell inspiron":
                donGia = 70000;
                break;
            default:
                donGia = 0;
                break;
        }
        this.setThanhTien(getSoGioChoi() * donGia + tienDoAnUong);
        if(tenMay.toLowerCase().equals("asus rog")){
            this.setThanhTien(this.getThanhTien() - 200000);
        }
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoGioChoi() {
        return soGioChoi;
    }

    public void setSoGioChoi(int soGioChoi) {
        this.soGioChoi = soGioChoi;
    }

    String chuanHoaTen(String ten) {
        String[] words = ten.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return maKhachHang + " " + ten + " " + tenMay + " " + soGioChoi + " " + String.format("%.0f", thanhTien);
    }
}