package boj.dp.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2748 {

	public static long dp[] = new long[91];
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != -1) return dp[n];
		
		long result = f(n-1) + f(n-2);
		dp[n] = result;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Arrays.fill(dp, -1);
		System.out.print(f(n));

	}

}
