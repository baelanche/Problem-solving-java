package boj.backtrac.prob;

import java.util.Scanner;

public class p11578 {

	static int n;
    static int m;
    static int a[][];
    static boolean visited[];
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[11][11];
        visited = new boolean[11];
        
        for(int i=1; i<=m; i++) {
            int o = sc.nextInt();
            while(o-->0) {
                a[i][sc.nextInt()] = 1;
            }
        }
        
        backTracking(0, 1);
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
    
    public static void backTracking(int cnt, int idx) {
        if(idx == m+1) {
            boolean clear = true;
            for(int i=1; i<=n; i++)
                if(!visited[i])
                    clear = false;
            
            if(clear) {
                min = Math.min(min, cnt);
            }
            return;
        }
        
        for(int i=idx; i<=m; i++) {
            boolean prev[] = new boolean[n+1];
            for(int j=0; j<=n; j++)
                prev[j] = visited[j];
            
            for(int j=1; j<=n; j++)
                if(a[i][j] == 1) visited[j] = true;
            
            backTracking(cnt+1, i+1);
            
            for(int j=1; j<=n; j++)
                if(!prev[j]) visited[j] = false;
            
            backTracking(cnt, i+1);
        }
    }
}
