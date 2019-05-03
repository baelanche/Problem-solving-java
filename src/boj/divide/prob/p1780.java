package boj.divide.prob;

import java.util.Scanner;

public class p1780 {

	static int a[][];
    static int cnt[] = new int[3];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        a = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        recursive(0, 0, n);
        for(int i=0; i<3; i++)
            System.out.println(cnt[i]);
    }
    
    public static void recursive(int r, int c, int len) {
        boolean f = true;
        int def = a[r][c];
        for(int i=r; i<r+len; i++) {
            for(int j=c; j<c+len; j++) {
                if(def != a[i][j]) {
                    f = false;
                    break;
                }
            }
        }
        
        if(!f) {
            int m = len/3;
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    recursive(r + i*m, c + j*m, m);
                }
            }
        } else cnt[a[r][c]+1]++;
    }
}
