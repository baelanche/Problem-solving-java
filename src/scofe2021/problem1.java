package scofe2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class problem1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String time[][] = new String[n][2];
		for(int i=0; i<n; i++) {
			String temp = br.readLine();
			time[i][0] = temp.substring(0, 2) + temp.substring(3, 5);
			time[i][1] = temp.substring(8, 10) + temp.substring(11, 13);
		}
		
		int prev = 0;
		int next = 2400;
		for(int i=0; i<n; i++) {
			int t1 = Integer.parseInt(time[i][0]);
			int t2 = Integer.parseInt(time[i][1]);
			prev = prev < t1 ? t1 : prev;
			next = next > t2 ? t2 : next;
		}
		
		if(prev > next) System.out.println(-1);
		else {
			String sprev = String.valueOf(prev);
			String snext = String.valueOf(next);
			while(sprev.length() < 4) {
				sprev = "0" + sprev; 
			}
			while(snext.length() < 4) {
				snext = "0" + snext; 
			}
			String p1 = sprev.substring(0, 2);
			String p2 = sprev.substring(2, 4);
			String p3 = snext.substring(0, 2);
			String p4 = snext.substring(2, 4);
			System.out.println(p1 + ":" + p2 + " ~ " + p3 + ":" + p4);
		}
	}
}
