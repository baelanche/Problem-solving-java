package boj.dp.prob;

import java.util.Scanner;

public class p9507 {

	public static long dp[] = new long[68];
    
    public static long f(int n) {
        if(n < 2) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        if(dp[n] != -1) return dp[n];
        
        long result = f(n-1) + f(n-2) + f(n-3) + f(n-4);
        dp[n] = result;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0; i<dp.length; i++)
            dp[i] = -1;
        
        while(t-->0) {
            int n = sc.nextInt();
            
            System.out.println(f(n));
        }
        
        sc.close();
    }
}
