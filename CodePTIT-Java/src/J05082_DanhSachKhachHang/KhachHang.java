package J05082_DanhSachKhachHang;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang>{
    public static int ID = 0;
    public static final String KEY = "KH";
    public static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private String id;
    private String name;
    private String gender;
    private String dob;
    private String address;

    public KhachHang(String name, String gender, String dob, String address) {
        this.id = String.format("%s%03d", KEY, ++ID);
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        this.name = tmp[0].substring(0, 1).toUpperCase() + tmp[0].substring(1);
        for (int i = 1; i < tmp.length; ++i)
            this.name += (" " + tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1));
        this.gender = gender;
        tmp = dob.split("/");
        this.dob = String.format("%02d/%02d/%s", Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), tmp[2]);
        this.address = address;
    }

    @Override
    public int compareTo(KhachHang o) {
        try {
            return Long.compare(format.parse(this.dob).getTime(), format.parse(o.dob).getTime());
        } catch (ParseException e) {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.id, this.name, this.gender, this.address, this.dob);
    }
}
