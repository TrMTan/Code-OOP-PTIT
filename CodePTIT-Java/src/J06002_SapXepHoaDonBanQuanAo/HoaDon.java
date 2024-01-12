package J06002_SapXepHoaDonBanQuanAo;

public class HoaDon implements Comparable<HoaDon>{
    private String maHD;
    private int sl;
    private SanPham sp;
    private int giamgia, tienptra;
    private static int count = 1;

    public HoaDon(String maHD, int sl) {
        this.maHD = String.format("%s-%03d", maHD, count++);
        this.sl = sl;
        giamgia = 0;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setSp(SanPham sp, char loai) {
        this.sp = sp;
        int loaigia = 0;
        if(loai == '1'){
            loaigia = sp.getGial1();
        }else{
            loaigia = sp.getGial2();
        }
        int gia = loaigia * sl;
        if(sl >= 150){
            giamgia = (int) (gia * 0.5);
        }else if(sl >= 100){
            giamgia = (int) (gia * 0.3);
        }else if(sl >= 50){
            giamgia = (int) (gia * 0.15);
        }
        tienptra = gia - giamgia;
    }

    @Override
    public String toString() {
        return maHD + " " + sp.getTenSP() + " " + giamgia + " " + tienptra;
    }

    @Override
    public int compareTo(HoaDon arg0) {
        return -Integer.compare(this.tienptra, arg0.tienptra);
    }
}
