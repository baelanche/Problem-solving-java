package boj.dfs.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2667 {

	static int n;
    static int a[][];
    static int asc[] = new int[625];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n][n];
        
        for(int i=0; i<n; i++) {
            String binary = sc.next();
            for(int j=0; j<binary.length(); j++) {
                a[i][j] = (int)binary.charAt(j) - 48;
            }
        }
        
        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(a[i][j] == 1) {
                    asc[cnt] = dfs(i, j);
                    cnt++;
                }
            }
        }
        
        Arrays.sort(asc);
        System.out.println(cnt);
        for(int i=0; i<asc.length; i++)
            if(asc[i] != 0)
                System.out.println(asc[i]);
        
        sc.close();
    }
    
    public static int dfs(int x, int y) {
        if(a[x][y] == 0)
            return a[x][y];
        
        int cnt = 1;
        a[x][y] = 0;
        
        int mx[] = {1, 0, -1, 0};
        int my[] = {0, 1, 0, -1};
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            if(0 <= nx && nx < n && 0 <= ny && ny < n)
                if(a[nx][ny] == 1)
                    cnt += dfs(nx, ny);
        }
        return cnt;
    }
}
