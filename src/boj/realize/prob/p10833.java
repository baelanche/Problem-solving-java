package boj.realize.prob;

import java.util.Scanner;

public class p10833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			cnt += y%x;
		}
		
		System.out.println(cnt);
	}
}
