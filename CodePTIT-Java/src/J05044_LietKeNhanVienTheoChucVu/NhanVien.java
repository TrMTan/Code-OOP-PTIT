package J05044_LietKeNhanVienTheoChucVu;

public class NhanVien {
    private String ma, ht, cv;
    private int lcb, lt, nc, pc, tu, cl;
    private static int cnt = 1;

    public NhanVien(String ht, String cv, int lcb, int nc) {
        this.ma = String.format("NV%02d", cnt++);
        this.ht = ht;
        this.cv = cv;
        this.lcb = lcb;
        this.nc = nc;
        this.lt = this.lcb * this.nc;

        if(this.cv.equals("GD")){
            this.pc = 500;
        }else if(this.cv.equals("PGD")){
            this.pc = 400;
        }else if(this.cv.equals("TP")){
            this.pc = 300;
        }else if(this.cv.equals("KT")){
            this.pc = 250;
        }else{
            this.pc = 100;
        }    

        if((this.pc + this.lt) * 2 / 3 < 25000){
            this.tu = Math.round((this.pc + this.lt) * 2 / 3f / 1000) * 1000;
        }else{
            this.tu = 25000;
        }
        this.cl = this.lt + this.pc - this.tu;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + pc + " " + lt + " " + tu + " " + cl;
    }
}
