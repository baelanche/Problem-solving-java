import java.util.*;
import java.io.*;

public class p14940 {
    
    static int n;
    static int m;
    static int a[][];
    static int b[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 1,  0};
    static int dy[] = { 0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        b = new int[n][m];
        visited = new boolean[n][m];
        int sx = 0;
        int sy = 0;
        
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if (a[i][j] == 2) {
                    sx = i;
                    sy = j;
                }
            }
        }
        
        bfs(sx, sy);
        endup();
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                sb.append(b[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
    public static void bfs(int sx, int sy) {
        Queue<Pair> q = new LinkedList<Pair>();
        
        q.add(new Pair(sx, sy, 0));
        visited[sx][sy] = true;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (!visited[nx][ny] && a[nx][ny] != 0) {
                        q.add(new Pair(nx, ny, p.dist + 1));
                        visited[nx][ny] = true;
                        b[nx][ny] = p.dist + 1;
                    }
                }
            }
        }
    }
    
    public static void endup() {
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (a[i][j] == 1 && b[i][j] == 0) {
                    b[i][j] = -1;
                }
            }
        }
    }
    
    static class Pair {
        int x;
        int y;
        int dist;
        
        Pair(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
