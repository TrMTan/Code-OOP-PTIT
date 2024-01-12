
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tan
 */
public class J07029_SoNguyenToLonNhatTrongFile {
    private static final int N = (int) 1e6;
    public static int[] prime = new int[N + 1];
    
    public static void sang(){
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for(int i = 2; i <= (int) 1e3; i++){
            if(prime[i] == 1){
                for(int j = i * i; j <= N; j += i){
                    prime[j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sang();
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> a = (ArrayList<Integer>) ip.readObject();
        int[] dd = new int[N + 1];
        for(Integer i : a){
            dd[i] += prime[i];
        }
        int dem = 0;
        for(int i = N; i >= 2; i--){
            if(dd[i] > 0){
                dem++;
                System.out.println(i + " " + dd[i]);
                if(dem == 10){
                    break;
                }
            }
        }
    }
}
