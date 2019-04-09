package boj.dfs.prob;

import java.util.Scanner;

public class p1743 {

	static int n;
    static int m;
    static int a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n+1][m+1];
        int k = sc.nextInt();
        
        int max = 0;
        while(k-->0)
            a[sc.nextInt()][sc.nextInt()] = 1;
        
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(a[i][j] == 1) {
                    int cnt = dfs(i, j);
                    if(max < cnt)
                        max = cnt;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
    
    public static int dfs(int x, int y) {
        if(a[x][y] == 0)
            return a[x][y];
        
        int cnt = 1;
        
        a[x][y] = 0;
        int mx[] = {-1, 0, 1, 0};
        int my[] = {0, 1, 0, -1};
        
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            
            if(0 <= nx && nx < n+1 && 0 <= ny && ny < m+1) {
                if(a[nx][ny] != 0) {
                    cnt += dfs(nx, ny);
                }
            }
        }
        return cnt;
    }
}
