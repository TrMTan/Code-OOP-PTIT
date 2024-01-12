
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        int[] dd = new int[1005];
        for(int i : a){
            dd[i]++;
        }
        for(int i = 0; i < 1000; i++){
            if(dd[i] > 0){
                System.out.println(i + " " + dd[i]);
            }
        }
    }
}
