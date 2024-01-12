/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import controller.QLTV;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class run {
    public static void main(String[] args) {
        QLTV q = new QLTV();
        String fname = "src/run/tailieu.dat";
        while(true){
            try{
                System.out.println("1. Nhap sach");
                System.out.println("2. Nhap bao");
                System.out.println("3. Hien thi");
                System.out.println("4. Luu vao file");
                System.out.println("5. Doc ra tu file");
                System.out.println("6. Xoa");
                System.out.println("7. Sua ");
                System.out.println("8. Tim theo ten sach");
                System.out.println("9. Tim bao tu nam...den...nam");
                System.out.println("10. Sap xep theo So ban PH");
                System.out.println("11. Sap xep sach theo ten TG");      
                System.out.println("12. Sap xep bao theo ngay PH va So ban PH");
                System.out.println("13. Thong ke 1");
                System.out.println("14. Thong ke 2");
                System.out.println("15. Thong ke 3");
                System.out.println("16. Thong ke 4");      
                System.out.println("17. Thong ke 5");
                System.out.println("0. Thoat");
                System.out.print("Moi chon (0 - 17):");        
                int chon;
                Scanner sc = new Scanner(System.in);
                chon = Integer.parseInt(sc.nextLine());
                switch(chon){
                    case 0:
                        System.out.println("Bye!!!");
                        System.exit(0);
                        break;
                    case 1:
                        q.nhapSach();
                        break;
                    case 2:
                        q.nhapBao();
                        break;
                    case 3:
                        q.hienthiDS();
                        break;
                    case 4:
                        q.luu(fname);
                        break;
                    case 5:
                        q.docra(fname);
                        break;
                    case 6:
                        q.xoa();
                        break;
                    case 7: 
                        q.sua();
                        break;
                    case 8:
                        q.timTheoTenSach();
                        break;
                    case 9:
                        q.timBaoTuNamDenNam();
                        break;
                    case 10:
                        q.sapxepSoBanPH();
                        break;
                    case 11:
                       q.sapxepSachTheoTenTG();
                        break;
                    case 12: 
                       q.sapxepBao2TTinh();
                       break;
                    case 13:
                        q.thongke1();
                        break;
                    case 14:
                        q.thongke2();
                        break;
                    case 15:
                        q.thongke3();
                        break;
                    case 16:
                       q.thongke4();
                        break;
                    case 17: 
                       q.thongke5();
                       break;
                    default:
                        System.out.println("Ban chi chon (0 - 17)");
                        break;
                }
            }catch(NumberFormatException e){
                System.out.println("Hay chon tu 0-17");
            }
        }
    }
}
