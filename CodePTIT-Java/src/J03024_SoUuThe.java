
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J03024_SoUuThe {
    public static Scanner sc = new Scanner(System.in);
    
    public static int kt(String s){
        if(s.charAt(0) == '0') return -1;
        int c = 0, l = 0;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) return -1;
            if((s.charAt(i) - '0') % 2 == 0) c++;
            else l++;
        }
        if((s.length() % 2 == 0 && c > l) || (s.length() % 2 == 1 && l > c)) return 1;
        return 0;
    }
    
    public static void check(){
        String s = sc.next();
        if(kt(s) == -1) System.out.println("INVALID");
        else if(kt(s) == 1) System.out.println("YES");
        else System.out.println("NO");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
