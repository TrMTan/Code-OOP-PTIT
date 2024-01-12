import java.util.ArrayList;
import java.util.Scanner;

class PhongBan {
    private String maPB ,tenPB;

    public PhongBan(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    public String getMaPB() {
        return maPB;
    }

    public String getTenPB() {
        return tenPB;
    }
}

class NhanVien {
    private String maNV, tenNV, maPB, tenPB;
    private int luong, nc, lt;

    public NhanVien(String maNV, String tenNV, int luong, int nc) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
        this.nc = nc;
        this.maPB = maNV.substring(3);
        char nhom = maNV.charAt(0);
        int nam = Integer.parseInt(maNV.substring(1, 3));
        int hso = 0;
        if(nhom == 'A'){
            if(nam >= 16) hso = 20;
            else if(nam >= 9) hso = 14;
            else if(nam >= 4) hso = 12;
            else hso = 10;
        }else if(nhom == 'B'){
            if(nam >= 16) hso = 16;
            else if(nam >= 9) hso = 13;
            else if(nam >= 4) hso = 11;
            else hso = 10;
        }else if(nhom == 'C'){
            if(nam >= 16) hso = 14;
            else if(nam >= 9) hso = 12;
            else if(nam >= 4) hso = 10;
            else hso = 9;
        }else{
            if(nam >= 16) hso = 13;
            else if(nam >= 9) hso = 11;
            else if(nam >= 4) hso = 9;
            else hso = 8;
        }
        this.lt = this.luong * this.nc * hso * 1000;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + tenPB + " " + lt;
    }
}

public class TN2012_TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<PhongBan> listPB = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = sc.next();
            String name = sc.nextLine().trim();
            listPB.add(new PhongBan(id, name));
        }
        int m = sc.nextInt();
        ArrayList<NhanVien> listNV = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            int baseSalary = sc.nextInt();
            int numOfWorks = sc.nextInt();
            listNV.add(new NhanVien(id, name, baseSalary, numOfWorks));
        }
        for(NhanVien i : listNV){
            for(PhongBan j : listPB){
                if(i.getMaPB().equals(j.getMaPB())){
                    i.setTenPB(j.getTenPB());
                    break;
                }
            }
        }
        for(NhanVien i : listNV){
            System.out.println(i);
        }
    }
}

// 2
// HC Hanh chinh
// KH Ke hoach Dau tu
// 2
// C06HC
// Tran Binh Minh
// 65
// 25
// D03KH
// Le Hoa Binh
// 59
// 24
