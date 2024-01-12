package J06004_QuanLyBaiTapNhom2;


public class Nhom {
    private int ma;
    private static int sma = 1;
    private String detai;
    
    public Nhom(String detai) {
        this.ma = sma++;
        this.detai = detai;
    }

    public int getMa() {
        return ma;
    }

    public String getDetai() {
        return detai;
    }

}
