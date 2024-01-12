
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02012_SapXepChen {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int id = i;
            while(id > 0 && a[id] < a[id - 1]){
                int tmp = a[id];
                a[id] = a[id - 1];
                a[id - 1] = tmp;
                id--;
            }
            
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j <= i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        check();
    }
}
