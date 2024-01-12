/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05024_LietKeSinhVienTheoNganh;

/**
 *
 * @author tan
 */
public class SinhVien {
    private String msv, ht, lop, email, nganh;

    public SinhVien(String msv, String ht, String lop, String email) {
        this.msv = msv;
        this.ht = ht;
        this.lop = lop;
        this.email = email;
    }

    public String getNganh() {
        return nganh;
    }

    public void setnganh(){
        String s = "";
        String res = msv.substring(5, 7);
        if(res.equals("CN") && lop.charAt(0) != 'E'){
            s = "CONG NGHE THONG TIN";
        }else if(res.equals("AT") && lop.charAt(0) != 'E'){
            s = "AN TOAN THONG TIN";
        }else if(res.equals("DT")){
            s = "DIEN TU";
        }else if(res.equals("VT")){
            s = "VIEN THONG";
        }else if(res.equals("KT")){
            s = "KE TOAN";
        }
        this.nganh = s.toString();
    }
    
    @Override
    public String toString() {
        return msv + " " + ht + " " + lop + " " + email;
    }
}
