import java.io.*;
import java.util.*;

public class p1504 {
    
    static int N;
    static List<Pair> list[];
    static int dist[];
    static int INF = 200000000;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[N];
        
        for (int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Pair(v, w));
            list[v].add(new Pair(u, w));
        }
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()) - 1;
        int e = Integer.parseInt(st.nextToken()) - 1;
        
        long ret1 = dijkstra(0, s) + dijkstra(s, e) + dijkstra(e, N - 1);
        long ret2 = dijkstra(0, e) + dijkstra(e, s) + dijkstra(s, N - 1);
        
        if (ret1 >= INF && ret2 >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(Math.min(ret1, ret2));
        }
    }
    
    public static int dijkstra(int s, int e) {
        dist = new int[N];
        Arrays.fill(dist, INF);
        dist[s] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(s, 0));
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            
            if (curr.w > dist[curr.v]) continue;
            
            for (int i=0; i<list[curr.v].size(); i++) {
                Pair next = list[curr.v].get(i);
                if (dist[next.v] > curr.w + next.w) {
                    dist[next.v] = curr.w + next.w;
                    pq.offer(new Pair(next.v, dist[next.v]));
                }
            }
        }
        return dist[e];
    }
    
    static class Pair implements Comparable<Pair> {
        int v;
        int w;
        Pair (int v, int w) {
            this.v = v;
            this.w = w;
        }
        
        @Override
        public int compareTo(Pair n){
            return this.w - n.w;
        }
    }
}
