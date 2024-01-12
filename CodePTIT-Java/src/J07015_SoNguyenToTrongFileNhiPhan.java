
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class J07015_SoNguyenToTrongFileNhiPhan {
    public static int[] prime = new int[10000];
    
    public static void sang(){
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for(int i = 2; i <= 100; i++){
            if(prime[i] == 1){
                for(int j = i * i; j < 10000; j += i){
                    prime[j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sang();
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> a = (List<Integer>) ip.readObject();
        int[] dd = new int[10000];
        for(Integer i : a){
           dd[i] += prime[i]; 
        }
        for(int i = 2; i < 10000; i++){
            if(dd[i] > 0){
                System.out.println(i + " " + dd[i]);
            }
        }
    }
}
