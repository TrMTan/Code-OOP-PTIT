
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07085_TongChuSo {
    public static String kq(String s){
        String t = "";
        int tong = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                t += s.charAt(i);
                tong += (s.charAt(i) - '0');
            }
        }
        t = new BigInteger(t) + "";
        return (t + " " + tong);
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) sc.readObject();
        for(String i : a){
            if(!kq(i).equals("0 0")){
                System.out.println(kq(i));
            }
        }
    }
}
