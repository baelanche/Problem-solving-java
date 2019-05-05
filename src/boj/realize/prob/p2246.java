package boj.realize.prob;

import java.util.Scanner;

public class p2246 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			boolean ch = false;
			for(int j=0; j<n; j++) {
				if(i != j) {
					if(c[i][0] > c[j][0]) {
						if(c[i][1] >= c[j][1]) {
							ch = true;
							break;
						}
					} else if(c[i][1] > c[j][1]) {
						if(c[i][0] >= c[j][0]) {
							ch = true;
							break;
						}
					}
				}
			}
			if(!ch) cnt++;
		}
		System.out.println(cnt);
	}

}