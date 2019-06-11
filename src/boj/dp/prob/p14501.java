package boj.dp.prob;

import java.util.Scanner;

public class p14501 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n+1][2];
        int dp[] = new int[n+1];
        for(int i=1; i<=n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            dp[i] = a[i][1];
        }
        
        for(int i=2; i<=n; i++)
            for(int j=1; j<i; j++)
                if(i - j >= a[j][0])
                    dp[i] = max(dp[j] + a[i][1], dp[i]);
        
        int max = 0;
        for(int i=1; i<=n; i++)
            if(i + a[i][0] <= n + 1)
                if(max < dp[i])
                    max = dp[i];
        for(int i=1; i<=n; i++)
        	System.out.println(dp[i]);
        
        System.out.println(max);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
