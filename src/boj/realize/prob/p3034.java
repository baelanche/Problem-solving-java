package boj.realize.prob;

import java.util.Scanner;

public class p3034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		while(n-->0) {
			int t = sc.nextInt();
			
			int box = (int)Math.sqrt(w*w + h*h);
			if(t <= box)
				System.out.println("DA");
			else System.out.println("NE");
		}
		sc.close();
	}

}
