package scofe2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//incompletion
public class problem3 {
	
	static int n;
	static char a[][];
	static int b[] = new int[50];
	static int ans = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new char[n][n];
		for(int i=0; i<n; i++) 
			a[i] = br.readLine().toCharArray();
		
		for(int i=1; i<=n; i++)
			check(i);
		
		//System.out.println(ans);
	}
	
	static void check(int size) {
		int cnt = 0;
		for(int i=0; i<n-size+1; i++) {
			for(int j=0; j<n-size+1; j++) {
				cnt += square(i, j, size);
			}
		}
		b[size] = cnt;
		System.out.println(cnt);
		ans += cnt;
	}
	
	static int square(int x, int y, int size) {
		for(int i=x; i<x+size-1; i++) {
			for(int j=y; j<y+size-1; j++) {
				if(a[i][j] == '0')
					return 0;
			}
		}
		return 1;
	}
}
