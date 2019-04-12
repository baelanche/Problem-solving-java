package boj.realize.prob;

import java.util.Scanner;

public class p10709 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		char c[][] = new char[h][w];
		int a[][] = new int[h][w];
		
		for(int i=0; i<h; i++) {
			c[i] = sc.next().toCharArray();
		}
		
		for(int i=0; i<h; i++) {
			int cnt = 0;
			boolean cloud = false;
			for(int j=0; j<w; j++) {
				if(c[i][j] == 'c') {
					a[i][j] = 0;
					cloud = true;
					cnt = 0;
				} else if(c[i][j] == '.' && !cloud) {
					a[i][j] = -1;
				} else if(c[i][j] == '.' && cloud) {
					a[i][j] = ++cnt;
				}
			}
		}
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
