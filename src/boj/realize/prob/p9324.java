package boj.realize.prob;

import java.util.Scanner;

public class p9324 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			String str = sc.next();
			char c[] = str.toCharArray();
			int alpha[] = new int[26];
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<c.length; i++) {
				sb.append(c[i]);
				if(++alpha[c[i] - 65] == 3) {
					sb.append(c[i]);
					alpha[c[i] - 65] = 0;
					i++;
				}
			}
			System.out.println(str.equals(sb.toString()) == true ? "OK" : "FAKE");
		}
	}
}
