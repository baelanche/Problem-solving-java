package boj.realize.prob;

import java.util.Scanner;

public class p5212 {

	static int r;
	static int c;
	static char[][] a;
	static char[][] b;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		c = sc.nextInt();
		a = new char[r+2][c+2];
		b = new char[r+2][c+2];
		
		//배열 초기화
		for(int i=0; i<r+2; i++) {
			for(int j=0; j<c+2; j++) {
				a[i][j] = '.';
			}
		}
		
		//스캔
		for(int i=1; i<r+1; i++) {
			String str = sc.next();
			for(int j=1; j<c+1; j++) {
				a[i][j] = str.charAt(j-1);
			}
		}
		
		//복사
		for(int i=0; i<r+2; i++) {
			for(int j=0; j<c+2; j++) {
				b[i][j] = a[i][j];
			}
		}
		
		//탐색
		for(int i=1; i<r+1; i++) {
			for(int j=1; j<c+1; j++) {
				dfs(i, j);
			}
		}

		int startRow = 0;
		int endRow = 0;
		int startColumn = 0;
		int endColumn = 0;
		for(int i=0; i<r+2; i++) {
			for(int j=0; j<c+2; j++) {
				if(b[i][j] == 'X' && startRow == 0) startRow = i;
				if(b[i][j] == 'X') {
					if(endRow < i)
						endRow = i;
				}
			}
		}
		
		for(int i=0; i<c+2; i++) {
			for(int j=0; j<r+2; j++) {
				if(b[j][i] == 'X' && startColumn == 0) startColumn = i;
				if(b[j][i] == 'X') {
					if(endColumn < i)
						endColumn = i;
				}
			}
		}

		for(int i=startRow; i<=endRow; i++) {
			for(int j=startColumn; j<=endColumn; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public static void dfs(int x, int y) {
		if(a[x][y] == '.') return;
		
		int cnt = 0;
		if(a[x-1][y] == '.') cnt++;
		if(a[x][y-1] == '.') cnt++;
		if(a[x][y+1] == '.') cnt++;
		if(a[x+1][y] == '.') cnt++;
		
		if(cnt >= 3)
			b[x][y] = '.';
	}
}
