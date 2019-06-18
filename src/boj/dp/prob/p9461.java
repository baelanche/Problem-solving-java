package boj.dp.prob;

import java.util.Scanner;

public class p9461 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long dp[] = new long[101];
        dp[0] = 0;
        dp[1] = dp[2] = 1;
        
        for(int i=3; i<=100; i++)
            dp[i] = dp[i-3] + dp[i-2];
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
