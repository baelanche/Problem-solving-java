package boj.greedy.prob;

import java.util.Scanner;

public class p1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int min = 51;
		for(int i=0; i<b.length()-a.length()+1; i++) {
			int cnt = 0;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j) != b.charAt(j + i))
					cnt++;
			}
			if(min > cnt) min = cnt;
		}
		System.out.println(min);
	}
}
