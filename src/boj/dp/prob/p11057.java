package boj.dp.prob;

import java.util.Scanner;

public class p11057 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int dp[][] = new int[1001][10];
        
        for(int i=0; i<10; i++) dp[1][i] = 1;
        
        for(int i=2; i<n+1; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<=j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i<10; i++)
            sum = (sum + dp[n][i]) % 10007;
        
        System.out.println(sum);
    }
}
