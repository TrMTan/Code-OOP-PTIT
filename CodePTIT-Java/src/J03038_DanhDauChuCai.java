
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03038_DanhDauChuCai {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        String s = sc.nextLine();
        TreeSet<Character> se = new TreeSet<>();
        for(int i = 0; i < s.length(); i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
    }
    
    public static void main(String[] args) {
        check();
    }
}
