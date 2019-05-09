package boj.dp.prob;

import java.util.Scanner;

public class p1912 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int dp[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        dp[0] = a[0];
        int max = dp[0];
        for(int i=1; i<n; i++) {
            dp[i] = max(dp[i-1] + a[i], a[i]);
            max = max(max, dp[i]);
        }
        System.out.println(max);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
