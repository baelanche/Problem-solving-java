package boj.dp.prob;

import java.util.Scanner;

public class p11048 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int dp[][] = new int[n][m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        dp[0][0] = a[0][0];
        for(int i=1; i<n; i++) {
            dp[i][0] = dp[i-1][0] + a[i][0];
        }
        for(int i=1; i<m; i++) {
            dp[0][i] = dp[0][i-1] + a[0][i];
        }
        
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                dp[i][j] = max(max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + a[i][j];
            }
        }
        
        System.out.println(dp[n-1][m-1]);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
