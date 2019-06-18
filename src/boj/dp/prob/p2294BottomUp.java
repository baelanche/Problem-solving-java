package boj.dp.prob;

import java.util.Scanner;

public class p2294BottomUp {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MAX = 1000000;
        
        int a[] = new int[101];
        int dp[] = new int[10001];
        
        for(int i=1; i<=k; i++)
            dp[i] = MAX;
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        for(int i=0; i<n; i++)
            for(int j=a[i]; j<=k; j++)
                dp[j] = Math.min(dp[j], dp[j-a[i]] + 1);
        
        System.out.println(dp[k] == MAX ? -1 : dp[k]);
    }	
}
