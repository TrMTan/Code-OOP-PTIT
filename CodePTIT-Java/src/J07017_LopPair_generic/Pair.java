package J07017_LopPair_generic;

public class Pair<S, T> {
    private T first;
    private S second;
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isPrime(){
        return isPrime((Integer) this.first) && isPrime((Integer) this.second);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.first, this.second);
    }

}
