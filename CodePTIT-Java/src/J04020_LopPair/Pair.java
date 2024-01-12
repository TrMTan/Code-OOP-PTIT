/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04020_LopPair;

/**
 *
 * @author tan
 */
public class Pair<S, T> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    
    public boolean check(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public boolean isPrime(){
        return check((Integer) this.first) && check((Integer) this.second);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.first, this.second);
    }
}
