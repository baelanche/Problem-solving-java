package boj.realize.prob;

import java.util.Scanner;

public class p17363 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		char a[][] = new char[n][m];
		for(int i=0; i<n; i++)
			a[i] = sc.next().toCharArray();
		
		for(int i=m-1; i>=0; i--) {
			for(int j=0; j<n; j++)
				System.out.print(filter(a[j][i]));
			System.out.println();
		}
	}
	
	public static char filter(char a) {
		if(a == '.') return '.';
		if(a == 'O') return 'O';
		if(a == '-') return '|';
		if(a == '|') return '-';
		if(a == '/') return '\\';
		if(a == '\\') return '/';
		if(a == '^') return '<';
		if(a == '<') return 'v';
		if(a == 'v') return '>';
		return '^';
	}
}
