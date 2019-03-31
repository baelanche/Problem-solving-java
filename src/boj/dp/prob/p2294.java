package boj.dp.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p2294 {

	public static int N;
	public static int[] coin;
	public static int dp[][];
	public static final int OUT_OF_RANGE = 100000000;
	
	public static int f(int n, int k) {
		if(n == N) return (k==0 ? 0 : OUT_OF_RANGE);
		if(dp[n][k] != -1) return dp[n][k];
		
		int result = f(n+1, k);
		if(k >= coin[n]) {
			int min = f(n, k-coin[n]) + 1;
			result = result < min ? result : min;
		}
		dp[n][k] = result;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int k = sc.nextInt();
		coin = new int[N];
		dp = new int[N][k+1];
		
		for(int i=0; i<N; i++) {
			coin[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<k+1; j++) {
				dp[i][j] = -1;
			}
		}

		System.out.println(f(0, k));
	}

}
