package boj.realize.prob;

import java.util.Scanner;

public class p10040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int game[][] = new int[n][n];
		int cost[] = new int[m];
		for(int i=0; i<n; i++) game[i][0] = sc.nextInt();
		for(int i=0; i<m; i++) cost[i] = sc.nextInt();
		
		int idx = 0;
		int max = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(game[j][0] <= cost[i]) {
					if(max < ++game[j][1]) {
						max = game[j][1];
						idx = j+1;
					}
					break;
				}
			}
		}
		System.out.println(idx);
	}
}
