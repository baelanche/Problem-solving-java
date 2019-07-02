package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1652 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<n; j++)
                a[i][j] = s.charAt(j) == '.' ? 0 : 1;
        }
        
        int vertical = 0;
        int horizental = 0;
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=0; j<n; j++) {
                if(a[i][j] == 0) cnt++;
                if(a[i][j] == 1) {
                    if(cnt > 1) vertical++;
                    cnt = 0;
                }
                if(j == n-1 && cnt > 1) vertical++;
            }
        }
        
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=0; j<n; j++) {
                if(a[j][i] == 0) cnt++;
                if(a[j][i] == 1) {
                    if(cnt > 1) horizental++;
                    cnt = 0;
                }
                if(j == n-1 && cnt > 1) horizental++;
            }
        }
        
        System.out.println(vertical + " " + horizental);
    }
}
