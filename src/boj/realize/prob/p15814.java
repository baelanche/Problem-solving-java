package boj.realize.prob;

import java.util.Scanner;

public class p15814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char s[] = sc.next().toCharArray();
		int t = sc.nextInt();
		
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			char tmpa = s[a];
			s[a] = s[b];
			s[b] = tmpa;
			
		}
		
		System.out.println(s);

	}

}
