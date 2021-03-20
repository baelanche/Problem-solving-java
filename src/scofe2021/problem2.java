package scofe2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//incompletion
public class problem2 {
	
	static int cnt = 0;
	static int n;
	static char a[];
	static int dp[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new char[n];
		dp = new int[n];
		a = br.readLine().toCharArray();
		dp(n-1);
		System.out.println(cnt);
	}
	
	static void dp(int idx) {
		if(idx == 0) {
			cnt++;
			return;
		}
		if(idx == -1) return;
		if(idx == -2) return;
		
	}
}
