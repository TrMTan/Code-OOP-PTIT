package J07057_DiemTuyenSinh;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ht, dantoc, khuvuc, tt;
    private double diem, tong, uutien, dt;
    private static int count = 1;

    public ThiSinh(String ht, double diem, String dantoc, String khuvuc) {
        this.ma = String.format("TS%02d", count++);
        this.ht = chuanhoa(ht);
        this.diem = diem;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        if(khuvuc.equals("1")){
            this.uutien = 1.5;
        }else if(khuvuc.equals("2")){
            this.uutien = 1;
        }
        if(!dantoc.equals("Kinh")){
            this.dt = 1.5;
        }
        this.tong = this.diem + this.uutien + this.dt;
        if(tong < 20.5) {
            this.tt = "Truot";
        }else{
            this.tt = "Do";
        }
    }

    private String chuanhoa(String s){
        String[] res = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(String i : res){
            ans += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return ans;

    }

    @Override
    public String toString() {
        return ma + " " + ht + String.format("%.1f", tong) + " " + tt;
    }

    @Override
    public int compareTo(ThiSinh arg0) {
        if(this.tong != arg0.tong){
            return Double.compare(arg0.tong, this.tong);   
        }
        return this.ma.compareTo(arg0.ma);
    }
}
