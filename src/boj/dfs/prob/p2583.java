package boj.dfs.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2583 {

	static int asc[] = new int[5001];
    static int a[][];
    static int m;
    static int n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[n][m];
        int k = sc.nextInt();
        
        while(k-->0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for(int i=x1; i<x2; i++) {
                for(int j=y1; j<y2; j++) {
                    a[i][j] = 1;
                }
            }
        }
        
        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(a[i][j] == 0) {
                    asc[cnt] = dfs(i, j);
                    cnt++;
                }
            }
        }
        
        Arrays.sort(asc);
        System.out.println(cnt);
        for(int i=0; i<asc.length; i++) {
            if(asc[i] != 0)
                System.out.print(asc[i] + " ");
        }
        sc.close();
    }
    
    public static int dfs(int x, int y) {
        if(a[x][y] == 1)
            return 0;
        
        int cnt = 1;
        a[x][y] = 1;
        
        int mx[] = {1, 0, -1, 0};
        int my[] = {0, 1, 0, -1};
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            
            if(0 <= nx && nx < n && 0 <= ny && ny < m)
                cnt += dfs(nx, ny);
        }
        return cnt;
    }
}
