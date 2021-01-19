package boj.realize.prob;

import java.util.Scanner;

public class p10102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		sc.nextLine();
		String ab = sc.nextLine();
		
		int a = 0, b = 0;
		for(int i=0; i<ab.length(); i++) {
			if(ab.charAt(i) == 'A')
				a++;
			else b++;
		}
		
		if(a > b)
			System.out.println("A");
		else if(a < b)
			System.out.println("B");
		else
			System.out.println("Tie");
	}
}
