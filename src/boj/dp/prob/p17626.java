package boj.dp.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p17626 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int[60000];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i=1; i<240; i++)
			dp[i*i] = 1;
		
		for(int i=2; i<=n; i++)
			for(int j=1; j*j<=i; j++)
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
		
		System.out.println(dp[n]);
	}
}
