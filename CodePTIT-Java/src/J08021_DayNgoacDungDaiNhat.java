import java.util.Scanner;
import java.util.Stack;

/**
 * J08020_KiemTraDayNgoacDung
 */
public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1); 
            int kq = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(') st.push(i);
                else {
                    st.pop();
                    if(st.isEmpty()) st.push(i);
                    else kq = Math.max(kq, i - st.peek());
                }
            }
            System.out.println(kq);
        }
    }
}

// 3
// ((()
// )()())
// ()(()))))