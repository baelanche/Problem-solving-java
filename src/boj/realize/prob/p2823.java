package boj.realize.prob;

import java.util.Scanner;

public class p2823 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		char a[][] = new char[r][c];
		
		for(int i=0; i<r; i++)
			a[i] = sc.next().toCharArray();
		
		int dx[] = {0, 1, 0, -1};
		int dy[] = {1, 0, -1, 0};
		
		int ans = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				int cnt = 0;
				if(a[i][j] == '.') {
					for(int k=0; k<4; k++) {
						int x = i + dx[k];
						int y = j + dy[k];
						if(0 <= x && x < r && 0 <= y && y < c) {
						if(a[x][y] == 'X')
							cnt++;
						} else cnt++;
						if(cnt >= 3) {
							ans = 1;
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
