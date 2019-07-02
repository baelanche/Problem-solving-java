package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11944 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s = st.nextToken();
        int n = Integer.parseInt(s);
        int m = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append(s);
        
        if(s.length() * n > m) System.out.println(sb.toString().substring(0, m));
        else System.out.println(sb.toString());
    }
}
