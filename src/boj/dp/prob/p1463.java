package boj.dp.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p1463 {

	public static ArrayList<Integer> dp = new ArrayList<Integer>();
	
	public static int makeOne(int n) {
		if(n == 1) return 0;
		if(dp.get(n) != -1) return dp.get(n);
		
		int result = makeOne(n-1) + 1;
		if(n%3 == 0) {
			int divide3 = makeOne(n/3) + 1;
			result = result < divide3 ? result : divide3;
		}
		if(n%2 == 0) {
			int divide2 = makeOne(n/2) + 1;
			result = result < divide2 ? result : divide2;
		}
		dp.set(n, result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/* 최소 횟수를 구하는 함수
		 * f(n) = min {
		 * 	f(1) = 1
		 * 	f(n/3)+1
		 * 	f(n/2)+1
		 *  f(n-1)+1
		 */

		for(int i=0; i<n+1; i++)
			dp.add(-1);
		System.out.println(makeOne(n));
	}

}
