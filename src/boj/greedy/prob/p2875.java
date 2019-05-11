package boj.greedy.prob;

import java.util.Scanner;

public class p2875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=k; i>0; i--) {
			if(n/2 >= m) n--;
			else m--;
		}
		
		System.out.println(n/2 < m ? n/2 : m);
	}
}
