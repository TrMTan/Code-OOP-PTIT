
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(int t){
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        int[][] c = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = 0;
                for(int k = 0; k < m; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        System.out.println("Test " + t + ":");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            check(i);
        }
    }
}
