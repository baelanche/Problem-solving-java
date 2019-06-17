package boj.prefixsum.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p16507 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int psum[][] = new int[r+1][c+1];
        for(int i=1; i<=r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=c; j++)
                psum[i][j] = psum[i-1][j] + psum[i][j-1] - psum[i-1][j-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<q; i++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            int cnt = ((r2 - r1) + 1) * ((c2 - c1) + 1);
            System.out.println((psum[r2][c2] - psum[r1-1][c2] - psum[r2][c1-1] + psum[r1-1][c1-1]) / cnt);
        }
    }
}
