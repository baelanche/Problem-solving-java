package boj.realize.prob;

import java.util.Scanner;

public class p10539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int p[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		p[0] = a[0];
		int sum = p[0];
		for(int i=1; i<n; i++) {
			p[i] = a[i] * (i+1) - sum;
			sum += p[i];
		}
		
		for(int i=0; i<n; i++)
			System.out.print(p[i] + " ");
		sc.close();
	}
}
