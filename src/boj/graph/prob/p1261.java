import java.io.*;
import java.util.*;

public class p1261 {
    
    static int N;
    static int M;
    static int a[][];
    static int dist[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[M][N];
        dist = new int[M][N];
        for (int i=0; i<M; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j=0; j<N; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }
        
        dijkstra();
        System.out.println(dist[M-1][N-1]);
    }
    
    public static void dijkstra() {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0, 0));
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            
            for (int i=0; i<4; i++) {
                int nx = curr.u + dx[i];
                int ny = curr.v + dy[i];
                if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                    if (dist[nx][ny] > dist[curr.u][curr.v] + a[nx][ny]) {
                        dist[nx][ny] = dist[curr.u][curr.v] + a[nx][ny];
                        pq.offer(new Pair(nx, ny, a[nx][ny]));
                    }
                }
            }
        }
    }
    
    static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int w;
        Pair (int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
        
        @Override
        public int compareTo(Pair n){
            return this.w - n.w;
        }
    }
}
