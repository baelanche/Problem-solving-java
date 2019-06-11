package boj.binary.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1920 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int b[] = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
            b[i] = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<m; i++) {
            int low = 0;
            int high = n;
            while(low + 1 < high) {
                int mid = (low + high)/2;
                if(b[i] > a[mid])
                    low = mid;
                else if(b[i] < a[mid])
                    high = mid;
                else {
                    low = mid;
                    break;
                }
            }
            bw.write(a[low] == b[i] ? 1 + "\n" : 0 + "\n");
        }
        bw.flush();
    }
}
