package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p2589 {

	static int n;
    static int m;
    static int a[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 0, 1};
    static int dy[] = {0, -1, 1, 0};
    static int max = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++)
                a[i][j] = s.charAt(j) == 'W' ? 1 : 0;
        }
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                if(a[i][j] == 0) {
                    visited = new boolean[n][m];
                    bfs(i, j);
                }
        
        System.out.println(max);
    }
    
    public static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<Pair>();
        int distance[][] = new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                distance[i][j] = Integer.MAX_VALUE;
        
        q.offer(new Pair(x, y, 0));
        visited[x][y] = true;
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-->0) {
                Pair p = q.poll();
                distance[p.x][p.y] = Math.min(distance[p.x][p.y], p.d);
                max = Math.max(max, distance[p.x][p.y]);
                for(int i=0; i<4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];
                    if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                        if(a[nx][ny] == 0 && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            q.offer(new Pair(nx, ny, p.d + 1));
                        }
                    }
                }
            }
        }
    }
    
    static class Pair {
        int x;
        int y;
        int d;
        
        Pair(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}
