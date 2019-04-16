package boj.dp.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2749 {

	public static int dp[];
	
	public static int f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != -1) return dp[n];
		
		int result = f(n-1)%1000000 + f(n-2)%1000000;
		dp[n] = result;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextLong();
		dp = new int[100000000];
		
		Arrays.fill(dp, -1);
		//System.out.print(f(n)%1000000);

	}

}
