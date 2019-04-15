package boj.dp.prob;

import java.util.Scanner;

public class p1149 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        int dp[][] = new int[n][3];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        dp[0][0] = a[0][0]; dp[0][1] = a[0][1]; dp[0][2] = a[0][2];
        for(int i=1; i<n; i++) {
            dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + a[i][0];
            dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + a[i][1];
            dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + a[i][2];
        }
        
        System.out.println(min(min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
        sc.close();
    }
    
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
