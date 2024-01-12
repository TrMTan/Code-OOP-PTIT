/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072_ChuanHoaVaSapXep;

/**
 *
 * @author tan
 */
public class HoTen implements Comparable<HoTen>{
    private String ho, tenDem, ten;

    public HoTen(String s) {
        String[] a = s.trim().toLowerCase().split("\\s+");
        ho = tenDem = "";
        ten = String.valueOf(a[a.length - 1].charAt(0)).toUpperCase() + a[a.length - 1].substring(1);
        ho = String.valueOf(a[0].charAt(0)).toUpperCase() + a[0].substring(1);
        for(int i = 1; i < a.length - 1 ; i++){
            tenDem += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ";
        }
        tenDem = tenDem.trim();
    }

    @Override
    public String toString() {
        return ho + " " + tenDem + " " + ten;
    }
   
    @Override
    public int compareTo(HoTen o) {
        if(!ten.equals(o.ten)){
            return ten.compareTo(o.ten);
        }
        if(!ho.equals(o.ho)){
            return ho.compareTo(o.ho);
        }
        return tenDem.compareTo(o.tenDem);
    }
}
