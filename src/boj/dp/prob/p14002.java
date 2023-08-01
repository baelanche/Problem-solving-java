import java.io.*;
import java.util.*;

public class p14002 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int dp[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++) {
            dp[i] = 1;
            for(int j=0; j<i; j++) {
                if(a[i] > a[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        
        int max = Arrays.stream(dp).max().getAsInt();
        StringBuilder sb = new StringBuilder();
        for (int i=n-1; i>=0; i--) {
            if (dp[i] == max) {
                sb.insert(0, a[i] + " ");
                max--;
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
        System.out.println(sb.toString());
    }
}
