package boj.prefixsum.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11969 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int a[][] = new int[n][3];
        int psum[][] = new int[n+1][3];
        
        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine()) - 1;
            a[i][x]++;
            for(int j=0; j<3; j++)
                psum[i+1][j] = psum[i][j] + a[i][j];
        }
        
        for(int i=0; i<q; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            System.out.println((psum[e][0] - psum[s-1][0]) + " " + (psum[e][1] - psum[s-1][1]) + " " + (psum[e][2] - psum[s-1][2]));
        }
    }
}
