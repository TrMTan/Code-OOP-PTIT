package J07051_TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>
{
    private String tenKH, maKH, soPhong;
    private Date nhanPhong, traPhong;
    private int tienDV, donGia, thanhTien, soNgay;
    private static int cnt = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public KhachHang(String tenKH, String soPhong, String nhanPhong, String traPhong, int tienDV) throws ParseException
    {
        this.maKH = String.format("KH%02d", cnt++);
        this.tenKH = chuanhoa(tenKH);
        this.soPhong = soPhong;
        this.nhanPhong = sdf.parse(nhanPhong);
        this.traPhong = sdf.parse(traPhong);
        this.tienDV = tienDV;
        
        soNgay = (int) (ChronoUnit.DAYS.between(this.nhanPhong.toInstant(), this.traPhong.toInstant()) + 1);
        switch (soPhong.charAt(0))
        {
            case '1':
                donGia = 25;
                break;
            case '2':
                donGia = 34;
                break;
            case '3':
                donGia = 50;
                break;
            case '4':
                donGia = 80;
                break;
        }
        thanhTien = soNgay * donGia + tienDV;
    }

    public String chuanhoa(String s){
        String[] tmp = s.trim().split("\\s++");
        String a = "";
        for(String i : tmp){
            a += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return a;
    }
    
    @Override
    public String toString()
    {
        return maKH + " " + tenKH + soPhong + " " + soNgay + " " + thanhTien;
    }

    @Override
    public int compareTo(KhachHang o)
    {
        return (int) (o.thanhTien - thanhTien);
    }
}
