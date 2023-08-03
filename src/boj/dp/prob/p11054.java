import java.io.*;
import java.util.*;

public class p11054 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++) {
            dp1[i] = 1;
            for(int j=0; j<i; j++) {
                if(a[i] > a[j] && dp1[j] + 1 > dp1[i]) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }
        
        for(int i=n-1; i>=0; i--) {
            dp2[i] = 1;
            for(int j=n-1; j>i; j--) {
                if(a[i] > a[j] && dp2[j] + 1 > dp2[i]) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        
        int max = 0;
        for (int i=0; i<n; i++) {
            int sum = dp1[i] + dp2[i] - 1;
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
