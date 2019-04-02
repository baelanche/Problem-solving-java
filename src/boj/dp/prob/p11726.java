package boj.dp.prob;

import java.util.Scanner;

public class p11726 {

	public static int dp[];
    
    public static int f(int n) {
        if(n == 0) {dp[0] = 0; return 0;}
        if(n == 1) {dp[1] = 1; return 1;}
        if(n == 2) {dp[2] = 2; return 2;}
        if(dp[n] != -1) return dp[n];
        
        int result = f(n-2)%10007 + f(n-1)%10007;
        dp[n] = result;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        dp = new int[n+1];
        
        for(int i=0; i<dp.length; i++)
            dp[i] = -1;
        
        System.out.println(f(n)%10007);
    }
}
