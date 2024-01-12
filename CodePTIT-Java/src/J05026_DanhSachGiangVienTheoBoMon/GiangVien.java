package J05026_DanhSachGiangVienTheoBoMon;

public class GiangVien {
    private String ma, ten, boMon;
    private static int cnt = 1;

    public GiangVien(String ten, String boMon) {
        this.ma = "GV" + String.format("%02d", cnt++);
        this.ten = ten;
        this.boMon = boMon;
    }

    public String getBoMon() {
        return boMon;
    }

    public String inBoMon(){
        String[] s = boMon.trim().split("\\s++");
        String a = "";
        for(String i : s){
            a += i.substring(0, 1).toUpperCase();
        }
        return a;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + inBoMon();
    }
}