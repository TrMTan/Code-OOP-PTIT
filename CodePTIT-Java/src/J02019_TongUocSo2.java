
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02019_TongUocSo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] m = new int[b + 1];
        for(int i = 1; i <= b; i++){
            for(int j = i * 2; j <= b; j += i){
                m[j] += i;
            }
        }
        int dem = 0;
        for(int i = a; i <= b; i++){
            if(m[i] > i) dem++;
        }
        System.out.println(dem);
    }
}
