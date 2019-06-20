package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p16234 {

	static int n;
    static int l;
    static int r;
    static int a[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static boolean b = true;
    static int cnt = -1;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        a = new int[n][n];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        
        while(b) {
            cnt++;
            b = false;
            allbfs();
        }
        
        System.out.println(cnt);
    }
    
    public static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<Pair>();
        Queue<Pair> score = new LinkedList<Pair>();
        visited[x][y] = true;
        q.offer(new Pair(x, y));
        
        int sum = 0;
        while(!q.isEmpty()) {
            Pair p = q.poll();
            score.offer(p);
            sum += a[p.x][p.y];
            for(int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                    int diff = Math.abs(a[p.x][p.y] - a[nx][ny]);
                    if(l <= diff && diff <= r && !visited[nx][ny]) {
                        q.offer(new Pair(nx, ny));
                        visited[nx][ny] = true;
                        b = true;
                    }
                }
            }
        }
        
        int size = score.size();
        
        while(!score.isEmpty()) {
            Pair p = score.poll();
            a[p.x][p.y] = (int)Math.floor(sum/size);
        }
    }
    
    public static void allbfs() {
        visited = new boolean[n][n];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(!visited[i][j])
                    bfs(i, j);
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
