
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01017_SoLienKe {
    public static Scanner sc = new Scanner(System.in);
    
    public static boolean kt(char a, char b){
        int x = a - '0';
        int y = b - '0';
        return Math.abs(x - y) == 1;
    }
    
    public static void check(){
        String s = sc.next();
        for(int i = 1; i < s.length(); i++){
            if(!kt(s.charAt(i), s.charAt(i - 1))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
