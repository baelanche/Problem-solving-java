package boj.dp.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciBottomUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> dp = new ArrayList<Integer>(n+1);
		for(int i=0; i<n+1; i++) {
			dp.add(0);
		}
		
		dp.set(1, 1);
		
		for(int i=2; i<=n; i++) {
			dp.set(i, dp.get(i-2) + dp.get(i-1));
		}
		System.out.println(dp.get(n));

	}

}
