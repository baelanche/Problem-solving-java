package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p14503 {

	static int n;
    static int m;
    static int a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                a[i][j] = sc.nextInt();
        
        System.out.println(bfs(r, c, d));
    }
    
    //(r, c):谅钎, d:规氢(0-合, 1-悼, 2-巢, 3-辑)
    public static int bfs(int r, int c, int d) {
        Queue<Pair> q = new LinkedList<Pair>();
        boolean visited[][] = new boolean[n][m];
        
        int dn[] = {0, -1, 0, 1};
        int dm[] = {-1, 0, 1, 0};
        
        q.offer(new Pair(r, c, d));
        visited[r][c] = true; //没家
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int pr = p.r;
            int pc = p.c;
            int pd = p.d;
            
            boolean clean = false;
            for(int i=0; i<4; i++) {
                int nr = pr + dn[pd];
                int nc = pc + dm[pd];
                int nd = pd - 1;
                nd = nd < 0 ? 3 : nd;
                if(0 <= nr && nr < n && 0 <= nc && nc < m) {
                    if(a[nr][nc] == 0 && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        q.offer(new Pair(nr, nc, nd));
                        clean = true;
                        break;
                    } else {
                        pd--;
                        pd = pd < 0 ? 3 : pd;
                    }
                }
            }
            if(!clean) {
                int br[] = {1, 0, -1, 0};
                int bc[] = {0, -1, 0, 1};
                int nr = pr + br[pd];
                int nc = pc + bc[pd];
                if(0 <= nr && nr < n && 0 <= nc && nc < m) {
                    if(a[nr][nc] != 1)
                        q.offer(new Pair(nr, nc, pd));
                } else break;
            }
        }
        
        int cnt = 0;
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                if(visited[i][j])
                    cnt++;
        return cnt;
    }
    
    static class Pair {
        int r;
        int c;
        int d;
        
        Pair(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }
}
