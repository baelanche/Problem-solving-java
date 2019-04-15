package boj.dp.prob;

import java.util.Scanner;

public class p2579 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[300];
        int dp[] = new int[300];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        dp[0] = a[0];
        dp[1] = max(a[0], a[0] + a[1]);
        dp[2] = max(a[0] + a[2], a[1] + a[2]);
        for(int i=3; i<300; i++)
            dp[i] = max(dp[i-3] + a[i-1] + a[i], dp[i-2] + a[i]);
        
        System.out.println(dp[n-1]);
        sc.close();
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
