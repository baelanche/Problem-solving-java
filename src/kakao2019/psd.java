package kakao2019;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class psd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int answer = Integer.MAX_VALUE;
        
		for(int i=0; i<s.length(); i++) {
			StringBuilder ans = new StringBuilder();
			String prev = s.substring(0, i+1);
			int idx = 0;
			for(int j=0; true; j+=i+1) {
				if(j + i + 1 > s.length()) {
					if(j > s.length()) break;
					ans.append(s.substring(j, s.length()));
					break;
				}
				if(s.substring(j, j+i+1).equals(prev)) idx++;
				else {
					if(idx != 1) {
						ans.append(idx);
						idx = 1;
					}
					ans.append(prev);
					prev = s.substring(j, j+i+1);
				}
			}
			if(idx != 1) ans.append(idx);
			ans.append(prev);
			System.out.println(ans);
			answer = Math.min(answer, ans.length());
		}
		
        System.out.println(answer);
	}

}
