
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            int s1 = 0, s2 = 0, n = a.length;
            for(int i = 0; i < n; i++){
                if(a[i].charAt(a[i].length() - 1) % 2 == 0){
                    s1++;
                }else{
                    s2++;
                }
            }
            if((s1 > s2 && n % 2 == 0) || (s1 < s2 && n % 2 != 0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
