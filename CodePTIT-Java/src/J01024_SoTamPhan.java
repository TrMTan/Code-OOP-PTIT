
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01024_SoTamPhan {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        String s = sc.next();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > '2'){
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
