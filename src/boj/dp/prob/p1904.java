package boj.dp.prob;

import java.util.Scanner;

public class p1904 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int dp[] = new int[1000001];
        
        dp[0] = 0; dp[1] = 1; dp[2] = 2;
        for(int i=3; i<=n; i++) dp[i] = dp[i-2]%15746 + dp[i-1]%15746;
        
        System.out.println(dp[n]%15746);
    }
}
