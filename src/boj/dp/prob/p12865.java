package boj.dp.prob;

import java.util.*;

public class p12865 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[n][2];
        int dp[][] = new int[n+1][k+1];
        for(int i=0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<k+1; j++) {
                if(a[i-1][0] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = max(dp[i-1][j], a[i-1][1] + dp[i-1][j - a[i-1][0]]);
            }
        }
        
        System.out.println(dp[n][k]);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
