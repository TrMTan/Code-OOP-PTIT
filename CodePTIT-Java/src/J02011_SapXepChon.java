
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02011_SapXepChon {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            int id = i;
            for(int j = i + 1; j < n; j++){
                if(a[id] > a[j]){
                    id = j;
                }
            }
            
            int tmp = a[id];
            a[id] = a[i];
            a[i] = tmp;
            
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
