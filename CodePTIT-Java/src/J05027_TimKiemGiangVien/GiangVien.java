package J05027_TimKiemGiangVien;

public class GiangVien {
    private String ma, ten, boMon;
    private static int cnt = 1;

    public GiangVien(String ten, String boMon) {
        this.ma = String.format("GV%02d", cnt++);
        this.ten = ten;
        this.boMon = boMon;
    }   

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + inBoMon();
    }

    private String inBoMon() {
        String[] s = boMon.split("\\s++");
        String res = "";
        for (String i : s) {
            res += i.substring(0, 1).toUpperCase();
        }
        return res;
    }
}
