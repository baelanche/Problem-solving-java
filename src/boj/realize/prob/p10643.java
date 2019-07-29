package boj.realize.prob;

import java.util.Scanner;

public class p10643 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[8];
		for(int i=0; i<8; i++)
			a[i] = sc.nextInt();
		
		int max = 0;
		for(int i=0; i<8; i++) {
			int sum = 0;
			for(int j=i; j<i+4; j++)
				sum += a[j%8];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
