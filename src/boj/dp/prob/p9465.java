package boj.dp.prob;

import java.util.Scanner;

public class p9465 {

	public static int n;
	public static int[][] value;
	public static int[][] dp;
	
	public static int sticker(int row, int status) {
		if(row == n) return 0;
		if(dp[row][status] != -1) return dp[row][status];
		
		int result = sticker(row+1, 0);
		int one = 0;
		int two = 0;
		if(status != 1) one = sticker(row+1, 1) + value[1][row];
		if(status != 2) two = sticker(row+1, 2) + value[0][row];
		result = result > one ? result : one;
		result = result > two ? result : two;
		dp[row][status] = result;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			n = sc.nextInt();
			value = new int[2][n];
			dp = new int[n][3];
			for(int j=0; j<2; j++) {
				for(int k=0; k<n; k++) {
					value[j][k] = sc.nextInt();
				}
			}
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<3; k++) {
					dp[j][k] = -1;
				}
			}
			
			System.out.println(sticker(0, 0));
		}

	}

}
