package boj.math.prob;

import java.util.Scanner;

public class p11758 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		float m1 = (float)(y2-y1)/(x2-x1);
		float m2 = (float)(y3-y2)/(x3-x2);
		
		System.out.println(m1 + " " + m2);
	}
}
