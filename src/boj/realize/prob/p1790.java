package boj.realize.prob;

import java.util.Scanner;

public class p1790 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		int ans = 0;
		long seq = 9;
		int word = 1;
		int sqrt = 1;
		long x = 0;
		while(true) {
			if(seq * word >= k) {
				k -= x;
				long num = sqrt + ((k-1) / word);
				String s = String.valueOf(num);
				if(num <= n)
					ans = s.charAt((int)(k-1) % word) - 48;
				else ans = -1;
				break;
			}
			x += seq * word;
			seq *= 10;
			word++;
			sqrt *= 10;
		}
		System.out.println(ans);
	}
}
