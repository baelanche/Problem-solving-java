package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2636 {

	static int n;
    static int m;
    static int a[][];
    static int cheeze;
    static int prev[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int cnt = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n+2][m+2];
        prev = new int[n+2][m+2];
        
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if(a[i][j] == 1) cheeze++;
            }
        }
        
        dfs();
    }
    
    public static void dfs() {
        if(cheeze == 0) {
            int k = 0;
            for(int i=1; i<=n; i++)
                for(int j=1; j<=m; j++)
                    if(prev[i][j] == 1)
                        k++;
            
            System.out.println(cnt);
            System.out.println(k);
            return;
        }
        
        for(int i=1; i<=n; i++)
            for(int j=1; j<=m; j++)
                prev[i][j] = a[i][j];
        
        checkOutside();
        
        Queue<Pair> q = new LinkedList<Pair>();
        for(int i=1; i<=n; i++)
            for(int j=1; j<=m; j++)
                if(a[i][j] == 1)
                    if(a[i-1][j] == -1 || a[i+1][j] == -1 || a[i][j-1] == -1 || a[i][j+1] == -1) {
                        q.offer(new Pair(i, j));
                        cheeze--;
                    }
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            a[p.x][p.y] = -1;
        }
        
        for(int i=0; i<=n+1; i++)
            for(int j=0; j<=m+1; j++)
                if(a[i][j] == -1)
                    a[i][j] = 0;
        
        cnt++;
        dfs();
    }
    
    public static void checkOutside() {
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(0, 0));
        a[0][0] = -1;
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            for(int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(0 <= nx && nx <= n+1 && 0 <= ny && ny <= m+1) {
                    if(a[nx][ny] == 0) {
                        a[nx][ny] = -1;
                        q.offer(new Pair(nx, ny));
                    }
                }
            }
        }
    }
    
    static class Pair {
        int x;
        int y;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
