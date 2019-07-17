package boj.dp.prob;

import java.util.Scanner;

public class p14585 {

	static boolean a[][];
    static int dp[][];
    
    public static int findCandy(int x, int y, int m) {
        if(x == 301 || y == 301) return 0;
        if(m == 0) return 0;
        if(dp[x][y] != -1) return dp[x][y];
        
        if(a[x][y]) dp[x][y] = m;
        else dp[x][y] = 0;
        dp[x][y] += Math.max(findCandy(x+1, y, m-1), findCandy(x, y+1, m-1));
        return dp[x][y];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        a = new boolean[301][301];
        dp = new int[301][301];
        for(int i=0; i<301; i++)
            for(int j=0; j<301; j++)
                dp[i][j] = -1;
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x][y] = true;
        }
        
        System.out.println(findCandy(0, 0, m));
    }
}
