import java.util.Arrays;
import java.util.Scanner;

/**
 * J02024_DayConCoTongLe
 */
public class J02024_DayConCoTongLe {
    public static void Try(int i, int[] a, int sum, String s){
        if(sum % 2 == 1){
            System.out.println(s);
        }
        for(int j = 0; j < i; j++){
            Try(j, a, sum + a[j], s + a[j] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Try(n, a, 0, "");
        }    
    }
}