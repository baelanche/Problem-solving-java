package boj.dp.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int dp[] = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		dp[4] = 7;
		for(int i=5; i<11; i++) 
			dp[i] = dp[i-1] + dp[i-1] - dp[i-4];
		
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n]);
		}
	}
}
