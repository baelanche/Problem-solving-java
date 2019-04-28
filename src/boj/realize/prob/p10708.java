package boj.realize.prob;

import java.util.Scanner;

public class p10708 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int score[] = new int[n];
		int target[] = new int[m];
		for(int i=0; i<m; i++)
			target[i] = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(sc.nextInt() == target[i]) {
					score[j]++;
				} else {
					score[target[i]-1]++;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.println(score[i]);

	}

}
