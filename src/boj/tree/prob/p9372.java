package boj.tree.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9372 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken());
	    	int m = Integer.parseInt(st.nextToken());
        
            for (int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
		        int u = Integer.parseInt(st.nextToken());
		        int v = Integer.parseInt(st.nextToken());
            }
        
            System.out.println(n-1);
        }
	}
}
