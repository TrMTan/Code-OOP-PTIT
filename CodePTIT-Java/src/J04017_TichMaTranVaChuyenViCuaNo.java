
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix trans(){
        Matrix c = new Matrix(m, n);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                c.a[i][j] = this.a[j][i];
            }
        }
        return c;
    }
    
    public Matrix mul(Matrix o){
        Matrix c = new Matrix(this.n, o.m);
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < o.m; j++){
                for(int k = 0; k < this.m; k++){
                    c.a[i][j] += (this.a[i][k] * o.a[k][j]);
                }
            }
        }
        return c;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                s += (this.a[i][j] + " ");
            }
            s += "\n";
        }
        return s;
    }
    
    
}

public class J04017_TichMaTranVaChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
