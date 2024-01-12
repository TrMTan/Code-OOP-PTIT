
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] dd = new int[1005];
        for(int i = 0; i < 100000; i++){
            dd[sc.readInt()]++;
        }
        for(int i = 0; i < 1000; i++){
            if(dd[i] > 0){
                System.out.println(i + " " + dd[i]);
            }
        }
    }
}
