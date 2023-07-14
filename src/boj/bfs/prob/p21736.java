import java.util.*;
import java.io.*;

public class p21736 {
    
    static int n;
    static int m;
    static char a[][];
    static boolean visited[][];
    static int dx[] = {-1,  0, 1, 0};
    static int dy[] = { 0, -1, 0, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new char[n][m];
        visited = new boolean[n][m];
        
        int sx = 0;
        int sy = 0;
        
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            for (int j=0; j<m; j++) {
                a[i][j] = s.charAt(j);
                if (a[i][j] == 'I') {
                    sx = i;
                    sy = j;
                }
            }
        }
        
        int meet = bfs(sx, sy);
        System.out.println(meet > 0 ? meet : "TT");
    }
    
    public static int bfs(int x, int y) {
        int meet = 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (!visited[nx][ny] && a[nx][ny] != 'X') {
                        q.add(new Pair(nx, ny));
                        visited[nx][ny] = true;
                        if (a[nx][ny] == 'P') {
                            meet++;
                        }
                    }
                }
            }
        }
        
        return meet;
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
