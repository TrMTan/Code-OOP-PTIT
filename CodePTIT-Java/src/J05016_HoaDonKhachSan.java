
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class KhachHang implements Comparable<KhachHang>{
    private String ma, ht, sp;
    private Date ngayn, ngayt;
    private int dv, gia, tong, songay;
    private static int cnt = 1;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public KhachHang(String ht, String sp, String ngayn, String ngayt, int dv) throws ParseException {
        this.ma = String.format("KH%02d", cnt++);
        this.ht = ht;
        this.sp = sp;
        this.ngayn = sdf.parse(ngayn);
        this.ngayt = sdf.parse(ngayt);
        this.dv = dv;
        this.gia = gia();
        this.songay = (int)((this.ngayt.getTime() - this.ngayn.getTime()) / (1000 * 60 * 60 * 24) + 1);
        this.tong = gia * songay + dv;
    }
    
    public int gia(){
        switch (sp.charAt(0)) {
            case '1':
                this.gia = 25;
                break;
            case '2':
                this.gia = 34;
                break;
            case '3':
                this.gia = 50;
                break;
            case '4':
                this.gia = 80;
                break;    
        }
        return this.gia;
    }

    @Override
    public String toString() {
        return ma + " " + ht + " " + sp + " " + songay + " " + tong;
    }
    
    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.tong, this.tong);
    }
}

public class J05016_HoaDonKhachSan {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        while(t-->0){
            a.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}

//3
//Huynh Van Thanh   
//103 
//05/06/2010   
//05/06/2010   
//15
//Le Duc Cong  
//106 
//08/03/2010   
//01/05/2010   
//220
//Tran Thi Bich Tuyen   
//207 
//10/04/2010   
//21/04/2010   
//96
