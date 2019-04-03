package boj.dp.prob;

import java.util.Scanner;

public class p11052 {

	public static int compare(int a, int b) {
        return a > b ? a : b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int pack[] = new int[n+1];
        int dp[] = new int[1001];
        
        pack[0] = 0; dp[0] = 0;
        for(int i=1; i<=n; i++)
            pack[i] = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                dp[i] = compare(dp[i], dp[i-j] + pack[j]);
            }
        }
        
        System.out.println(dp[n]);
        sc.close();
    }
}
