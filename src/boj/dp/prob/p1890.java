package boj.dp.prob;

import java.util.Scanner;

public class p1890 {

	static int a[][];
    static long dp[][];
    static int n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n][n];
        dp = new long[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = sc.nextInt();
        
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                dp[i][j] = -1;
        
        System.out.println(recursive(0, 0));
    }
    
    public static long recursive(int x, int y) {
        if(x == n-1 && y == n-1) return 1;
        if(x >= n || y >= n) return 0;
        if(a[x][y] == 0) return 0;
        if(dp[x][y] != -1) return dp[x][y];
        
        int dist = a[x][y];
        long result = recursive(x+dist, y) + recursive(x, y+dist);
        dp[x][y] = result;
        return result;
    }
}
