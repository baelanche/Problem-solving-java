package boj.realize.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p10824 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();

		a = a+b;
		c = c+d;
		
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> bb = new ArrayList<Integer>();
		ArrayList<Integer> cc = new ArrayList<Integer>();
		
		for(int i=0; i<a.length(); i++)
			aa.add((int)a.charAt(i) - 48);
		for(int i=0; i<c.length(); i++)
			bb.add((int)c.charAt(i) - 48);

		while(aa.size() != bb.size()) {
			if(aa.size() < bb.size())
				aa.add(0, 0);
			else bb.add(0, 0);
		}

		for(int i=aa.size() - 1; i>=0; i--) {
			int tmp = aa.get(i) + bb.get(i);
			if(tmp > 9) {
				tmp = tmp - 10;
				if(i-1 < 0) {
					cc.add(0, tmp);
					cc.add(0, 1);
				} else {
					aa.set(i-1, aa.get(i-1) + 1);
					cc.add(0, tmp);
				}
			} else cc.add(0, tmp);
		}
		
		for(int i=0; i<cc.size(); i++)
			System.out.print(cc.get(i));
	}

}
