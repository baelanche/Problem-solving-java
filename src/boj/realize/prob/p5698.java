package boj.realize.prob;

import java.util.Scanner;

public class p5698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals("*")) break;
			
			String split[] = s.split(" ");
			boolean isYn = true;
			char head = split[0].toLowerCase().charAt(0);
			for(int i=1; i<split.length; i++)
				if(head != split[i].toLowerCase().charAt(0))
					isYn = false;
			
			System.out.println(isYn == true ? "Y" : "N");
		}
	}
}
