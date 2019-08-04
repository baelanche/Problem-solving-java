package boj.math.prob;

import java.util.Scanner;

public class p17362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i+=8)
			if(n == i) {
				System.out.println(1);
				return;
			}
		
		int k = 2;
		int idx = 0;
		while(k <= n) {
			if(n == k) {
				System.out.println(2);
				return;
			}
			if(idx == 0) {
				k += 6;
				idx = 1;
			} else {
				k += 2;
				idx = 0;
			}
		}
		
		for(int i=3; i<=n; i+=4)
			if(n == i) {
				System.out.println(3);
				return;
			}
		
		k = 4;
		idx = 0;
		while(k <= n) {
			if(n == k) {
				System.out.println(4);
				return;
			}
			if(idx == 0) {
				k += 2;
				idx = 1;
			} else {
				k += 6;
				idx = 0;
			}
		}
		
		for(int i=5; i<=n; i+=8)
			if(n == i) {
				System.out.println(5);
				return;
			}
	}
}
