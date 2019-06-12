package boj.backtrac.prob;

import java.util.Scanner;

public class p1987 {

	static int R;
    static int C;
    static char a[][];
    static boolean alpha[] = new boolean[26];
    static boolean visited[][];
    static int dr[] = {-1, 1, 0, 0};
    static int dc[] = {0, 0, -1, 1};
    static int max = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        R = sc.nextInt();
        C = sc.nextInt();
        a = new char[R][C];
        visited = new boolean[R][C];
        for(int i=0; i<R; i++)
            a[i] = sc.next().toCharArray();
        
        alpha[a[0][0] - 'A'] = true;
        visited[0][0] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }
    
    public static void dfs(int r, int c, int cnt) {
        for(int i=0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(0 <= nr && nr < R && 0 <= nc && nc < C) {
                if(!visited[nr][nc] && !alpha[a[nr][nc] - 'A']) {
                    visited[nr][nc] = true;
                    alpha[a[nr][nc] - 'A'] = true;
                    dfs(nr, nc, cnt + 1);
                    visited[nr][nc] = false;
                    alpha[a[nr][nc] - 'A'] = false;
                }
            }
        }
        max = Math.max(max, cnt);
    }
}
