package boj.dp.prob;

import java.util.Scanner;

public class p1932 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int dp[][] = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        dp[0][0] = a[0][0];
        for(int i=1; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                if(j==0)
                    dp[i][j] = dp[i-1][j] + a[i][j];
                else
                    dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + a[i][j];
                if(max < dp[i][j])
                    max = dp[i][j];
            }
        }
        System.out.println(max);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
