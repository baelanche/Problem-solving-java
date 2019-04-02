package boj.dp.prob;

import java.util.Scanner;

public class p1904 {
	
public static int dp[] = new int[1000000];
    
    public static int f(int n) {
        if(n == 0) {dp[0] = 0; return 0;}
        if(n == 1) {dp[1] = 1; return 1;}
        if(n == 2) {dp[2] = 2; return 2;}
        if(dp[n] != -1) return dp[n];
        
        int result = f(n-2)%15746 + f(n-1)%15746;
        dp[n] = result;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<dp.length; i++)
            dp[i] = -1;
        
        System.out.println(f(n)%15746);
    }
}
