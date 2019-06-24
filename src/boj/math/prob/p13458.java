package boj.math.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p13458 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        long sum = 0;
        for(int i=0; i<n; i++) {
            a[i] -= b;
            sum += 1;
            if(a[i] < 0) continue;
            sum += a[i]/c;
            sum = a[i]%c == 0 ? sum : sum+1;
        }
        System.out.println(sum);
    }
}
