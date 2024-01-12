package J05049_LietKeNhapXuatHangTheoNhom;

public class Hang implements Comparable<Hang>{
    private String ma;
    private int sln, slx, dgia, tien, thue;

    public Hang(String ma, int sln) {
        this.ma = ma;
        this.sln = sln;
        if(ma.charAt(0) == 'A'){
            this.slx = Math.round(sln * 0.6f);
        }else if(ma.charAt(0) == 'B'){
            this.slx = Math.round(sln * 0.7f);
        }
        if(ma.charAt(ma.length() - 1) == 'Y'){
            this.dgia = 110000;
        }else if(ma.charAt(ma.length() - 1) == 'N'){
            this.dgia = 135000;
        }
        this.tien = this.slx * this.dgia;
        float tmp = 0f;
        if(ma.charAt(0) == 'A'){
            if(ma.charAt(ma.length() - 1) == 'Y'){
                tmp = 0.08f;
            }else if(ma.charAt(ma.length() - 1) == 'N'){
                tmp = 0.11f;
            }
        }else if(ma.charAt(0) == 'B'){
            if(ma.charAt(ma.length() - 1) == 'Y'){
                tmp = 0.17f;
            }else if(ma.charAt(ma.length() - 1) == 'N'){
                tmp = 0.22f;
            }
        }
        this.thue = Math.round(this.tien * tmp / 10) * 10;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + sln + " " + slx + " " + dgia + " " + tien + " " + thue;
    }

    @Override
    public int compareTo(Hang arg0) {
        return Float.compare(arg0.thue, this.thue);
    }
}
