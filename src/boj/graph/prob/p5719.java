import java.io.*;
import java.util.*;

public class p5719 {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) break;
            
            List<Pair> list[] = new ArrayList[N];
            for (int i=0; i<N; i++) {
                list[i] = new ArrayList<>();
            }
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            for (int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
            }
        }
    }
    /*
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
    */
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
