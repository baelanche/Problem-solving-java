package boj.divide.prob;

import java.util.Scanner;

public class p2630 {

	static int a[][];
    static int white = 0;
    static int blue = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        a = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = sc.nextInt();
        
        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
    
    public static void divide(int x, int y, int n) {
        if(n == 0) return;
        
        int color = a[x][y];
        for(int i=x; i<x+n; i++) {
            for(int j=y; j<y+n; j++) {
                if(color != a[i][j]) {
                    divide(x, y, n/2);
                    divide(x, y + n/2, n/2);
                    divide(x + n/2, y, n/2);
                    divide(x + n/2, y + n/2, n/2);
                    return;
                }
            }
        }
        
        if(color == 0) white++;
        else blue++;
    }
}
