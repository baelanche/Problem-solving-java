package boj.math.prob;

import java.util.Scanner;

public class p2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int prime[] = new int[10001];
		
		for(int i=2; i<10001; i++)
			prime[i] = i;
		
		for(int i=2; i<10001; i++) {
			for(int j=2; i*j<10001; j++) {
				prime[i*j] = 0;
			}
		}

		int sum = 0;
		int min = 0;
		
		for(int i=m; i<=n; i++) {
			sum += prime[i];
			if(min != 0) continue;
			min = prime[i];
		}
		
		if(sum == 0 && min == 0) System.out.println(-1);
		else System.out.println(sum + "\n" + min);
	}

}
