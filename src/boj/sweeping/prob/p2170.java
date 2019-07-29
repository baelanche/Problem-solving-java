package boj.sweeping.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2170 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Pair[] p = new Pair[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			p[i] = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(p);
		int sum = 0;
		int left = Integer.MIN_VALUE;
		int right = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(right < p[i].s) {
				sum += right - left;
				left = p[i].s;
				right = p[i].e;
			} else right = Math.max(right, p[i].e);
		}
		
		sum += right - left;
		System.out.println(sum);
	}
	
	static class Pair implements Comparable<Pair> {
		int s;
		int e;
		
		Pair(int s, int e) {
			this.s = s;
			this.e = e;
		}
		
		public int compareTo(Pair o) {
			if(this.s < o.s) return -1;
			else if(this.s == o.s) {
				if(this.e < o.e) return -1;
			}
			return 1;
		}
	}
}
