package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p13423 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
            
            int cnt = 0;
            Arrays.sort(a);
            for(int i=0; i<n-2; i++) {
                int k = i+2;
                for(int j=i+1; j<n-1; j++) {
                    int ba = a[j] - a[i];
                    
                    while(k < n && a[k] - a[j] < ba) {
                        k++;
                    }
                    
                    if(k == n) break;
                    
                    if(a[k] - a[j] == ba) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
