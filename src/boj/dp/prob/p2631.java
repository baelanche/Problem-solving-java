package boj.dp.prob;

import java.util.Scanner;

public class p2631 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int c[] = new int[n];
        int dp[] = new int[n];
        
        for(int i=0; i<n; i++)
            c[i] = sc.nextInt();
        
        int max = 0;
        for(int i=0; i<n; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(c[i] > c[j] && dp[i] < dp[j] + 1)
                    dp[i] = dp[j] + 1;
                if(max < dp[i])
                    max = dp[i];
            }
        }
        
        System.out.println(n - max);
        sc.close();
    }
}
