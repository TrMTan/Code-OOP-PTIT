
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
 * @author DELL
 */
public class J07016_SoNguyenToTrongHaiFileNhiPhan {
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
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> a = (List<Integer>) o1.readObject();
        List<Integer> b = (List<Integer>) o2.readObject();
        int[] dd1 = new int[10000];
        int[] dd2 = new int[10000];
        for(Integer i : a){
            dd1[i] += prime[i];
        }
        for(Integer i : b){
            dd2[i] += prime[i];
        }
        for(int i = 2; i < 10000; i++){
            if(dd1[i] > 0 && dd2[i] > 0){
                System.out.println(i + " " + dd1[i] + " " + dd2[i]);
            }
        }
    }
}
