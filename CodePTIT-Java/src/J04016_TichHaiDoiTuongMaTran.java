
import java.util.ArrayList;
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
    private int[][] a;
    private int n, m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix mul(Matrix o){
        Matrix c = new Matrix(this.n, o.m);
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < o.m; j++){
                for(int z = 0; z < this.m; z++){
                    c.a[i][j] += (this.a[i][z] * o.a[z][j]);
                }
            }
        }
        return c;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                s += (this.a[i][j] + " ");
            }
            s += "\n";
        }
        return s;
    }
}


public class J04016_TichHaiDoiTuongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
