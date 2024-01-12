
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J02017_ThuGonDaySo {
    public static Scanner sc = new Scanner(System.in);
    
    public static void check(){
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        while(true){
            boolean ok = true;
            for(int i = 0; i < a.size() - 1; i++){
                if((a.get(i) + a.get(i + 1)) % 2 == 0){
                    a.remove(i + 1);
                    a.remove(i);
                    i--;
                    ok = false;
                }
            }
            if(ok){
                System.out.println(a.size());
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        check();
    }
}
