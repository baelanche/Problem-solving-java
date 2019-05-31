package boj.greedy.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1946 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n+1];
            for(int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                a[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
            }
            int interview = a[1];
            int cnt = 1;
            for(int i=2; i<=n; i++) {
                if(a[i] < interview) {
                    interview = a[i];
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
            bw.flush();
        }
    }
}
