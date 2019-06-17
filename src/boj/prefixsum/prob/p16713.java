package boj.prefixsum.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p16713 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int pxor[] = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            pxor[i+1] = pxor[i] ^ Integer.parseInt(st.nextToken());
        
        int result = 0;
        for(int i=0; i<q; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            result = result ^ (pxor[e] ^ pxor[s-1]);
        }
        System.out.println(result);
    }
}
