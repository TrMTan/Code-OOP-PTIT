package J05073_TinhToanGiaBan;

public class MatHang {
    private String ma;
    private int dgia, sl;
    private double gb;

    public MatHang(String ma, int dgia, int sl) {
        this.ma = ma;
        this.dgia = dgia;
        this.sl = sl;
        double thue = 0, ship = 0;
        switch (ma.charAt(0)) {
            case 'T':
                thue = 0.29;
                ship = 0.04;
                break;
            case 'C':
                thue = 0.1;
                ship = 0.03;
                break;
            case 'D':
                thue = 0.08;
                ship = 0.025;
                break;
            case 'M':
                thue = 0.02;
                ship = 0.005;
                break;
            default:
                thue = 0;
                ship = 0;
                break;
        }
        double giam = 0;
        if(ma.charAt(ma.length() - 1) == 'C'){
            giam = 0.05;
        }
        double thang = (double) dgia * sl;
        double tthue = (double) thang * thue * (1 - giam);
        double tship = (double) thang * ship;
        this.gb = (thang + tthue + tship) * (1 + 0.2) / sl;
    }

    @Override
    public String toString() {
        return ma + " " + String.format("%.2f", gb);
    }
}
