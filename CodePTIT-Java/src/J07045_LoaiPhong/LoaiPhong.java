/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07045_LoaiPhong;

/**
 *
 * @author tan
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String data, name;

    public LoaiPhong(String s) {
        data = s;
        String[] a = s.split("\\s+");
        this.name = a[1];
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
