import java.util.Scanner;

public class J03030_BienDoiAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        int A = 0, B = 0; // A: so lan bien doi A, B: so lan bien doi B
        for(char i : a){
            if(i == 'A'){ 
                if(A < B){
                    B = A + 1; // neu A < B thi bien doi A, B = A + 1
                }else{
                    B++;
                }
            }else{
                if(A < B){
                    A++; 
                }else{
                    A = B + 1; // neu A > B thi bien doi B, A = B + 1
                }
            }
        }
        System.out.println(A);
    }
}
