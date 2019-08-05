package boj.realize.prob;

import java.util.Scanner;

public class p2480 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
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
			
		if(cnt == 3) sum = 10000 + (num * 1000);
		if(cnt == 2) sum = 1000 + (num * 100);
		if(cnt == 1) sum = num * 100;
		System.out.println(sum);
	}
}
