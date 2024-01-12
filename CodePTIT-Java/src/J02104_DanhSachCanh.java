
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02104_DanhSachCanh {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i < j && a[i][j] == 1){
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        check();
    }
}
