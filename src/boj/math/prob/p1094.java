package boj.math.prob;

import java.util.Scanner;

public class p1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int length[] = {64, 32, 16, 8, 4, 2, 1};
		int cnt = 0;
		for(int i=0; i<length.length; i++) {
			if(x >= length[i]) {
				x -= length[i];
				cnt++;
			}
			if(x == 0) {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
