package boj.prefixsum.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10211 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            int psum[] = new int[n+1];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                int num = Integer.parseInt(st.nextToken());
                psum[i+1] = psum[i] + num;
            }
            
            int max = Integer.MIN_VALUE;
            for(int i=1; i<=n; i++)
                for(int j=i; j<=n; j++)
                    max = Math.max(max, psum[j] - psum[i-1]);
            System.out.println(max);
        }
    }
}
