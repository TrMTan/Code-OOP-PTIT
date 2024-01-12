
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J08022_PhanTuDauTienBenPhaiLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i = n - 1; i >= 0; i--){
                while(!st.empty() && a[st.peek()] <= a[i]){
                    st.pop();
                }
                if(st.empty()){
                    b[i] = -1;
                }else{
                    b[i] = a[st.peek()];
                }
                st.push(i);
            }
            for(int i = 0; i < n; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
