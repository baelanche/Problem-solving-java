package boj.dp.prob;

import java.util.Scanner;

public class p2749 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		int p = 1500000;
		
		long dp[] = new long[p];
		
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2; i<p; i++) {
			if(n < i) break;
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] %= (long)Math.pow(10, 6);
		}

		if(n >= p) n %= p;
		System.out.println(dp[(int)n]);
	}

}
