
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02013_SapXepNoiBot {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            boolean ok = true;
            for(int j = 0; j < n - 1; j++){
                if(a[j] > a[j + 1]){
                    ok = false;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            
            if(ok) return;
            
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        check();
    }
}
