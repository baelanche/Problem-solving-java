package boj.dp.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciMemoization {

	static ArrayList<Integer> dp;
	
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp.get(n) != -1) return dp.get(n);
		dp.set(n, fibonacci(n-2) + fibonacci(n-1));
		return dp.get(n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dp = new ArrayList<Integer>();
		for(int i=0; i<n+1; i++){
			dp.add(i, -1);
		}
		System.out.println(fibonacci(n));
	}

}
