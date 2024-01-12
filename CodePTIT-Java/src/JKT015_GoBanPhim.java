import java.util.Scanner;
import java.util.Stack;

public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st1 = new Stack<>(); // st1: stack chính chứa các ký tự 
        Stack<Character> st2 = new Stack<>(); // st2: stack phụ chứa các ký tự bị xóa
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '<':
                    if(!st1.isEmpty()){
                        st2.push(st1.pop()); // đẩy phần tử đầu tiên của st1 vào st2
                    }
                    break;
                case '>':
                    if(!st2.isEmpty()){
                        st1.push(st2.pop()); // đẩy phần tử đầu tiên của st2 vào st1
                    }
                    break;
                case '-':
                    if(!st1.isEmpty()){
                        st1.pop(); // xóa phần tử đầu tiên của st1
                    }
                    break;    
                default:
                    st1.push(s.charAt(i)); // đẩy phần tử vào st1
                    break;
            }
        }
        while(!st2.isEmpty()){
            st1.push(st2.pop()); // đẩy các phần tử còn lại của st2 vào st1
        }
        for(int i = 0; i < st1.size(); i++){
            System.out.print(st1.get(i));
        }
    }
}

