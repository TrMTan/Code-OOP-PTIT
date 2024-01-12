
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J01009_TinhTongGiaiThua {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int sum = 0;
        int tich = 1;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            tich *= i;
            sum += tich;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        check();
    }
}
