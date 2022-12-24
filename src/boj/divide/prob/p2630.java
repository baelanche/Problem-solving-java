package boj.divide.prob;

import java.util.Scanner;

public class p2630 {
    
    public static int a[][];
    public static int white = 0;
    public static int blue = 0;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        a = new int[n][n];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
    
    public static void divide(int r, int c, int len) {
        if (len < 1) {
            return;
        }
        
        boolean b = check(a[r][c], r, c, len);
        
        if (b) {
            if (a[r][c] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }
        
        divide(r, c, len/2);
        divide(r, c + len/2, len/2);
        divide(r + len/2, c, len/2);
        divide(r + len/2, c + len/2, len/2);
    }
    
    public static boolean check(int init, int r, int c, int len) {
        for (int i=r; i<r+len; i++) {
            for (int j=c; j<c+len; j++) {
                if (init != a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
