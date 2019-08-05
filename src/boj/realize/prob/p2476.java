package boj.realize.prob;

import java.util.Scanner;

public class p2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		while(n-->0) {
			int dice[] = new int[7];
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			dice[a]++;
			dice[b]++;
			dice[c]++;
			int num = 0;
			int cnt = 0;
			for(int i=1; i<=6; i++)
				if(dice[i] >= cnt) {
					num = i;
					cnt = dice[i];
				}
			
			if(cnt == 3) max = Math.max(10000 + (num * 1000), max);
			if(cnt == 2) max = Math.max(1000 + (num * 100), max);
			if(cnt == 1) max = Math.max(num * 100, max);
		}
		System.out.println(max);
	}
}
