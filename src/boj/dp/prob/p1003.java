package boj.dp.prob;

import java.util.Scanner;

public class p1003 {

	public static final int MAX = 41;
    public static int dp[] = new int[MAX];
    
    public static int fibonacci(int n) {
        if(n==0) {dp[0] = 0; return 0;}
        if(n==1) {dp[1] = 1; return 1;}
        if(dp[n] != -1) return dp[n];
        
        int result = fibonacci(n-1) + fibonacci(n-2);
        dp[n] = result;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=0; i<MAX; i++) {
            dp[i] = -1;
        }
        
        while(t-->0) {
            int n = sc.nextInt();
            
            if(n == 0)
                System.out.println(1 + " " + 0);
            else if(n == 1)
                System.out.println(0 + " " + 1);
            else {
                fibonacci(n);
                System.out.println(dp[n-1] + " " + dp[n]);
            }
        }
    }
}
