package boj.realize.prob;

import java.util.Scanner;

public class p5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time[] = new int[18];
		for(int i=0; i<time.length; i++)
			time[i] = sc.nextInt();
		
		int m[] = new int[9];
		int jump = 3;
		for(int i=0; i<9; i++) {
			m[i] = time[i+jump] - time[i+jump-3];
			if(i==2||i==5) jump += 3;
		}
		
		for(int i=8; i>=1; i--) {
			if(m[i] < 0) {
				m[i] = 60 + m[i];
				m[i-1]--;
			}
		}
		
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
			if(i==2||i==5) System.out.println();
		}
		sc.close();
	}
}
