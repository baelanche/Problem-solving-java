package boj.dp.prob;

import java.util.Scanner;

public class p11722 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int dp[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int max = 0;
        for(int i=0; i<n; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(a[i] < a[j] && dp[j] + 1 > dp[i])
                    dp[i] = dp[j] + 1;
                if(max < dp[i])
                	max = dp[i];
            }
        }
        
        System.out.println(max);
        sc.close();
    }
}
