package boj.realize.prob;

import java.util.Scanner;

public class p2810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = sc.next();
		String s2 = s;
		
		s2 = s2.replaceAll("S", "*S*");
		s2 = s2.replaceAll("LL", "*LL*");
		s2 = s2.replaceAll("\\*\\*", "*");
		
		int cnt = 0;
		for(int i=0; i<s2.length(); i++)
			if(s2.charAt(i) == '*')
				cnt++;
		System.out.println(s.length() < cnt ? s.length() : cnt);
	}
}
