package boj.dp.prob;

import java.util.Scanner;

public class p1010 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long dp[][] = new long[30][30];
        for(int i=1; i<=29; i++) {
            dp[1][i] = i;
            dp[i][i] = 1;
        }
        
        for(int i=2; i<=29; i++) {
            for(int j=i+1; j<=29; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
            }
        }
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(dp[n][m]);
        }
    }
}
