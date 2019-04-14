package boj.math.prob;

import java.util.Scanner;

public class p9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int prime[] = new int[n];
			for(int i=2; i<n; i++)
				prime[i] = i;
			
			for(int i=2; i<n; i++) {
				for(int j=2; i*j<n; j++) {
					prime[i*j] = 0;
				}
			}
			int a = 0;
			int b = 10000;
			for(int i=2; i<n; i++) {
				if(i >= n || a == b) break;
				for(int j=i; j<n; j++) {
					if(prime[i] + prime[j] > n) break;
					if(prime[i] + prime[j] == n) {
						if(b-a > prime[j] - prime[i] && prime[i] <= prime[j]) {
							a = prime[i]; b = prime[j];
						}
					}
				}
			}
			System.out.println(a + " " + b);
		}

	}

}
