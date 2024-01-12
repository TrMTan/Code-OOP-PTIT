package J07054_TinhDiemTrungBinh;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ht;
    private int d1, d2, d3, hang;
    private static int cnt = 1;

    public SinhVien(String ht, int d1, int d2, int d3) {
        this.ma = String.format("SV%02d", cnt++);
        this.ht = chuanhoa(ht);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public int getHang() {
        return hang;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public String chuanhoa(String s){
        String[] tmp = s.trim().split("\\s+");
        String res = "";
        for(String i : tmp){
            res += i.toUpperCase().substring(0, 1) + i.substring(1).toLowerCase();
            res += " ";
        }
        return res.trim();
    }
    
    public float getTB(){
        return (float) (d1 * 3 + d2 * 3 + d3 * 2) / 8;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + String.format("%.02f", getTB()) + " " + this.hang;
    }

    @Override
    public int compareTo(SinhVien arg0) {
        if(this.getTB() != arg0.getTB()){
            return -Float.compare(this.getTB(), arg0.getTB());
        }
        return this.ma.compareTo(arg0.ma);
    }
}
