/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07046_DanhSachLuuTru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        while (t-- > 0)
            a.add(new KhachHang(sc.nextLine(), sc.nextLine(), dfm.parse(sc.nextLine()), dfm.parse(sc.nextLine())));
        Collections.sort(a);
        for (KhachHang i : a)
            System.out.println(i);
    }
}
