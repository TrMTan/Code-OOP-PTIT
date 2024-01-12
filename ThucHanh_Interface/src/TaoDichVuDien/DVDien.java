/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaoDichVuDien;

/**
 *
 * @author DELL
 */
public class DVDien extends DichVu implements IDichVu{
    private int thang, soKW;

    public DVDien() {
    }

    public DVDien(String ma, String ten, String soDienThoai, int soKW, int thang) {
        super(ma, ten, soDienThoai);
        this.thang = thang;
        this.soKW = soKW;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getSoKW() {
        return soKW;
    }

    public void setSoKW(int soKW) {
        this.soKW = soKW;
    }

    @Override
    public String toString() {
        return super.getMa().toUpperCase() + " " + super.getTen() + " " + super.getSoDienThoai() + " " + soKW + " " + String.format("%.1f", getTienNop());
    }

    @Override
    public boolean isMa(String ma) {
        //hn22t55
        String regex = "^(hn|da)[0-9]{2}t[0-9]{2}$";
        return ma.matches(regex);
    }

    @Override
    public boolean isDienThoai(String ngay) {
        //0987654321
        String regex = "^0[0-9]{9}$";
        return ngay.matches(regex);
    }

    @Override
    public double getTienNop() {
        if(soKW < 50){
            return soKW * 1000;
        }else if(soKW < 100){
            return soKW * 2000;
        }else if(soKW < 200){
            return soKW * 3000;
        }else{
            return soKW * 4000;
        }
    }
}
