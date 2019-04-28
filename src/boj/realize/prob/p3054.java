package boj.realize.prob;

import java.util.Scanner;

public class p3054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int len = (s.length() * 5) - (s.length() - 1);
		
		drawSideLine(len);
		drawInnerLine(len);
		drawMiddleLine(len, s);
		drawInnerLine(len);
		drawSideLine(len);
	}
	
	public static void drawSideLine(int len) {
		int sideLine = 0;
		for(int i=1; i<=len; i++) {
			if((i-3)%4==0) {
				sideLine++;
				if(sideLine == 3) {
					System.out.print("*");
					sideLine = 0;
					continue;
				}
				System.out.print("#");
				continue;
			}
			System.out.print(".");
		}
		System.out.println();
	}
	
	public static void drawInnerLine(int len) {
		int innerLine = 0;
		for(int i=1; i<=len; i++) {
			if(i%2==0) {
				innerLine++;
				if(innerLine >= 5) {
					System.out.print("*");
					if(innerLine == 6)
						innerLine = 0;
					continue;
				}
				System.out.print("#");
				continue;
			}
			System.out.print(".");
		}
		System.out.println();
	}
	
	public static void drawMiddleLine(int len, String s) {
		int k = 0;
		int str = 0;
		int condition = 3;
		int middleLine = 0;
		for(int i=1; i<=len; i++) {
			if(i%2!=0) {
				str++;
				if(str == 2) {
					System.out.print(s.charAt(k));
					k++;
					middleLine++;
					str = 0;
					continue;
				}
				if(condition <= s.length() && (middleLine == 2 || middleLine == 3)) {
					System.out.print("*");
					if(middleLine == 3) {
						middleLine = 0;
						condition += 3;
					}
					continue;
				}
				System.out.print("#");
				continue;
			}
			System.out.print(".");
		}
		System.out.println();
	}
}
