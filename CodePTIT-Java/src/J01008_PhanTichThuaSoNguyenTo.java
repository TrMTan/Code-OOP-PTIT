
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01008_PhanTichThuaSoNguyenTo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(int t){
        int n = sc.nextInt();
        System.out.printf("Test %d: ", t);
        for(int i = 2; i <= Math.sqrt(n); i++){
            int mu = 0;
            while(n % i == 0){
                mu++;
                n /= i;
            }
            if(mu != 0){
                System.out.printf("%d(%d) ", i, mu);
            }            
        }
        if(n != 1){
            System.out.printf("%d(%d) ", n, 1);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            check(i);
        }
    }
}
