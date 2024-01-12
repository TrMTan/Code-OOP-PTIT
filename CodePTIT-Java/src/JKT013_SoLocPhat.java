import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            Stack<String> st = new Stack<>();
            Queue<String> q = new LinkedList<>();
            q.add("");
            while(!q.isEmpty()){
                String s = q.poll();
                if(!s.equals("")){
                    st.push(s);
                }
                if(s.length() == n){
                    continue;
                }
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println(st.size());
            while (!st.isEmpty()) {
                System.out.print(st.pop() + " ");
            }
            System.out.println("");
        }
    }
}
