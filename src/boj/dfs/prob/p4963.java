package boj.dfs.prob;

import java.util.Scanner;

public class p4963 {

	static int w;
    static int h;
    static int a[][];
    static boolean visited[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0) break;
            a = new int[h][w];
            visited = new boolean[h][w];
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int cnt = 0;
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(!visited[i][j] && a[i][j] == 1)
                        cnt += dfs(i, j);
                }
            }
            System.out.println(cnt);
        }
    }
    
    public static int dfs(int y, int x) {
        visited[y][x] = true;
        int dx[] = {-1, 0, 1, 1, 1, 0, -1, -1};
        int dy[] = {-1, -1, -1, 0, 1, 1, 1, 0};
        
        for(int i=0; i<8; i++) {
            int mx = x + dx[i];
            int my = y + dy[i];
            if(0 <= mx && mx < w && 0 <= my && my < h) {
                if(!visited[my][mx] && a[my][mx] == 1)
                    dfs(my, mx);
            }
        }
        return 1;
    }
}
