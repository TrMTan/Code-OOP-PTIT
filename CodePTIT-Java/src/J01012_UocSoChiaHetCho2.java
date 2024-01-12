
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01012_UocSoChiaHetCho2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int dem = 0;
        int n = sc.nextInt();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i % 2 == 0){
                    dem++;
                }
                if((n / i) % 2 == 0 && i != Math.sqrt(n)){
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            check();
        }
    }
}
