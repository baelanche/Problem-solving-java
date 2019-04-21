package boj.math.prob;

import java.util.Scanner;

public class p1919 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alphaA = new int[26];
		int[] alphaB = new int[26];
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		
		for(int i=0; i<a.length; i++)
			alphaA[a[i] - 'a']++;
		for(int i=0; i<b.length; i++)
			alphaB[b[i] - 'a']++;

		int cnt = 0;
		for(int i=0; i<26; i++)
			cnt += Math.abs(alphaA[i] - alphaB[i]);
		
		System.out.println(cnt);
	}
}
