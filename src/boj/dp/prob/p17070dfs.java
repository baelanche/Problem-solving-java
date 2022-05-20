package boj.dp.prob;

import java.util.*;

import boj.dp.prob.p17070.Pair;

import java.io.*;

public class p17070dfs {
    
    static int n;
    static int a[][];
    static int ans = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        a = new int[n+1][n+1];
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        
        dfs(1, 2, 0);
        System.out.println(ans);
    }
    
    public static void dfs(int x, int y, int pos) {
    	if(x == n && y == n) {
    		ans++;
    		return;
    	}
    	
        if(pos == 0) {
        	if(y+1 <= n && a[x][y+1] == 0)
        		dfs(x, y+1, 0);
        	if(x+1 <= n && y+1 <= n && a[x+1][y] == 0 && a[x][y+1] == 0 && a[x+1][y+1] == 0)
        		dfs(x+1, y+1, 2);
        }
        
        if(pos == 1) {
        	if(x+1 <= n && a[x+1][y] == 0)
        		dfs(x+1, y, 1);
            if(x+1 <= n && y+1 <= n && a[x][y+1] == 0 && a[x+1][y] == 0 && a[x+1][y+1] == 0)
            	dfs(x+1, y+1, 2);
        }
        
        if(pos == 2) {
        	if(y+1 <= n && a[x][y+1] == 0)
        		dfs(x, y+1, 0);
            if(x+1 <= n && a[x+1][y] == 0)
            	dfs(x+1, y, 1);
            if(x+1 <= n && y+1 <= n && a[x][y+1] == 0 && a[x+1][y] == 0 && a[x+1][y+1] == 0)
            	dfs(x+1, y+1, 2);
        }
    }
    
}