package boj.dfs.prob;

import java.util.Scanner;

public class p1012 {

	static int mx[] = {-1, 0, 1, 0};
    static int my[] = {0, 1, 0, -1};
    static int a[][];
    static int m;
    static int n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            m = sc.nextInt();
            n = sc.nextInt();
            int k = sc.nextInt();
            
            a = new int[n][m];
            
            for(int i=0; i<k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                a[y][x] = 1;
            }
            
            int cnt = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(a[i][j] != 0) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
    
    public static void dfs(int x, int y) {
        if(a[x][y] == 0)
            return;
        
        a[x][y] = 0;
        
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            
            if(0 <= nx && nx < n && 0 <= ny && ny < m)
                dfs(nx, ny);
        }
    }
}
