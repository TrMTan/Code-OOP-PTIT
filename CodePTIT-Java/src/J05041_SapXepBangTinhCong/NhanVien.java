package J05041_SapXepBangTinhCong;

public class NhanVien implements Comparable<NhanVien>{
    private static int c = 1;
    private String ma, ht, cv;
    private int lcb, lt, nc, thuong, pc, tong;
    public NhanVien(String ht, int lcb,  int nc, String cv) {
        this.ma = String.format("NV%02d", c++);
        this.ht = ht;
        this.cv = cv;
        this.lcb = lcb;
        this.nc = nc;
        if(cv.equals("GD")){
            this.pc = 250000;
        }else if(cv.equals("PGD")){
            this.pc = 200000;
        }else if(cv.equals("TP")){
            this.pc = 180000;
        }else if(cv.equals("NV")){
            this.pc = 150000;
        }else{
            this.pc = 0;
        }
        this.lt = lcb * nc;
        if(nc >= 25){
            this.thuong = (int) (this.lt * 0.2);
        }else if(nc >= 22){
            this.thuong = (int) (this.lt * 0.1);
        }else{
            this.thuong = 0;
        }
        this.tong = this.lt + this.thuong + this.pc;    
    }
    
    @Override
    public String toString() {
        return ma + " " + ht + " " + lt + " " + thuong + " " + pc + " " + tong;
    }

    @Override
    public int compareTo(NhanVien arg0) {
        return Integer.compare(arg0.tong, this.tong);
    }
}
