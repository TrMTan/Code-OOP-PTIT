package J07056_TinhTienDien;

public class KhachHang implements Comparable<KhachHang>{
    private String ht, loai, ma;
    private int dau, cuoi, dinhmuc, sodien, in, out, vat, tong;
    private static int stt = 1;

    public KhachHang(String ht, String loai, int dau, int cuoi) {
        this.ma = String.format("KH%02d", stt++);
        this.ht = chuanhoa(ht);
        this.loai = loai;
        this.dau = dau;
        this.cuoi = cuoi;
        this.sodien = cuoi - dau;
        switch (loai) {
            case "A":
                this.dinhmuc = 100;
                break;
            case "B":
                this.dinhmuc = 500;
                break;
            case "C":
                this.dinhmuc = 200;
                break;
        }
        this.in = Math.min(this.sodien, this.dinhmuc) * 450;
        this.out = Math.max(this.sodien - this.dinhmuc, 0) * 1000;
        this.vat = (int) (this.out * 0.05f);
        this.tong = this.in + this.out + this.vat;
    }

    public String chuanhoa(String s){
        String[] tmp = s.trim().split("\\s+");
        String res = "";
        for(String i : tmp){
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";     
        }
        return res;
    }

    @Override
    public String toString() {
        return ma + " " + ht + in + " " + out + " " + vat + " " + tong;
    }

    @Override
    public int compareTo(KhachHang arg0) {
        return -Integer.compare(this.tong, arg0.tong);
    }
}
