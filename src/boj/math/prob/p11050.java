package boj.math.prob;

import java.util.Scanner;

public class p11050 {

	public static int factorial(int n) {
		if(n == 0) return 1;
		
		int result = 1;
		for(int i=1; i<=n; i++)
			result *= i;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(factorial(n) / (factorial(k) * factorial(n-k)));

	}

}
