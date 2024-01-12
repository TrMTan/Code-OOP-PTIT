import java.util.Scanner;
import java.util.Stack;

/**
 * J08020_KiemTraDayNgoacDung
 */
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < s.length(); ++i){
                if(st.isEmpty()) st.push(s.charAt(i));
                else if((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == ']' && st.peek() == '[') || (s.charAt(i) == '}' && st.peek() == '{')){
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                } 
            }
            System.out.println(st.isEmpty() ? "YES" : "NO");
        }
    }
}

// 2
// [()]{}{[()()]()}
// [(])