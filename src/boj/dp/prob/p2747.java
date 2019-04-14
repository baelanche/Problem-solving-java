package boj.dp.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2747 {

	public static int dp[] = new int[46];
	
	public static int f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != -1) return dp[n];
		
		int result = f(n-1) + f(n-2);
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
