package boj.math.prob;

import java.util.Scanner;

public class p9610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
		while(n-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x > 0 && y > 0)
				q1++;
			else if(x < 0 && y > 0)
				q2++;
			else if(x < 0 && y < 0)
				q3++;
			else if(x > 0 && y < 0)
				q4++;
			else
				axis++;
		}
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
	}
}
