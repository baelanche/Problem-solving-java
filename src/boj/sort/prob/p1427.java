package boj.sort.prob;

import java.util.Scanner;

public class p1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] n = sc.next().toCharArray();
		
		for(int i=0; i<n.length; i++) {
			for(int j=1; j<n.length; j++) {
				if(n[j-1] < n[j]) {
					char tmp = n[j-1];
					n[j-1] = n[j];
					n[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<n.length; i++)
			System.out.print(n[i]);
		sc.close();
	}
}
