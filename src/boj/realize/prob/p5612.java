package boj.realize.prob;

import java.util.Scanner;

public class p5612 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int max = 0;
		while(n-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			m += a - b;
			if(m < 0) {
				max = 0;
				break;
			}
			max = max < m ? m : max;
		}
		System.out.println(max);
	}
}
