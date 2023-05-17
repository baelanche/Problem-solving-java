package boj.dp.prob;

import java.util.*;

public class p28017 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[501][501];
        int dp[][] = new int[501][501];
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                a[i][j] = sc.nextInt();
            }
            for (int j=1; j<=m; j++) {
                int min = 10001;
                for (int k=1; k<=m; k++) {
                    if (j == k) {
                        continue;
                    }
                    min = Math.min(min, dp[i-1][k]);
                }
                dp[i][j] = a[i][j] + min;
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int i=1; i<=m; i++) {
            answer = Math.min(answer, dp[n][i]);
        }

        System.out.println(answer);
    }
}
