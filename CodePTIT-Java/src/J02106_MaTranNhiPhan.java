
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02106_MaTranNhiPhan {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int kq = 0;
        for(int i = 0; i < n; i++){
            int dem = 0;
            for(int j = 0; j < 3; j++){
                dem += a[i][j];
            }
            if(dem >= 2){
                kq++;
            }
        }
        System.out.println(kq);
    }
    
    public static void main(String[] args) {
        check();
    }
}
