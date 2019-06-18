package boj.dp.prob;

import java.util.Scanner;

public class p9084 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int n = sc.nextInt();
            int coin[] = new int[n+1];
            for(int i=1; i<=n; i++)
                coin[i] = sc.nextInt();
            
            int m = sc.nextInt();
            int dp[] = new int[m+1];
            
            dp[0] = 1;
            for(int i=1; i<=n; i++)
                for(int j=coin[i]; j<=m; j++)
                    dp[j] += dp[j - coin[i]];
            
            System.out.println(dp[m]);
        }
    }
}
