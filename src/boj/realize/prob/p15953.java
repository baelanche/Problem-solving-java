package boj.realize.prob;

import java.util.Scanner;

public class p15953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;
			if(a == 1)
				sum += 5000000;
			else if(a == 2 || a == 3)
				sum += 3000000;
			else if(a >= 4 && a <= 6)
				sum += 2000000;
			else if(a >= 7 && a <= 10)
				sum += 500000;
			else if(a >= 11 && a <= 15)
				sum += 300000;
			else if(a >= 16 && a <= 21)
				sum += 100000;
			else sum += 0;
			
			if(b == 1)
				sum += 5120000;
			else if(b == 2 || b == 3)
				sum += 2560000;
			else if(b >= 4 && b <= 7)
				sum += 1280000;
			else if(b >= 8 && b <= 15)
				sum += 640000;
			else if(b >= 16 && b <= 31)
				sum += 320000;
			else sum += 0;
			System.out.println(sum);
		}

	}

}
