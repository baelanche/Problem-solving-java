package boj.dp.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p14430 {

	static int n;
    static int m;
    static int a[][];
    static int dp[][];
    
    public static int f(int x, int y) {
        if(x < 1 || y < 1) return 0;
        if(dp[x][y] != -1) return dp[x][y];
        
        dp[x][y] = a[x][y];
        dp[x][y] += Math.max(f(x-1, y), f(x, y-1));
        return dp[x][y];
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        a = new int[n+1][m+1];
        dp = new int[n+1][m+1];
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=1; i<=n; i++)
            for(int j=1; j<=m; j++)
                dp[i][j] = -1;
        
        System.out.println(f(n, m));
    }
}
