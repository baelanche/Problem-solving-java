package boj.dp.prob;

import java.util.Scanner;

public class p2193 {

public static long dp[];
    
    public static long pinary(int n) {
        if(n == 0) {dp[0] = 0; return 0;}
        if(n == 1) {dp[1] = 1; return 1;}
        if(dp[n] != -1) return dp[n];
        
        long result = pinary(n-2) + pinary(n-1);
        dp[n] = result;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        dp = new long[n+1];
        
        for(int i=0; i<dp.length; i++)
            dp[i] = -1;
        
        System.out.println(pinary(n));
        sc.close();
    }
}
