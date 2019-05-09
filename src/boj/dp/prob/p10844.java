package boj.dp.prob;

import java.util.Scanner;

public class p10844 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long dp[][] = new long[n][10];
        
        for(int i=1; i<10; i++)
            dp[0][i] = 1;
        
        for(int i=1; i<n; i++) {
            for(int j=0; j<10; j++) {
                if(j == 0) dp[i][j] = dp[i-1][j+1];
                else if(j == 9) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = (dp[i-1][j-1]%1000000000 + dp[i-1][j+1]%1000000000)%1000000000;
            }
        }
        
        long sum = 0;
        for(int i=0; i<10; i++) {
            sum += dp[n-1][i];
            sum %= 1000000000;
        }
        System.out.println(sum);
    }
}
