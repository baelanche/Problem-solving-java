package project;

import java.util.*;

public class p16194 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int card[] = new int[n];
        int dp[] = new int[n+1];
        
        for (int i=0; i<n; i++) {
            card[i] = sc.nextInt();
        }
        
        for (int i=1; i<=n; i++) {
            dp[i] = card[i-1];
        }
        
        for (int i=2; i<=n; i++) {
            int l = 1;
            int r = i - 1;
            while (l <= r) {
                dp[i] = Math.min(dp[i], dp[l] + dp[r]);
                l++;
                r--;
            }
        }
        
        System.out.println(dp[n]);
    }

}
