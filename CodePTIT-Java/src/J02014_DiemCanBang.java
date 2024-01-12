import java.util.Scanner;

/**
 * J02014_DiemCanBang
 */
public class J02014_DiemCanBang {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-->0) {
            check();
        }
    }

    private static void check() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] f = new int[n]; //cong don
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
            if(i == 0){
                f[i] = a[i];
            }else{
                f[i] = f[i - 1] + a[i];
            }
        }
        for(int i = 1; i < n; i++){
            if(f[i - 1] == sum - f[i]){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}

// 2
// 7
// -7 1 5 2 -4 3 0
// 5
// 1 2 3 4 5